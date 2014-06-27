package tk.hotelcalifornia.oredictcc.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tk.hotelcalifornia.oredictcc.OredictCC;

/**
 * This file created by Alex Brooke
 * please seek the author's permission before
 * distributing this software.
 * 'Do you know Java? Because your method body is sexy'
 * :3
 */
public class Items {
    public static class declareItems {
        public static Item ore_disk;
        public static Item oredict_upgrade;
    }
    private static void initItems() {
        declareItems.ore_disk = new ItemOredictDisk(31888);
        declareItems.oredict_upgrade = new ItemOredictPeripheral(31889);
    }
    private static void doExtras() {
        declareItems.ore_disk.setTextureName(OredictCC.MODID + "ore_disk");
    }
    private static void registerShapedRecipes() {
        ItemStack disk = new ItemStack(declareItems.ore_disk, 1);
        String[] names = OreDictionary.getOreNames();
        for (String name : names) {
            if (name.startsWith("ore")) {
                GameRegistry.addRecipe(disk, "xxx", "xyx", "xzx",
                        'x', OreDictionary.getOres(name),
                        'y', new ItemStack(Item.redstone, 1),
                        'z', new ItemStack(Item.paper, 1)
                );
            }
        }
        ItemStack peripheral = new ItemStack(declareItems.oredict_upgrade, 1);
        GameRegistry.addRecipe(peripheral, "xxx", "xyx", "xxx",
                        'x', new ItemStack(Block.stone),
                        'y', new ItemStack(declareItems.ore_disk)
                );
    }
    private static void registerItems() {
        GameRegistry.registerItem(declareItems.ore_disk, "ore_disk");
    }
    public static void items() {
        initItems();
        doExtras();
        registerShapedRecipes();
        registerItems();
    }
}
