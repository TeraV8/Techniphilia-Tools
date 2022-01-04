package net.javaserver.techniphilia.travel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_ID,
        name = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_NAME,
        version = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_VERSION,
        dependencies = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_DEPENDENCIES)
public class ComponentToolsLoader {
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("TechniphiliaTools: preinit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Hello blocky world!");
        net.javaserver.techniphilia.tools.common.ModRegistry.getItemGroup();
    }
}
