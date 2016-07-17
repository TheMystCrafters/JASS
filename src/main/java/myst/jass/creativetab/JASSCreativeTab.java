package myst.jass.creativetab;

import myst.jass.items.JASSDrives;
import myst.jass.libs.LangHelper;
import myst.jass.libs.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by manmaed on 12/07/2016.
 */
public class JASSCreativeTab extends CreativeTabs {

    public JASSCreativeTab(int id) {

        super(Reference.MOD_ID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Item getTabIconItem() {

        return JASSDrives.creativemod;
    }

    public String getTranslatedTabLabel() {

        return LangHelper.TAB.translateMessage(("creativeJASS.name"));
    }
}
