package net.alexatorv13.alexatordecorations;

import net.alexatorv13.alexatordecorations.block.ModBlocks;
import net.alexatorv13.alexatordecorations.entity.Modentities;
import net.alexatorv13.alexatordecorations.item.ModItemGroups;
import net.alexatorv13.alexatordecorations.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlexatorDecorations implements ModInitializer {

    public static final String MOD_ID = "alexatordecorations";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.MIKUDOLL});
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.CHERRY_CHAIR});
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.SAKURADOLL});
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        Modentities.registerModEntities();

        LOGGER.info("Hello Fabric world!");
    }
}