package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSEightDrive extends JASSItemBase {

    public JASSEightDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "8kDrive";
    public static String getName()
    {

        return name;
    }
}
