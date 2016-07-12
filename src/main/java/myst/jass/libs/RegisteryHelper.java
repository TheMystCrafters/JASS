package myst.jass.libs;

import myst.jass.blocks.ExampleBlock;
import myst.jass.blocks.JASSBlockBase;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by UnRealDinnerbone on 7/12/2016.
 */
public class RegisteryHelper
{
    public static void RegisterBlock (Block block, String name, String oreDictionaryName)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(block, 1, 0));
    }

    public static void RegisterBlock (Block block, String name)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }

    public static void RegisterItem (Item item, String name) {

        item.setRegistryName(name);
        GameRegistry.register(item);
    }
    public static void RegisterItem (Item item, String name, String oreDictionaryName) {

        item.setRegistryName(name);
        GameRegistry.register(item);
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(item, 1, 0));
    }

    public static void RenderItem(Item item, String name)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.RE_PREFIX + name, "inventory"));
    }
    public static void RenderBlock(Block block, String name)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RE_PREFIX + name));
    }
}
