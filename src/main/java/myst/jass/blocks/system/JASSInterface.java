package myst.jass.blocks.system;

import myst.jass.blocks.JASSBlockBase;
import net.minecraft.block.material.Material;

/**
 * Created by manmaed on 20/07/2016.
 */
public class JASSInterface extends JASSBlockBase {

    private static String name = "InterFace";

    public JASSInterface() {

        super();
        setUnlocalizedName(name);
    }

    public static String getName()
    {
        return name;
    }
}
