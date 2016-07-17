package myst.jass.blocks;

import myst.jass.JASS;
import myst.jass.items.JASSItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSFluxOre extends Block {

    private static String name = "FluxOre";

    public JASSFluxOre() {
        super(Material.ROCK);
        setCreativeTab(JASS.tabsJASS);
        setUnlocalizedName(name);
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
