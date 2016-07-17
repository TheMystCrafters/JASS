package myst.jass.items.drives;

import myst.jass.items.JASSItemBase;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSDrive extends JASSItemBase {

    public JASSDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "DriveCase";
    public static String getName()
    {

        return name;
    }
}
