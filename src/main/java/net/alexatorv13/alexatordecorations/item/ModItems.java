package net.alexatorv13.alexatordecorations.item;

import net.alexatorv13.alexatordecorations.AlexatorDecorations;
import net.alexatorv13.alexatordecorations.item.custom.UtilModItem;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DOLLAR = registerItem("dollar", new Item(new Item.Settings()));
    public static final Item LUCYCORE = registerItem("lucycore", new Item(new Item.Settings()));
    public static final Item STONEDUST = registerItem("stonedust", new Item(new Item.Settings()));
    public static final Item STONEBREAER = registerItem("stonebreaker", new UtilModItem(new Item.Settings()));

//artifacts

    public static final Item LUCY = registerItem("lucy",
            new AxeItem(ModToolMaterial.Lucy,  new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AlexatorDecorations.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AlexatorDecorations.LOGGER.info("Registering Mod items for" + AlexatorDecorations.MOD_ID);

    }


}
