package com.reclipse.thaumaturgicintegrations.registry;

import com.reclipse.thaumaturgicintegrations.TIIds;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class TIBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TIIds.MODID);

    private TIBlocks() {}

    public static void register(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    public static DeferredBlock<FlowerPotBlock> pottedPlant(String name, DeferredBlock<? extends Block> plant) {
        DeferredBlock<FlowerPotBlock> potted = BLOCKS.registerBlock(
                name,
                properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, plant, properties),
                BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING));
        FlowerPotBlock flowerPot = (FlowerPotBlock) Blocks.FLOWER_POT;
        flowerPot.addPlant(plant.getId(), potted);
        return potted;
    }

    public static BlockBehaviour.Properties pressPlaceholderProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(2.5F, 3600000.0F)
                .sound(SoundType.STONE)
                .noLootTable();
    }

    public static BlockBehaviour.Properties advancedFurnacePlaceholderProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .strength(2.5F, 3600000.0F)
                .sound(SoundType.METAL);
    }

    public static BlockBehaviour.Properties pedestalProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(2.0F, 17.5F)
                .sound(SoundType.STONE)
                .noOcclusion()
                .requiresCorrectToolForDrops();
    }

    public static BlockBehaviour.Properties pillarProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(2.0F, 17.5F)
                .sound(SoundType.STONE)
                .noOcclusion()
                .requiresCorrectToolForDrops();
    }

    public static BlockBehaviour.Properties amberProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_ORANGE)
                .strength(0.5F)
                .sound(SoundType.STONE)
                .noOcclusion()
                .isValidSpawn((state, level, pos, entityType) -> false)
                .isRedstoneConductor((state, level, pos) -> false)
                .isSuffocating((state, level, pos) -> false)
                .isViewBlocking((state, level, pos) -> false);
    }

    public static BlockBehaviour.Properties tubeProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .strength(0.5F, 5.0F)
                .sound(SoundType.METAL)
                .noOcclusion();
    }

    public static BlockBehaviour.Properties bannerProps(DyeColor dye) {
        BlockBehaviour.Properties props = BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.WOOD)
                .noOcclusion();
        return dye == null ? props.mapColor(MapColor.COLOR_RED) : props.mapColor(dye.getMapColor());
    }

    public static BlockBehaviour.Properties candleProps(DyeColor dye) {
        return BlockBehaviour.Properties.of()
                .mapColor(dye.getMapColor())
                .strength(0.1F)
                .sound(SoundType.WOOL)
                .lightLevel(state -> 14)
                .noOcclusion();
    }

    public static BlockBehaviour.Properties nitorProps(DyeColor dye) {
        return BlockBehaviour.Properties.of()
                .mapColor(dye.getMapColor())
                .strength(0.1F)
                .sound(SoundType.WOOL)
                .lightLevel(state -> 15)
                .noOcclusion()
                .noCollission()
                .pushReaction(PushReaction.DESTROY);
    }

    public static BlockBehaviour.Properties latticeProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .strength(0.5F, 5.0F)
                .sound(SoundType.METAL)
                .noOcclusion();
    }

    public static BlockBehaviour.Properties portProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .strength(1.5F)
                .sound(SoundType.METAL)
                .noOcclusion();
    }

    public static BlockBehaviour.Properties earProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.WOOD)
                .strength(1.0F)
                .sound(SoundType.WOOD)
                .noOcclusion();
    }

    public static BlockBehaviour.Properties lampProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .strength(1.0F)
                .sound(SoundType.METAL)
                .noOcclusion()
                .lightLevel(state -> state.getValue(BlockStateProperties.ENABLED) ? 15 : 0);
    }

    public static BlockBehaviour.Properties stoneProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(2.0F, 10.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops();
    }

    public static BlockBehaviour.Properties unbreakableProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(-1.0F, 3600000.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops();
    }

    public static BlockBehaviour.Properties eldritchTileProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(15.0F, 1000.0F)
                .sound(SoundType.STONE)
                .lightLevel(state -> 12)
                .requiresCorrectToolForDrops();
    }

    public static BlockBehaviour.Properties porousProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .strength(1.0F, 5.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops();
    }

    public static BlockBehaviour.Properties leavesProps() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .strength(0.2F)
                .randomTicks()
                .sound(SoundType.GRASS)
                .noOcclusion()
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY);
    }
}
