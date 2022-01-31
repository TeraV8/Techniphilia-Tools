package net.javaserver.techniphilia.tools;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import net.javaserver.techniphilia.core.ComponentCoreLoader;
import net.javaserver.techniphilia.tools.common.item.PickaxeCopper;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

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
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(PickaxeCopper.instance());
    }
    
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ComponentCoreLoader.registerRender(PickaxeCopper.instance());
    }
}
