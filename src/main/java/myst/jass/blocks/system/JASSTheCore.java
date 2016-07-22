package myst.jass.blocks.system;

import myst.jass.JASS;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by manmaed on 20/07/2016.
 */
public class JASSTheCore extends Block {

    private static String name = "TheCore";

    public JASSTheCore() {

        super(Material.IRON);
        setUnlocalizedName(name);
        setCreativeTab(JASS.tabsJASS);
    }

    public static String getName()
    {
        return name;
    }
}
