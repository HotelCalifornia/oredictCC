package tk.hotelcalifornia.oredictcc;

import dan200.computercraft.api.ComputerCraftAPI;
import tk.hotelcalifornia.oredictcc.cc.TurtleUpgradeOredict;
import tk.hotelcalifornia.oredictcc.item.Items;

/**
 * This file created by Alex Brooke
 * please seek the author's permission before
 * distributing this software.
 * 'Do you know Java? Because your method body is sexy'
 * :3
 */
//holds all the things that will be called at init
public class InitFarm {
    public static void init() {
        //init the items
        Items.items();
        //register the turtle upgrade
        ComputerCraftAPI.registerTurtleUpgrade(new TurtleUpgradeOredict());
    }
}
