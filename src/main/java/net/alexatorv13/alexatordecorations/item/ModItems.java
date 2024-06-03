package net.alexatorv13.alexatordecorations.item;

import net.alexatorv13.alexatordecorations.AlexatorDecorations;
import net.alexatorv13.alexatordecorations.item.custom.ModToolMaterialLucy;
import net.alexatorv13.alexatordecorations.item.custom.ModToolMaterialMiku;
import net.alexatorv13.alexatordecorations.item.custom.UtilModItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DOLLAR = registerItem("dollar", new Item(new FabricItemSettings()));
    public static final Item LUCYCORE = registerItem("lucycore", new Item(new FabricItemSettings()));
    public static final Item MIKUGEM = registerItem("mikugem", new Item(new FabricItemSettings()));
    public static final Item STONEDUST = registerItem("stonedust", new Item(new FabricItemSettings()));
    public static final Item STONEBREAER = registerItem("stonebreaker", new UtilModItem(new FabricItemSettings()));

//artifacts

    public static final Item LUCY = registerItem("lucy",
            new AxeItem(ModToolMaterialLucy.Lucy, 2, 1f, new FabricItemSettings()));

    public static final Item MIKU = registerItem("mikupickaxe",
            new PickaxeItem(ModToolMaterialMiku.Miku, 2, 1f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AlexatorDecorations.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AlexatorDecorations.LOGGER.info("Registering Mod items for" + AlexatorDecorations.MOD_ID);

    }


}
