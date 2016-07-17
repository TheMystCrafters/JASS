package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSFourMod extends JASSItemBase {

    public JASSFourMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "4kMod";
    public static String getName()
    {

        return name;
    }
}
