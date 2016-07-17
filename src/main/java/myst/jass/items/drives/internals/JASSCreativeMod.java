package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSCreativeMod extends JASSItemBase {

    public JASSCreativeMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "CreativeMod";
    public static String getName()
    {

        return name;
    }
}
