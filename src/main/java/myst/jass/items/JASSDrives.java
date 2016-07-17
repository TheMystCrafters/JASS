package myst.jass.items;

import myst.jass.items.drives.*;
import myst.jass.items.drives.internals.*;
import myst.jass.libs.RegisteryHelper;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSDrives {

    /*public static JASSItemBase Example;*/
    public static JASSItemBase drivecae;
    public static JASSItemBase onedrive;
    public static JASSItemBase fourdrive;
    public static JASSItemBase eightdrive;
    public static JASSItemBase sixteendrive;
    public static JASSItemBase thirtytwodrive;
    public static JASSItemBase sixtyfourdrive;
    public static JASSItemBase hundredtwentyeightdrive;
    public static JASSItemBase twofiftysixdrive;
    public static JASSItemBase fivetwelvedrive;
    public static JASSItemBase tentwentyfourdrive;
    public static JASSItemBase creativedrive;

    //Crafing Bits

    public static JASSItemBase onemod;
    public static JASSItemBase fourmod;
    public static JASSItemBase eightmod;
    public static JASSItemBase sixteenmod;
    public static JASSItemBase thirtytwomod;
    public static JASSItemBase sixtyfourmod;
    public static JASSItemBase hundredtwentyeightmod;
    public static JASSItemBase twofiftysixmod;
    public static JASSItemBase fivetwelvemod;
    public static JASSItemBase tentwentyfourmod;
    public static JASSItemBase creativemod;

    public static void RegisterItem()
    {
        /*Example = new ExampleItem();*/
        drivecae = new JASSDrive();
        onedrive = new JASSOneDrive();
        fourdrive = new JASSFourDrive();
        eightdrive = new JASSEightDrive();
        sixteendrive = new JASSSixteenDrive();
        thirtytwodrive = new JASSThirtyTwoDrive();
        sixtyfourdrive = new JASSSixtyFourDrive();
        hundredtwentyeightdrive = new JASSHundredTwentyEightDrive();
        twofiftysixdrive = new JASSTwoFiftySixDrive();
        fivetwelvedrive = new JASSFiveTwelveDrive();
        tentwentyfourdrive = new JASSTenTwentyFourDrive();
        creativedrive = new JASSCreativeDrive();

        //Crafting

        onemod = new JASSOneMod();
        fourmod = new JASSFourMod();
        eightmod = new JASSEightMod();
        sixteenmod = new JASSSixteenMod();
        thirtytwomod = new JASSThirtyTwoMod();
        sixtyfourmod = new JASSSixtyFourMod();
        hundredtwentyeightmod = new JASSHundredTwentyEightMod();
        twofiftysixmod = new JASSTwoFiftySixMod();
        fivetwelvemod = new JASSFiveTwelveMod();
        tentwentyfourmod = new JASSTenTwentyFourMod();
        creativemod = new JASSCreativeMod();




        //Registers Item, another string can be add to the end for and ore dic name
        /*RegisteryHelper.RegisterItem(Example, ExampleItem.getName());*/
        RegisteryHelper.RegisterItem(drivecae, JASSDrive.getName());
        RegisteryHelper.RegisterItem(onedrive, JASSOneDrive.getName());
        RegisteryHelper.RegisterItem(fourdrive, JASSFourDrive.getName());
        RegisteryHelper.RegisterItem(eightdrive, JASSEightDrive.getName());
        RegisteryHelper.RegisterItem(sixteendrive, JASSSixteenDrive.getName());
        RegisteryHelper.RegisterItem(thirtytwodrive, JASSThirtyTwoDrive.getName());
        RegisteryHelper.RegisterItem(sixtyfourdrive, JASSSixtyFourDrive.getName());
        RegisteryHelper.RegisterItem(hundredtwentyeightdrive, JASSHundredTwentyEightDrive.getName());
        RegisteryHelper.RegisterItem(twofiftysixdrive, JASSTwoFiftySixDrive.getName());
        RegisteryHelper.RegisterItem(fivetwelvedrive, JASSFiveTwelveDrive.getName());
        RegisteryHelper.RegisterItem(tentwentyfourdrive, JASSTenTwentyFourDrive.getName());
        RegisteryHelper.RegisterItem(creativedrive, JASSCreativeDrive.getName());

        //Crafting Bit

        RegisteryHelper.RegisterItem(onemod, JASSOneMod.getName());
        RegisteryHelper.RegisterItem(fourmod, JASSFourMod.getName());
        RegisteryHelper.RegisterItem(eightmod, JASSEightMod.getName());
        RegisteryHelper.RegisterItem(sixteenmod, JASSSixteenMod.getName());
        RegisteryHelper.RegisterItem(thirtytwomod, JASSThirtyTwoMod.getName());
        RegisteryHelper.RegisterItem(sixtyfourmod, JASSSixtyFourMod.getName());
        RegisteryHelper.RegisterItem(hundredtwentyeightmod, JASSHundredTwentyEightMod.getName());
        RegisteryHelper.RegisterItem(twofiftysixmod, JASSTwoFiftySixMod.getName());
        RegisteryHelper.RegisterItem(fivetwelvemod, JASSFiveTwelveMod.getName());
        RegisteryHelper.RegisterItem(tentwentyfourmod, JASSTenTwentyFourMod.getName());
        RegisteryHelper.RegisterItem(creativemod, JASSCreativeMod.getName());

    }

    public static void RenderItem()
    {
        //Renders The Item
        /*RegisteryHelper.RenderItem(Example, ExampleItem.getName());*/
        RegisteryHelper.RenderItem(drivecae, JASSDrive.getName());
        RegisteryHelper.RenderItem(onedrive, JASSOneDrive.getName());
        RegisteryHelper.RenderItem(fourdrive, JASSFourDrive.getName());
        RegisteryHelper.RenderItem(eightdrive, JASSEightDrive.getName());
        RegisteryHelper.RenderItem(sixteendrive, JASSSixteenDrive.getName());
        RegisteryHelper.RenderItem(thirtytwodrive, JASSThirtyTwoDrive.getName());
        RegisteryHelper.RenderItem(sixtyfourdrive, JASSSixtyFourDrive.getName());
        RegisteryHelper.RenderItem(hundredtwentyeightdrive, JASSHundredTwentyEightDrive.getName());
        RegisteryHelper.RenderItem(twofiftysixdrive, JASSTwoFiftySixDrive.getName());
        RegisteryHelper.RenderItem(fivetwelvedrive, JASSFiveTwelveDrive.getName());
        RegisteryHelper.RenderItem(tentwentyfourdrive, JASSTenTwentyFourDrive.getName());
        RegisteryHelper.RenderItem(creativedrive, JASSCreativeDrive.getName());

        //Crafting Bits
        RegisteryHelper.RenderItem(onemod, JASSOneMod.getName());
        RegisteryHelper.RenderItem(fourmod, JASSFourMod.getName());
        RegisteryHelper.RenderItem(eightmod, JASSEightMod.getName());
        RegisteryHelper.RenderItem(sixteenmod, JASSSixteenMod.getName());
        RegisteryHelper.RenderItem(thirtytwomod, JASSThirtyTwoMod.getName());
        RegisteryHelper.RenderItem(sixtyfourmod, JASSSixtyFourMod.getName());
        RegisteryHelper.RenderItem(hundredtwentyeightmod, JASSHundredTwentyEightMod.getName());
        RegisteryHelper.RenderItem(twofiftysixmod, JASSTwoFiftySixMod.getName());
        RegisteryHelper.RenderItem(fivetwelvemod, JASSFiveTwelveMod.getName());
        RegisteryHelper.RenderItem(tentwentyfourmod, JASSTenTwentyFourMod.getName());
        RegisteryHelper.RenderItem(creativemod, JASSCreativeMod.getName());

    }
}
