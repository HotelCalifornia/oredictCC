package tk.hotelcalifornia.oredictcc.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * This file created by Alex Brooke
 * please seek the author's permission before
 * distributing this software.
 * 'Do you know Java? Because your method body is sexy'
 * :3
 */
public class BlockOredictPeripheral extends Block {
    public BlockOredictPeripheral(int id, Material material) {
        super(id, material);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
