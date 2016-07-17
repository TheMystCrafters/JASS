package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSOneMod extends JASSItemBase {

    public JASSOneMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "1kMod";
    public static String getName()
    {

        return name;
    }
}
