package myst.jass.creativetab;

import myst.jass.libs.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;
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

        return Item.getItemFromBlock(Blocks.TRAPPED_CHEST);
    }

    public String getTranslatedTabLabel() {

        return I18n.translateToLocal("creativeJAZZ.name");
    }
}
