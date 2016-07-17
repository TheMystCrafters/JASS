package myst.jass.items.drives;

/**
 * Created by manmaed on 17/07/2016.
 */
public class JASSSixtyFourDrive extends myst.jass.items.JASSItemBase {

    public JASSSixtyFourDrive() {
        super();
        setUnlocalizedName(name);
    }
    private static String name = "64kDrive";
    public static String getName()
    {

        return name;
    }
}
