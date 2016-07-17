package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSSixteenDrive extends JASSItemBase {

    public JASSSixteenDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "16kDrive";
    public static String getName()
    {

        return name;
    }
}
