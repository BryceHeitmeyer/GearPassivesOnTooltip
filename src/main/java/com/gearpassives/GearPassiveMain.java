package com.gearpassives;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.BeforeRender;
import net.runelite.api.gameval.InterfaceID;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;
import net.runelite.client.util.ColorUtil;

import java.awt.*;
import java.util.Arrays;

@Slf4j
@PluginDescriptor(
	name = "Gear Passive Tooltips",
	description = "Shows any passive effects gear has in the tooltips",
	tags = {"gear","passive","tooltip"},
	enabledByDefault = false)

public class GearPassiveMain extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private GearPassiveConfig config;

	@Inject
	private TooltipManager tooltipManager;

	@Inject
	private ItemManager itemManager;

	@Override
	protected void startUp()
	{
	}

	@Override
	protected void shutDown()
	{
	}

	@Provides
	GearPassiveConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GearPassiveConfig.class);
	}

	@Subscribe
	public void onBeforeRender(BeforeRender event)
	{
		if (client.isMenuOpen())
			return;

		final MenuEntry[] menu = client.getMenuEntries();
		final int last = menu.length - 1;

		if (last < 0) return;

		final MenuEntry menuEntry = menu[last];
		final Widget widget = menuEntry.getWidget();

		if (widget == null) return;

		final int group = WidgetUtil.componentToInterface(widget.getId());

		if (group == InterfaceID.INVENTORY
			|| group == InterfaceID.BANKMAIN
			|| group == InterfaceID.BANKSIDE)
		{
			final String text = createTextString(widget);

			if (text != null)
			{
				tooltipManager.add(new Tooltip(ColorUtil.prependColorTag(text, new Color(238, 238, 238))));
			}
		}
	}

	private String createTextString(Widget widget)
	{
		int itemID = widget.getItemId();
		GearPassives gearPassive = findGearPassives(itemID);

		if (gearPassive == null || gearPassive.passives.length == 0) return null;

		if (gearPassive.type == GearPassives.Type.DIARY && !config.showDiaryGearPassiveTooltips())
		{
			return null;
		}

		final StringBuilder sb = new StringBuilder();

		for (String passives : gearPassive.passives)
		{
			sb.append(passives).append("</br>");
		}

		return sb.toString();
	}

	private GearPassives findGearPassives(final int itemID)
	{
		final int realItemId = itemManager.canonicalize(itemID);
		return GearPassives.get(realItemId);
	}
}