package com.reclipse.thaumaturgicintegrations.registry;

import com.reclipse.thaumaturgicintegrations.TIIds;
import java.util.function.BiFunction;
import net.minecraft.core.Holder;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class TIItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TIIds.MODID);

    private TIItems() {}

    public static void register(IEventBus modBus) {
        ITEMS.register(modBus);
    }

    public static <T extends BlockItem> DeferredItem<T> registerSimpleBlockItem(
            Holder<Block> block, BiFunction<Block, Item.Properties, T> constructor) {
        return ITEMS.registerItem(
                block.unwrapKey().orElseThrow().location().getPath(),
                properties -> constructor.apply(block.value(), properties),
                new Item.Properties());
    }

    public static DeferredItem<Item> registerChunk(String id) {
        return ITEMS.registerItem(
                id,
                properties -> new Item(properties.food(new FoodProperties.Builder()
                        .nutrition(1)
                        .saturationModifier(0.3F)
                        .fast()
                        .build())));
    }
}
