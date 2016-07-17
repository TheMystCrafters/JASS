package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSFiveTwelvaDrive extends JASSItemBase {

    public JASSFiveTwelvaDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "512kDrive";
    public static String getName()
    {

        return name;
    }
}
