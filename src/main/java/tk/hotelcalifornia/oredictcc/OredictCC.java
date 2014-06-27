package tk.hotelcalifornia.oredictcc;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = OredictCC.MODID, version = OredictCC.VERSION)
public class OredictCC
{
    public static final String MODID = "oredictcc";
    public static final String VERSION = "0.01-a";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        InitFarm.init();
    }
}
