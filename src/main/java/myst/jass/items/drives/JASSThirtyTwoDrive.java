package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSThirtyTwoDrive extends JASSItemBase {

    public JASSThirtyTwoDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "32kDrive";
    public static String getName()
    {

        return name;
    }
}
