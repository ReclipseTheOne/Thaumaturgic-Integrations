package com.reclipse.thaumaturgicintegrations;

import net.minecraft.resources.ResourceLocation;

public final class TIIds {
    public static final String MODID = "thaumaturgicintegrations";
    public static final String THAUMATURGE = "thaumaturge";
    public static final String ASTRAL_SORCERY = "astralsorcery";
    public static final String BOTANIA = "botania";
    public static final String OCCULTISM = "occultism";
    public static final String NEO_VITAE = "neovitae";

    private TIIds() {}

    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
