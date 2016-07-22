package myst.jass.blocks;

import myst.jass.blocks.system.JASSDrivebay;
import myst.jass.blocks.system.JASSExportbus;
import myst.jass.blocks.system.JASSImportbus;
import myst.jass.blocks.system.JASSTheCore;
import myst.jass.libs.RegisteryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSBlocks {

    /*public static JASSBlockBase Example;*/
    public static Block fluxblock;
    public static BlockOre fluxore;
    public static JASSBlockBase importbus;
    public static JASSBlockBase exportbus;
    public static Block thecore;
    public static Block drivebay;



    public static void RegisterBlock()
    {
        //Im Doing This part your way to be nice :D
        //Example = new ExampleBlock();
        fluxblock = new JASSFluxBlock();
        fluxore = new JASSFluxOre();
        thecore = new JASSTheCore();
        importbus = new JASSImportbus();
        exportbus = new JASSExportbus();
        drivebay = new JASSDrivebay();

        //Another String can be add for the oredic
        //RegisteryHelper.RegisterBlock(Example, ExampleBlock.getName());
        RegisteryHelper.RegisterBlock(fluxblock, JASSFluxBlock.getName());
        RegisteryHelper.RegisterBlock(fluxore, JASSFluxOre.getName());
        RegisteryHelper.RegisterBlock(thecore, JASSTheCore.getName());
        RegisteryHelper.RegisterBlock(importbus, JASSImportbus.getName());
        RegisteryHelper.RegisterBlock(exportbus, JASSExportbus.getName());
        RegisteryHelper.RegisterBlock(drivebay, JASSDrivebay.getName());
    }

    public static void RenderBlocks()
    {
        //RegisteryHelper.RenderBlock(Example, ExampleBlock.getName());
        RegisteryHelper.RenderBlock(fluxblock, JASSFluxBlock.getName());
        RegisteryHelper.RenderBlock(fluxore, JASSFluxOre.getName());
        RegisteryHelper.RenderBlock(thecore, JASSTheCore.getName());
        RegisteryHelper.RenderBlock(importbus, JASSImportbus.getName());
        RegisteryHelper.RenderBlock(exportbus, JASSExportbus.getName());
        RegisteryHelper.RenderBlock(drivebay, JASSDrivebay.getName());
    }
}
