package myst.jass.blocks;

import myst.jass.JASS;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by UnRealDinnerbone on 7/12/2016.
 */
public class JASSFluxBlock extends Block {

    private static String name = "FluxBlock";

    public JASSFluxBlock()
    {
        super(Material.IRON);
        setCreativeTab(JASS.tabsJASS);
        setUnlocalizedName(name);

    }

    public static String getName()
    {
        return name;
    }
}
