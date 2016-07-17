package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSTenTwentyFourDrive extends JASSItemBase {

    public JASSTenTwentyFourDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "1024kDrive";
    public static String getName()
    {

        return name;
    }
}
