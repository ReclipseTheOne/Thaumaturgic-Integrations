package com.reclipse.thaumaturgicintegrations;

import com.reclipse.thaumaturgicintegrations.registry.TIBlockEntities;
import com.reclipse.thaumaturgicintegrations.registry.TIBlocks;
import com.reclipse.thaumaturgicintegrations.registry.TICreativeTabs;
import com.reclipse.thaumaturgicintegrations.registry.TIDataComponents;
import com.reclipse.thaumaturgicintegrations.registry.TIItems;
import com.reclipse.thaumaturgicintegrations.registry.TIMenus;
import com.reclipse.thaumaturgicintegrations.registry.TIRecipeSerializers;
import com.reclipse.thaumaturgicintegrations.registry.TIRecipeTypes;
import com.reclipse.thaumaturgicintegrations.registry.TISounds;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(TIIds.MODID)
public final class ThaumaturgicIntegrations {
    public static final Logger LOGGER = LoggerFactory.getLogger(TIIds.MODID);

    public ThaumaturgicIntegrations(IEventBus modBus) {
        TIBlocks.register(modBus);
        TIItems.register(modBus);
        TIBlockEntities.register(modBus);
        TIMenus.register(modBus);
        TIRecipeTypes.register(modBus);
        TIRecipeSerializers.register(modBus);
        TIDataComponents.register(modBus);
        TICreativeTabs.register(modBus);
        TISounds.register(modBus);
    }

    public static boolean isBotaniaLoaded() {
        return ModList.get().isLoaded("botania");
    }

    public static boolean isThaumaturgeLoaded() {
        return ModList.get().isLoaded("thaumaturge");
    }

    public static boolean isAstralLoaded() {
        return ModList.get().isLoaded("astralsorcery");
    }

    public static boolean isNeoVitaeLoaded() {
        return ModList.get().isLoaded("neovitae");
    }

    public static boolean isArsLoaded() {
        return ModList.get().isLoaded("ars_nouveau");
    }
}
