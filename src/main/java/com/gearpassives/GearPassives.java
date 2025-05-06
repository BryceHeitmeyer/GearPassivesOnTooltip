package com.gearpassives;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import net.runelite.api.gameval.ItemID;

import java.util.Map;
import java.util.function.Predicate;

enum GearPassives
{
    //Diary Rewards
    ARDY_CAPE_EASY(Type.DIARY, ItemID.ARDY_CAPE_EASY,
            "Unlimited teleports to the Ardougne Monastery"),
    ARDY_CAPE_MEDIUM(Type.DIARY, ItemID.ARDY_CAPE_MEDIUM,
            "Unlimited teleports to the Ardougne Monastery",
            "Three daily teleports to the Ardougne farm patch"),
    ARDY_CAPE_HARD(Type.DIARY, ItemID.ARDY_CAPE_HARD,
            "Unlimited teleports to the Ardougne Monastery",
            "Five daily teleports to the Ardougne farm patch"),
    ARDY_CAPE_ELITE(Type.DIARY, ItemID.ARDY_CAPE_ELITE,
            "Unlimited teleports to the Ardougne Monastery",
            "Unlimited teleports to Ardougne farm patch"),

    DESERT_AMULET_EASY(Type.DIARY, ItemID.DESERT_AMULET_EASY),
    DESERT_AMULET_MEDIUM(Type.DIARY, ItemID.DESERT_AMULET_MEDIUM,
            "One daily teleport to Nardah"),
    DESERT_AMULET_HARD(Type.DIARY, ItemID.DESERT_AMULET_HARD,
            "One daily teleport to Nardah"),
    DESERT_AMULET_ELITE(Type.DIARY, ItemID.DESERT_AMULET_ELITE,
            "Unlimited teleports to Nardah and Kalphite Cave",
            "WORN: Protection from the desert heat effect"),

    FALADOR_SHIELD_EASY(Type.DIARY, ItemID.FALADOR_SHIELD_EASY,
            "25% prayer restore once daily"),
    FALADOR_SHIELD_MEDIUM(Type.DIARY, ItemID.FALADOR_SHIELD_MEDIUM,
            "50% prayer restore once daily"),
    FALADOR_SHIELD_HARD(Type.DIARY, ItemID.FALADOR_SHIELD_HARD,
            "100% prayer restore once daily",
            "Indicator to the Giant Mole while inside its lair"),
    FALADOR_SHIELD_ELITE(Type.DIARY, ItemID.FALADOR_SHIELD_ELITE,
            "100% prayer recharge twice a day",
            "Indicator to the Giant Mole while inside its lair"),

    FREMENNIK_BOOTS_EASY(Type.DIARY, ItemID.FREMENNIK_BOOTS_EASY,
            "One daily teleport to Rellekka"),
    FREMENNIK_BOOTS_MEDIUM(Type.DIARY, ItemID.FREMENNIK_BOOTS_MEDIUM,
            "One daily teleport to Rellekka"),
    FREMENNIK_BOOTS_HARD(Type.DIARY, ItemID.FREMENNIK_BOOTS_HARD,
            "One daily teleport to Rellekka"),
    FREMENNIK_BOOTS_ELITE(Type.DIARY, ItemID.FREMENNIK_BOOTS_ELITE,
            "Unlimited teleports to Rellekka"),

    SEERS_HEADBAND_EASY(Type.DIARY, ItemID.SEERS_HEADBAND_EASY,
            "WORN: Doubled regular logs while cutting normal trees",
            "Functions as a light source"),
    SEERS_HEADBAND_MEDIUM(Type.DIARY, ItemID.SEERS_HEADBAND_MEDIUM,
            "WORN: Doubled regular logs while cutting normal trees",
            "Functions as a light source"),
    SEERS_HEADBAND_HARD(Type.DIARY, ItemID.SEERS_HEADBAND_HARD,
            "WORN: Doubled regular logs while cutting normal trees",
            "Functions as a light source",
            "One daily teleport to Sherlock"),
    SEERS_HEADBAND_ELITE(Type.DIARY, ItemID.SEERS_HEADBAND_ELITE,
            "WORN: Doubled regular logs while cutting normal trees",
            "Functions as a light source",
            "Unlimited teleports to Sherlock"),

    ATJUN_GLOVES_EASY(Type.DIARY, ItemID.ATJUN_GLOVES_EASY,
            "WORN: Lowers price of items in Gabooty's store by 1/6 and the price of raw Karambwan at Tiadeche's stall",
            "WORN: Lowers buy price and raises the sell price at Davon's amulet store",
            "WORN: Lowers Tokkul cost of all items in Mor Ul Rek and increases sale price of all items to shop significantly"),
    ATJUN_GLOVES_MED(Type.DIARY, ItemID.ATJUN_GLOVES_MED,
            "WORN: Lowers price of items in Gabooty's store by 1/6 and the price of raw Karambwan at Tiadeche's stall",
            "WORN: Lowers buy price and raises the sell price at Davon's amulet store",
            "WORN: Lowers Tokkul cost of all items in Mor Ul Rek and increases sale price of all items to shop significantly",
            "WORN: 10% extra Agility experience from obstacles in the Brimhaven Agility Arena and when tickets are cashed in"),
    ATJUN_GLOVES_HARD(Type.DIARY, ItemID.ATJUN_GLOVES_HARD,
            "WORN: Lowers price of items in Gabooty's store by 1/6 and the price of raw Karambwan at Tiadeche's stall",
            "WORN: Lowers buy price and raises the sell price at Davon's amulet store",
            "WORN: Lowers Tokkul cost of all items in Mor Ul Rek and increases sale price of all items to shop significantly",
            "WORN: 10% extra Agility experience from obstacles in the Brimhaven Agility Arena and when tickets are cashed in",
            "WORN: Discounted prices at Karamja General Store and Jiminua's Jungle Store",
            "Unlimited teleportation to the underground portion of the Shilo Village mine"),
    ATJUN_GLOVES_ELITE(Type.DIARY, ItemID.ATJUN_GLOVES_ELITE,
            "WORN: Lowers price of items in Gabooty's store by 1/6 and the price of raw Karambwan at Tiadeche's stall",
            "WORN: Lowers buy price and raises the sell price at Davon's amulet store",
            "WORN: Lowers Tokkul cost of all items in Mor Ul Rek and increases sale price of all items to shop significantly",
            "WORN: 10% extra Agility experience from obstacles in the Brimhaven Agility Arena and when tickets are cashed in",
            "WORN: Discounted prices at Karamja General Store and Jiminua's Jungle Store",
            "Unlimited teleportation to the underground portion of the Shilo Village mine and to Duradel/Kuradal"),

    ZEAH_BLESSING_EASY(Type.DIARY, ItemID.ZEAH_BLESSING_EASY,
            "WORN: 2% chance to catch two fish at once, excluding Tempoross",
            "3 daily teleports to the Kourend Woodland"),
    ZEAH_BLESSING_MEDIUM(Type.DIARY, ItemID.ZEAH_BLESSING_MEDIUM,
            "WORN: 4% chance to catch two fish at once, excluding Tempoross",
            "5 daily teleports to the Kourend Woodland"),
    ZEAH_BLESSING_HARD(Type.DIARY, ItemID.ZEAH_BLESSING_HARD,
            "WORN: 6% chance to catch two fish at once, excluding Tempoross",
            "Unlimited teleports to the Kourend Woodland",
            "3 daily teleports to Mount Karuulm"),
    ZEAH_BLESSING_ELITE(Type.DIARY, ItemID.ZEAH_BLESSING_ELITE,
            "WORN: 8% chance to catch two fish at once, excluding Tempoross",
            "Unlimited teleports to the Kourend Woodland and Mount Karuulm"),

    LUMBRIDGE_RING_EASY(Type.DIARY, ItemID.LUMBRIDGE_RING_EASY,
            "50% run energy replenish 2 times a day",
            "Cast Low Level Alchemy without using any runes 30 times a day"),
    LUMBRIDGE_RING_MEDIUM(Type.DIARY, ItemID.LUMBRIDGE_RING_MEDIUM,
            "50% run energy replenish 3 times a day",
            "Cast Low Level Alchemy without using any runes 30 times a day",
            "Teleport to cabbage patch near Falador farm 3 times a day"),
    LUMBRIDGE_RING_HARD(Type.DIARY, ItemID.LUMBRIDGE_RING_HARD,
            "50% run energy replenish 4 times a day",
            "Cast Low Level Alchemy without using any runes 30 times a day",
            "Unlimited teleports to cabbage patch near Falador farm"),
    LUMBRIDGE_RING_ELITE(Type.DIARY, ItemID.LUMBRIDGE_RING_ELITE,
            "100% run energy replenishment 3 times per day",
            "Cast Low or High Level Alchemy without using any runes 30 times a day",
            "Unlimited teleports to cabbage patch near Falador farm"),

    MORYTANIA_LEGS_EASY(Type.DIARY, ItemID.MORYTANIA_LEGS_EASY,
            "2 daily teleports to the Slime pit beneath the Ectofuntus"),
    MORYTANIA_LEGS_MEDIUM(Type.DIARY, ItemID.MORYTANIA_LEGS_MEDIUM,
            "5 daily teleports to the Slime pit beneath the Ectofuntus",
            "WORN: Acts as a ghostspeak amulet"),
    MORYTANIA_LEGS_HARD(Type.DIARY, ItemID.MORYTANIA_LEGS_HARD,
            "5 daily teleports to the Slime pit beneath the Ectofuntus",
            "Unlimited teleports to Burgh de Rott",
            "WORN: Acts as a ghostspeak amulet"),
    MORYTANIA_LEGS_ELITE(Type.DIARY, ItemID.MORYTANIA_LEGS_ELITE,
            "Unlimited teleports to the Slime pit beneath the Ectofuntus",
            "Unlimited teleports to Burgh de Rott",
            "WORN: Acts as a ghostspeak amulet",
            "WORN: 100% blocks the attack that Ghasts use to turn food rotten"),

    VARROCK_ARMOUR_EASY(Type.DIARY, ItemID.VARROCK_ARMOUR_EASY,
            "WORN: 10% chance of mining 2 ores at once up to gold (with some exceptions)",
            "WORN: 10% chance of smelting 2 bars at once up to steel when using the Edgeville furnace"),
    VARROCK_ARMOUR_MEDIUM(Type.DIARY, ItemID.VARROCK_ARMOUR_MEDIUM,
            "WORN: 10% chance of mining 2 ores at once up to lovakite (with some exceptions)",
            "WORN: 10% chance of smelting 2 bars at once up to mithril when using the Edgeville furnace"),
    VARROCK_ARMOUR_HARD(Type.DIARY, ItemID.VARROCK_ARMOUR_HARD,
            "WORN: 10% chance of mining 2 ores at once up to adamantite (with some exceptions)",
            "WORN: 10% chance of smelting 2 bars at once up to adamantite when using the Edgeville furnace",
            "WORN: Enter the Cooks' Guild without a chef's hat or a cooking cape"),
    VARROCK_ARMOUR_ELITE(Type.DIARY, ItemID.VARROCK_ARMOUR_ELITE,
            "WORN: 10% chance of mining 2 ores at once of any ore (with some exceptions)",
            "WORN: 10% chance of smelting 2 bars at once of any bar when using the Edgeville furnace",
            "WORN: Enter the Cooks' Guild without a chef's hat or a cooking cape",
            "WORN: Acts as a prospector jacket in terms of XP bonus and master clue step"),

    WESTERN_BANNER_EASY(Type.DIARY, ItemID.WESTERN_BANNER_EASY),
    WESTERN_BANNER_MEDIUM(Type.DIARY, ItemID.WESTERN_BANNER_MEDIUM),
    WESTERN_BANNER_HARD(Type.DIARY, ItemID.WESTERN_BANNER_HARD,
            "One free daily teleport to the Piscatoris Fishing Colony"),
    WESTERN_BANNER_ELITE(Type.DIARY, ItemID.WESTERN_BANNER_ELITE,
            "Unlimited teleports to the Piscatoris Fishing Colony"),

    WILDERNESS_SWORD_EASY(Type.DIARY, ItemID.WILDERNESS_SWORD_EASY,
            "Always slashes webs successfully"),
    WILDERNESS_SWORD_MEDIUM(Type.DIARY, ItemID.WILDERNESS_SWORD_MEDIUM,
            "Always slashes webs successfully"),
    WILDERNESS_SWORD_HARD(Type.DIARY, ItemID.WILDERNESS_SWORD_HARD,
            "Always slashes webs successfully",
            "One daily teleport to the Fountain of Rune"),
    WILDERNESS_SWORD_ELITE(Type.DIARY, ItemID.WILDERNESS_SWORD_ELITE,
            "Always slashes webs successfully",
            "Unlimited teleports to the Fountain of Rune");

    final Type type;
    final int itemID;
    final String[] passives;

    GearPassives(Type type, int itemID, String... passives)
    {
        this.type = type;
        this.itemID = itemID;
        this.passives = passives;
    }

    private static final Map<Integer, GearPassives> gearPassives;

    static
    {
        ImmutableMap.Builder<Integer, GearPassives> builder = new ImmutableMap.Builder<>();

        for (GearPassives i : values())
        {
                builder.put(i.itemID, i);
        }

        gearPassives = builder.build();
    }

    static GearPassives get(int id)
    {
        return gearPassives.get(id);
    }

    @AllArgsConstructor
    enum Type
    {
        DIARY(GearPassiveConfig::showDiaryGearPassiveTooltips);

        final Predicate<GearPassiveConfig> enabled;
    }
}