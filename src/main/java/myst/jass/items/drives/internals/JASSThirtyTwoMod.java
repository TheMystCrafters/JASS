package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSThirtyTwoMod extends JASSItemBase {

    public JASSThirtyTwoMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "32kMod";
    public static String getName()
    {

        return name;
    }
}
