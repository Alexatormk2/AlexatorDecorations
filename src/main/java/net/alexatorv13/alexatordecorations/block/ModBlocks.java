package net.alexatorv13.alexatordecorations.block;

import net.alexatorv13.alexatordecorations.AlexatorDecorations;
import net.alexatorv13.alexatordecorations.block.custom.BaseTiles;
import net.alexatorv13.alexatordecorations.block.custom.MikuDoll;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.BlockCollisionSpliterator;

public class ModBlocks {

    public static final Block CHARSTONE = registerBlocks("charstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block MIKUDOLL = registerBlocks("mikudoll", new MikuDoll(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOL).nonOpaque()));
    public static final Block SAKURADOLL = registerBlocks("sakuradoll", new MikuDoll(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block TILES_1 = registerBlocks("tiles1", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TILES_2 = registerBlocks("tiles2", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TILES_3 = registerBlocks("tiles3", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TILES_4 = registerBlocks("tiles4", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TILES_5 = registerBlocks("tiles5", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TILES_6 = registerBlocks("tiles6", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));


    public static final Block FLOOR_TILES_1 = registerBlocks("floortiles1", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block FLOOR_TILES_2 = registerBlocks("floortiles2", new BaseTiles(FabricBlockSettings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));


    private static Block registerBlocks(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AlexatorDecorations.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AlexatorDecorations.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {

        AlexatorDecorations.LOGGER.info("Registering Mod blocks for" + AlexatorDecorations.MOD_ID);
    }
}
