package myst.jass.blocks.system;

import myst.jass.blocks.JASSBlockBase;
import net.minecraft.block.material.Material;

/**
 * Created by manmaed on 20/07/2016.
 */
public class JASSExportbus extends JASSBlockBase {

    private static String name = "ExportBus";

    public JASSExportbus() {

        super(Material.ROCK);
        setUnlocalizedName(name);
    }

    public static String getName()
    {
        return name;
    }
}
