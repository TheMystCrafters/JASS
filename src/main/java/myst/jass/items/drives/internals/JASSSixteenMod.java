package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSSixteenMod extends JASSItemBase {

    public JASSSixteenMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "16kMod";
    public static String getName()
    {

        return name;
    }
}
