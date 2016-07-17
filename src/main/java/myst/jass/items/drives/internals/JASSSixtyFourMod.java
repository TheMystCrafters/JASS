package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSSixtyFourMod extends JASSItemBase {

    public JASSSixtyFourMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "64kMod";
    public static String getName()
    {

        return name;
    }
}
