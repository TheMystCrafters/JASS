package myst.jass;

import myst.jass.blocks.JASSBlocks;
import myst.jass.creativetab.JASSCreativeTab;
import myst.jass.items.JASSItems;
import myst.jass.libs.LogHelper;
import myst.jass.libs.Reference;
import myst.jass.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by manmaed on 12/07/2016.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class JASS {
    @Mod.Instance(Reference.MOD_ID)
    public static JASS instance;
    public static CommonProxy proxy;
    public static CreativeTabs tabsJASS = new JASSCreativeTab(CreativeTabs.getNextID());


    //Forge Stuff
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {
        JASSBlocks.RegisterBlock();
        JASSItems.RegisterItem();
        if(event.getSide().isClient())
        {
            JASSBlocks.RenderBlocks();
            JASSItems.RenderItem();
        }

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        LogHelper.info("Lets hope it does not shoot fire and blow up");
        LogHelper.info("-iChun 2015");
        LogHelper.info("yes that is in evey mod manmaed makes!");

    }
}
