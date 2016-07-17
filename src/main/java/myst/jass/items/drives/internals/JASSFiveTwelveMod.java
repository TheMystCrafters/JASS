package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSFiveTwelveMod extends JASSItemBase {

    public JASSFiveTwelveMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "512kMod";
    public static String getName()
    {

        return name;
    }
}
