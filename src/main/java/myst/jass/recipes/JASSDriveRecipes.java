package myst.jass.recipes;

import myst.jass.items.JASSDrives;
import myst.jass.items.JASSItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSDriveRecipes {

    public static void addDriveRecipes() {

        //Creative Drives!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.creativedrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.creativemod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.creativedrive, 1), JASSDrives.drivecae, JASSDrives.creativemod);

        //1k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.onedrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.onemod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.onedrive, 1), JASSDrives.drivecae, JASSDrives.onemod);

        //4k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.fourdrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.fourmod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.fourdrive, 1), JASSDrives.drivecae, JASSDrives.fourmod);

        //8k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.eightdrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.eightmod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.eightdrive, 1), JASSDrives.drivecae, JASSDrives.eightmod);

        //16k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.sixteendrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.sixteenmod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.sixteendrive, 1), JASSDrives.drivecae, JASSDrives.sixteenmod);

        //32k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.thirtytwodrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.thirtytwomod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.thirtytwodrive, 1), JASSDrives.drivecae, JASSDrives.thirtytwomod);

        //64k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.sixtyfourdrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.sixtyfourmod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.sixtyfourdrive, 1), JASSDrives.drivecae, JASSDrives.sixtyfourmod);

        //128k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.hundredtwentyeightdrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.hundredtwentyeightmod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.hundredtwentyeightdrive, 1), JASSDrives.drivecae, JASSDrives.hundredtwentyeightmod);

        //256k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.twofiftysixdrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.twofiftysixmod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.twofiftysixdrive, 1), JASSDrives.drivecae, JASSDrives.twofiftysixmod);

        //512k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.fivetwelvedrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.fivetwelvemod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.fivetwelvedrive, 1), JASSDrives.drivecae, JASSDrives.fivetwelvemod);

        //1024k Drive!
        GameRegistry.addRecipe(new ItemStack(JASSDrives.tentwentyfourdrive, 1),
                "FGF",
                "GCG",
                "RRR",
                'F', JASSItems.fluxingot, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'C', JASSDrives.tentwentyfourmod);
        GameRegistry.addShapelessRecipe(new ItemStack(JASSDrives.tentwentyfourdrive, 1), JASSDrives.drivecae, JASSDrives.tentwentyfourmod);

    }
}
