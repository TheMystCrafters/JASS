package myst.jass.blocks;

import myst.jass.libs.Reference;
import net.minecraft.block.material.Material;

/**
 * Created by UnRealDinnerbone on 7/12/2016.
 */
public class ExampleBlock extends JASSBlockBase {

    private static String name = "ExampleBlock";


    public ExampleBlock()
    {
        super(Material.ROCK);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);

    }

    //Lets you get the blocks name form outher classes :D with OUT THE SUBSTRING
    public static String getName()
    {
        return name;
    }
}
