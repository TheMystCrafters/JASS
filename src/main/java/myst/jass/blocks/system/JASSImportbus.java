package myst.jass.blocks.system;

import myst.jass.blocks.JASSBlockBase;
import net.minecraft.block.material.Material;

/**
 * Created by manmaed on 20/07/2016.
 */
public class JASSImportbus extends JASSBlockBase {

    private static String name = "ImportBus";

    public JASSImportbus() {

        super();
        setUnlocalizedName(name);
    }

    public static String getName()
    {
        return name;
    }
}
