package myst.jass.blocks;

import myst.jass.JASS;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by UnRealDinnerbone on 7/12/2016.
 */
public class JASSBlockBase extends Block
{
    //Things That are need for ever block
    public JASSBlockBase() {
        //Have to have this
        super(Material.ROCK);
        setCreativeTab(JASS.tabsJASS);
        //Todo Set stuff for ever block
    }
}
