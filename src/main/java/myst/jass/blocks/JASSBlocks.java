package myst.jass.blocks;

import myst.jass.libs.RegisteryHelper;
import net.minecraft.block.Block;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSBlocks {

    /*public static JASSBlockBase Example;*/
    public static Block fluxblock;
    public static Block fluxore;

    public static void RegisterBlock()
    {
        //Im Doing This part your way to be nice :D
        //Example = new ExampleBlock();
        fluxblock = new JASSFluxBlock();
        fluxore = new JASSFluxOre();

        //Another String can be add for the oredic
        //RegisteryHelper.RegisterBlock(Example, ExampleBlock.getName());
        RegisteryHelper.RegisterBlock(fluxblock, JASSFluxBlock.getName());
        RegisteryHelper.RegisterBlock(fluxore, JASSFluxOre.getName());
    }

    public static void RenderBlocks()
    {
        //RegisteryHelper.RenderBlock(Example, ExampleBlock.getName());
        RegisteryHelper.RenderBlock(fluxblock, JASSFluxBlock.getName());
        RegisteryHelper.RenderBlock(fluxore, JASSFluxOre.getName());
    }
}
