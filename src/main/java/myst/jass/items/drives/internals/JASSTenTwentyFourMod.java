package myst.jass.items.drives.internals;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSTenTwentyFourMod extends JASSItemBase {

    public JASSTenTwentyFourMod() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "1024kMod";
    public static String getName()
    {

        return name;
    }
}
