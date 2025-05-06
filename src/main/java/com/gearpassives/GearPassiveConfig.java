package com.gearpassives;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("gearpassivetooltips")
public interface GearPassiveConfig extends Config
{
	@ConfigItem(
		keyName = "showDiaryGearPassiveTooltips",
		name = "Show diary gear passives on tooltip",
		description = "Passives for diary gear should show on the tooltip",
		position = 1
	)
	default boolean showDiaryGearPassiveTooltips()
	{
		return true;
	}
}
