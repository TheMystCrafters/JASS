package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSOneDrive extends JASSItemBase {

    public JASSOneDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "1kDrive";
    public static String getName()
    {

        return name;
    }
}
