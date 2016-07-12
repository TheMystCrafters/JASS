package myst.jass.items;

/**
 * Created by UnRealDinnerbone on 7/12/2016.
 */
public class ExampleItem extends JASSItemBase
{
    private static String name = "ExampleItem";


    public ExampleItem()
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
