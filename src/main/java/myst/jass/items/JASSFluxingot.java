package myst.jass.items;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSFluxingot extends JASSItemBase {

    private static String name = "Fluxingot";


    public JASSFluxingot()
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
