package myst.jass.recipes;

import myst.jass.blocks.JASSBlocks;
import myst.jass.items.JASSItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSRecipes {


    public static void addRecipes()
    {
        /**
         * A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
         * recipe is.
         * Pretend the array as an crafting grid, where spaces are empty places.
         * All other chars can be any item assigned.
         */
        //Example
        /*GameRegistry.addRecipe(new ItemStack(BRPBlocks.brpstonebricks, 8),
                "SSS",
                "SBS",
                "SSS",
                'S', Blocks.STONEBRICK, 'B', Blocks.BEDROCK);
*/
        //Bedrock Glass
        GameRegistry.addRecipe(new ItemStack(JASSBlocks.fluxblock, 1),
                "FFF",
                "FFF",
                "FFF",
                'F', JASSItems.fluxingot);

        //Bedrock Glowstone
        /*GameRegistry.addRecipe(new ItemStack(JASSItems.fluxingot, 9),
                "   ",
                " F ",
                "   ",
                'F', JASSBlocks.fluxblock);*/
        GameRegistry.addShapelessRecipe(new ItemStack(JASSItems.fluxingot, 9), JASSBlocks.fluxblock);


        //Smeliting
        /*GameRegistry.addSmelting(Input, Output, xp);*/
        GameRegistry.addSmelting(JASSItems.fluxdust, new ItemStack(JASSItems.fluxingot ,2), 1.0f);
    }
}
