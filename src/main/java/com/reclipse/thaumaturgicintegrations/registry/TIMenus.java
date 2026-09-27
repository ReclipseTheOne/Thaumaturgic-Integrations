package com.reclipse.thaumaturgicintegrations.registry;

import com.reclipse.thaumaturgicintegrations.TIIds;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class TIMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, TIIds.MODID);

    private TIMenus() {}

    public static void register(IEventBus modBus) {
        MENUS.register(modBus);
    }
}
