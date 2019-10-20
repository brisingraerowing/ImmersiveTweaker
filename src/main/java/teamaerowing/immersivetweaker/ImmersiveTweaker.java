package teamaerowing.immersivetweaker;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ImmersiveTweaker.MODID, name = ImmersiveTweaker.NAME, version = ImmersiveTweaker.VERSION)
public class ImmersiveTweaker
{
    public static final String MODID = "mmersivetweaker";
    public static final String NAME = "Immersive Tweaker";
    public static final String VERSION = "0.1";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
