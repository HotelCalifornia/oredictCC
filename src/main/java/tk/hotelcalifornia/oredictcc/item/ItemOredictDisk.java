package tk.hotelcalifornia.oredictcc.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

/**
 * This file created by Alex Brooke
 * please seek the author's permission before
 * distributing this software.
 * 'Do you know Java? Because your method body is sexy'
 * :3
 */
public class ItemOredictDisk extends Item {
    public ItemOredictDisk(int id) {
        super(id);
        setCreativeTab(CreativeTabs.tabMisc);
    }
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(String.format("%sA floppy disk, containing the legendary Oredictionary.", EnumChatFormatting.GREEN));
        par3List.add(String.format("%sHowever, it can only be read by a special type of machine...", EnumChatFormatting.RED));
    }
}
