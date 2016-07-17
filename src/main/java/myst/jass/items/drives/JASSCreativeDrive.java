package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSCreativeDrive extends JASSItemBase {

    public JASSCreativeDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "CreativeDrive";
    public static String getName()
    {

        return name;
    }
}
