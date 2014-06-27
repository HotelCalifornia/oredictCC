package tk.hotelcalifornia.oredictcc.cc;

import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.turtle.ITurtleAccess;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * This file created by Alex Brooke
 * please seek the author's permission before
 * distributing this software.
 * 'Do you know Java? Because your method body is sexy'
 * :3
 */
public class TurtlePeripheralOredict implements IPeripheral {
    private ITurtleAccess turtle;
    public TurtlePeripheralOredict(ITurtleAccess turtle) {
        this.turtle = turtle;
    }

    @Override
    public String getType() {
        return "Oredictionary peripheral for turtles";
    }

    @Override
    public String[] getMethodNames() {
        return new String[]{ "isOfType", "compareItems" };
    }

    @Override
    public Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) throws Exception {
        switch(method) {
            //isOfType
            case 0 :
                //if the arg isn't valid (i.e. not a number), throw an exception
                if(!(arguments[0] instanceof Double)) { throw new Exception("Expected (number), got " + getLuaTypesFromArgs(arguments, 1)); }
                //get the stack in the selected slot
                ItemStack selected = this.turtle.getInventory().getStackInSlot(turtle.getSelectedSlot());
                //get the stack we want to compare with
                ItemStack compare = this.turtle.getInventory().getStackInSlot(((Double)(arguments[0])).intValue());
                //use the oredictionary to check if they are the same item
                if(OreDictionary.itemMatches(compare, selected, true)) {
                    //if they are, return true
                    return new Object[]{true};
                }
                //if not, return false
                else return new Object[]{false};
            //compareItems
            case 1 :
                //if the args aren't valid (i.e. not numbers), throw an exception
                if(!(arguments[0] instanceof Double || arguments[1] instanceof Double)) { throw new Exception("Expected (number, number), got " + getLuaTypesFromArgs(arguments, 2)); }
                //get the first stack specified
                ItemStack stack1 = this.turtle.getInventory().getStackInSlot(((Double)(arguments[0])).intValue());
                //get the second stack specified
                ItemStack stack2 = this.turtle.getInventory().getStackInSlot(((Double)(arguments[1])).intValue());
                //use the oredictionary to check if they are the same
                if(OreDictionary.itemMatches(stack1, stack2, true)) {
                    //if they are, return true
                    return new Object[]{true};
                }
                //if not, return false
                else return new Object[]{false};
            //for any other non-method, return null
            default: return null;
        }
    }

    private String getLuaTypesFromArgs(Object[] arguments, int args) {
        String t1;
        String t2;
        if(arguments[0] instanceof Double) { t1 = "number"; }
        else if(arguments[0] instanceof Boolean) { t1 = "boolean"; }
        else if(arguments[0] instanceof String) { t1 = "string"; }
        else if(arguments[0] == null) { t1 = "table/nil"; }
        else { t1 = "nil"; }
        if(args > 1) {
            if (arguments[1] instanceof Double) {
                t2 = "number";
            } else if (arguments[1] instanceof Boolean) {
                t2 = "boolean";
            } else if (arguments[1] instanceof String) {
                t2 = "string";
            } else if (arguments[1] == null) {
                t2 = "table/nil";
            } else {
                t2 = "nil";
            }
            return "(" + t1 + ", " + t2 + ")";
        }
        return "(" + t1 + ")";
    }

    @Override
    public void attach(IComputerAccess computer) {

    }

    @Override
    public void detach(IComputerAccess computer) {

    }

    @Override
    public boolean equals(IPeripheral other) {
        return false;
    }
}
