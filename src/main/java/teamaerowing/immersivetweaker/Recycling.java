package teamaerowing.immersivetweaker;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import blusunrize.immersiveengineering.api.crafting.ArcFurnaceRecipe;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.immersivetweaker.Recycling")
public class Recycling {

    @ZenMethod
    public static void allowItemForRecycling(IItemStack stack)
    {
        ArcFurnaceRecipe.allowItemForRecycling(stack.getInternal());
    }

    @ZenMethod
    public static void makeStackInvalidRecyclingOutput(IItemStack stack)
    {
        ArcFurnaceRecipe.makeItemInvalidRecyclingOutput(stack.getInternal());
    }

}
