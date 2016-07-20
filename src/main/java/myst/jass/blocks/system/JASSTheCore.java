package myst.jass.blocks.system;

import myst.jass.blocks.JASSBlockBase;
import net.minecraft.block.material.Material;

/**
 * Created by manmaed on 20/07/2016.
 */
public class JASSTheCore extends JASSBlockBase {

    private static String name = "TheCore";

    public JASSTheCore() {

        super(Material.IRON);
        setUnlocalizedName(name);
    }

    public static String getName()
    {
        return name;
    }
}
