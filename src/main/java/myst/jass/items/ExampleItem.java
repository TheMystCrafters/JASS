package myst.jass.items;

import myst.jass.libs.Reference;

/**
 * Created by UnRealDinnerbone on 7/12/2016.
 */
public class ExampleItem extends JASSItemBase
{
    private static String name = "ExampleItem";


    public ExampleItem()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);

    }

    //Lets you get the blocks name form outher classes :D with OUT THE SUBSTRING
    public static String getName()
    {
        return name;
    }
}
