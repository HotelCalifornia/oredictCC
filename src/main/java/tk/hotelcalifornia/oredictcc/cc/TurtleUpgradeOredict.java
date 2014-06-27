package tk.hotelcalifornia.oredictcc.cc;

import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.turtle.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import tk.hotelcalifornia.oredictcc.item.Items;

/**
 * This file created by Alex Brooke
 * please seek the author's permission before
 * distributing this software.
 * 'Do you know Java? Because your method body is sexy'
 * :3
 */
public class TurtleUpgradeOredict implements ITurtleUpgrade {
    public TurtleUpgradeOredict() {

    }

    @Override
    public int getUpgradeID() {
        return 65;
    }

    @Override
    public String getAdjective() {
        return "Intelligent";
    }

    @Override
    public TurtleUpgradeType getType() {
        return TurtleUpgradeType.Peripheral;
    }

    @Override
    public ItemStack getCraftingItem() {
        return new ItemStack(Items.declareItems.oredict_upgrade);
    }

    @Override
    public IPeripheral createPeripheral(ITurtleAccess turtle, TurtleSide side) {
        return new TurtlePeripheralOredict(turtle);
    }

    @Override
    public TurtleCommandResult useTool(ITurtleAccess turtle, TurtleSide side, TurtleVerb verb, int direction) {
        return null;
    }

    @Override
    public Icon getIcon(ITurtleAccess turtle, TurtleSide side) {
        return null;
    }

    @Override
    public void update(ITurtleAccess turtle, TurtleSide side) {

    }
}
