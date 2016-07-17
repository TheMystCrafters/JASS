package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSHundredTwentyEightDrive extends JASSItemBase {

    public JASSHundredTwentyEightDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "128kDrive";
    public static String getName()
    {

        return name;
    }
}
