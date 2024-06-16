package net.alexatorv13.alexatordecorations.item;

import net.alexatorv13.alexatordecorations.AlexatorDecorations;
import net.alexatorv13.alexatordecorations.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ALEXATOR_DECO_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorDecorations.MOD_ID, "alexator_deco_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexatordecoblocks")).icon(() -> new ItemStack(ModBlocks.TILES_1)).entries((displayContext, entries) -> {

        entries.add(ModBlocks.TILES_1);
        entries.add(ModBlocks.TILES_2);
        entries.add(ModBlocks.TILES_3);
        entries.add(ModBlocks.TILES_4);
        entries.add(ModBlocks.TILES_5);
        entries.add(ModBlocks.TILES_6);
        entries.add(ModBlocks.FLOOR_TILES_1);
        entries.add(ModBlocks.FLOOR_TILES_2);
        entries.add(ModBlocks.SAKURADOLL);
        entries.add(ModBlocks.MIKUDOLL);
        entries.add(ModBlocks.CHARSTONE);
        entries.add(ModBlocks.REDBRICKS);
        entries.add(ModBlocks.PURPLEBRICKS);


    }).build());

    public static final ItemGroup ALEXATOR_LEGACY_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorDecorations.MOD_ID, "alexator_legacy_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexatorlegacyblocks")).icon(() -> new ItemStack(ModBlocks.LNETHERRACK)).entries((displayContext, entries) -> {

        entries.add(ModBlocks.LNETHERRACK);


    }).build());


    public static final ItemGroup ALEXATOR_FURNITURE = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorDecorations.MOD_ID, "alexator_furniture"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexatorfurniture")).icon(() -> new ItemStack(ModBlocks.CHERRY_CHAIR)).entries((displayContext, entries) -> {

        entries.add(ModBlocks.CHERRY_CHAIR);


    }).build());


    public static final ItemGroup ALEXATOR_ARTIFACTS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorDecorations.MOD_ID, "alexator_artifacts"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexatorartifacts")).icon(() -> new ItemStack(ModItems.LUCY)).entries((displayContext, entries) -> {

        entries.add(ModItems.LUCY);
        entries.add(ModItems.MIKU);


    }).build());

    public static final ItemGroup OTHER_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorDecorations.MOD_ID, "other_items"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexatorothers"))
            .icon(() -> new ItemStack(ModItems.DOLLAR)).entries((displayContext, entries) -> {

                entries.add(ModItems.DOLLAR);
                entries.add(ModItems.STONEBREAKER);
                entries.add(ModItems.LEGACYNEITOR);
                entries.add(ModItems.STONEDUST);
                entries.add(ModItems.LUCYCORE);
                entries.add(ModItems.MIKUGEM);
            }).build());

    public static void registerItemGroups() {
        AlexatorDecorations.LOGGER.info("Registering item groups for" + AlexatorDecorations.MOD_ID);
    }
}
