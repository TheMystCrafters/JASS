package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSFourDrive extends JASSItemBase {

    public JASSFourDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "4kDrive";
    public static String getName()
    {

        return name;
    }
}
