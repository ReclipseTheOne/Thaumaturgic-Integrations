package com.reclipse.thaumaturgicintegrations.registry;

import com.reclipse.thaumaturgicintegrations.TIIds;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class TISounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(Registries.SOUND_EVENT, TIIds.MODID);

    private TISounds() {}

    public static DeferredHolder<SoundEvent, SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(TIIds.rl(name)));
    }

    public static void register(IEventBus modBus) {
        SOUNDS.register(modBus);
    }
}
