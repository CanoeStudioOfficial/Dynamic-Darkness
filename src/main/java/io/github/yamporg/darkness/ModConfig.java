package io.github.yamporg.darkness;

import net.minecraftforge.common.config.Config;

@Config(modid = ModContainer.MOD_ID, category = "main")
public final class ModConfig {
    public static boolean disableConfigGui = false;

    public static boolean darkOverworld = true;
    public static boolean darkNether = true;
    public static boolean darkEnd = true;
    public static boolean darkDefault = true;
    public static boolean darkSkyless = true;

    public static boolean darkNetherFog = true;
    public static boolean darkEndFog = true;

    public static boolean hardcore = false;
    public static float[] moonPhaseFactors = {};

    public static boolean invertBlacklist = false;
    public static int[] blacklistByID = {};
    public static String[] blacklistByName = {};

    public static final MinimumDarkness minDarkness = new MinimumDarkness();

    public static final class MinimumDarkness {
        @Config.Comment("Default minimum darkness level (0-15).")
        @Config.RangeInt(min = 0, max = 15)
        public int defaultMin = 0;

        @Config.Comment("Minimum darkness level by dimension ID. Format: 'ID:Level' (e.g. '0:5')")
        public String[] byID = {};

        @Config.Comment("Minimum darkness level by dimension name. Format: 'Name:Level' (e.g. 'overworld:5')")
        public String[] byName = {};
    }
}
