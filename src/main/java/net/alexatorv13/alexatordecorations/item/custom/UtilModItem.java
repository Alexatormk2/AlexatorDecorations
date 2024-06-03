package net.alexatorv13.alexatordecorations.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class UtilModItem extends Item implements FabricItem {


    public UtilModItem(Settings settings) {
        super(settings);
    }
    public  ItemStack getRecipeRemainder(ItemStack itemStack){

        return new ItemStack(itemStack.getItem());
    }

    public  ItemStack getRecipeRemainderItem(Item item){

        assert item.getRecipeRemainder() != null;
        return new ItemStack(item.getRecipeRemainder());
    }


        public boolean hasCraftingRemainingItem(ItemStack stack) {
            return true;
        }

}
