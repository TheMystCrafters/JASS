package myst.jass.blocks.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import javax.annotation.Nullable;

/**
 * Created by manmaed on 21/07/2016.
 */
public class TileEntityDrivebay extends TileEntity implements ISidedInventory {

    private ItemStack[] slots = new ItemStack[4];


    //Things
    @Override
    public int[] getSlotsForFace(EnumFacing enumFacing) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int i, ItemStack itemStack, EnumFacing enumFacing) {
        return false;
    }

    @Override
    public boolean canExtractItem(int i, ItemStack itemStack, EnumFacing enumFacing) {
        return false;
    }

    @Override
    public int getSizeInventory() {
        return slots.length;
    }

    @Nullable
    @Override
    public ItemStack getStackInSlot(int i) {
        return null;
    }

    @Nullable
    @Override
    public ItemStack decrStackSize(int i, int i1) {
        return null;
    }

    @Nullable
    @Override
    public ItemStack removeStackFromSlot(int i) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int i, @Nullable ItemStack itemStack) {

    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
        return false;
    }

    @Override
    public void openInventory(EntityPlayer entityPlayer) {

    }

    @Override
    public void closeInventory(EntityPlayer entityPlayer) {

    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemStack) {
        return false;
    }

    @Override
    public int getField(int i) {
        return 0;
    }

    @Override
    public void setField(int i, int i1) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }
}
