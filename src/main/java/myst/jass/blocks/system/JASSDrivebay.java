package myst.jass.blocks.system;

import myst.jass.JASS;
import myst.jass.libs.LogHelper;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by manmaed on 20/07/2016.
 */
public class JASSDrivebay extends BlockContainer {

    private static String name = "DriveBay";

    public JASSDrivebay() {

        super(Material.ROCK);
        setUnlocalizedName(name);
        setCreativeTab(JASS.tabsJASS);
    }

    public static String getName()
    {
        return name;
    }

    /*@Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        super.onBlockClicked(worldIn, pos, playerIn);
        LogHelper.info("Dave: Open the Pod Bay Doors");
        LogHelper.info("HAL: Im Sorry Dave, i'm afraid i can't do that");
    }*/

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote) {
            LogHelper.info("Dave: Open the Pod Bay Doors");
            LogHelper.info("HAL: Im Sorry Dave, i'm afraid I can't do that");
            /*FMLNetworkHandler.openGui(playerIn, JASS.instance, 0, worldIn, 0, 0, 0);*/
        }
        /*return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);*/
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return null;
        //return new TileEntityDrivebay();
    }
}
