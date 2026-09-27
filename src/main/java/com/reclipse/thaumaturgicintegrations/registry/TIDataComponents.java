package com.reclipse.thaumaturgicintegrations.registry;

import com.reclipse.thaumaturgicintegrations.TIIds;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class TIDataComponents {
    public static final DeferredRegister.DataComponents DATA_COMPONENTS =
            DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, TIIds.MODID);

    private TIDataComponents() {}

    public static void register(IEventBus modBus) {
        DATA_COMPONENTS.register(modBus);
    }
}
