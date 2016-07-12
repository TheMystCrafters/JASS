package myst.jass.items;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSFluxdust extends JASSItemBase {

    private static String name = "Fluxdust";


    public JASSFluxdust()
    {
        super();
        setUnlocalizedName(name);

    }

    //Lets you get the blocks name form outher classes :D with OUT THE SUBSTRING
    public static String getName()
    {

        return name;
    }
}
