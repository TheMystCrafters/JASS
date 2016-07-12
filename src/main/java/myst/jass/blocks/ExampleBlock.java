package myst.jass.blocks;

import myst.jass.libs.Reference;

/**
 * Created by UnRealDinnerbone on 7/12/2016.
 */
public class ExampleBlock extends JASSBlockBase {

    private static String name = "ExampleBlock";


    public ExampleBlock()
    {
        super();
        this.setUnlocalizedName(name);

    }

    //Lets you get the blocks name form outher classes :D with OUT THE SUBSTRING
    public static String getName()
    {
        return name;
    }
}
