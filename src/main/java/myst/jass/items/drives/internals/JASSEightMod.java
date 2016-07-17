package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSEightMod extends JASSItemBase {

    public JASSEightMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "8kMod";
    public static String getName()
    {

        return name;
    }
}
