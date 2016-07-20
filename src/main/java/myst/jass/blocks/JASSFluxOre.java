package myst.jass.blocks;

import myst.jass.JASS;
import myst.jass.items.JASSItems;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSFluxOre extends BlockOre {

    private static String name = "FluxOre";

    public JASSFluxOre() {
        super();
        setCreativeTab(JASS.tabsJASS);
        setUnlocalizedName(name);
        setHarvestLevel("pickaxe", 2);
        setHardness(2.0F);
        setResistance(5.0F);
    }

    public static String getName()
    {
        return name;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return JASSItems.fluxdust;
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        return this.quantityDropped(random) + random.nextInt(fortune + 1);
    }

    public int quantityDropped(Random random) {
        return 4 + random.nextInt(2);
    }
}
