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
import net.javaserver.techniphilia.tools.common.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_ID,
        name = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_NAME,
        version = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_VERSION,
        dependencies = net.javaserver.techniphilia.tools.common.ModRegistry.MOD_DEPENDENCIES)
@Mod.EventBusSubscriber
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
        registry.register(PickaxeTin.instance());
        registry.register(PickaxeBronze.instance());
        registry.register(PickaxeAluminum.instance());
        registry.register(ShovelCopper.instance());
        registry.register(ShovelTin.instance());
        registry.register(ShovelBronze.instance());
        registry.register(ShovelAluminum.instance());
        registry.register(AxeCopper.instance());
        registry.register(AxeTin.instance());
        registry.register(AxeBronze.instance());
        registry.register(AxeAluminum.instance());
        registry.register(HoeCopper.instance());
        registry.register(HoeTin.instance());
        registry.register(HoeBronze.instance());
        registry.register(HoeAluminum.instance());
    }
    
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ComponentCoreLoader.registerRender(PickaxeCopper.instance());
        ComponentCoreLoader.registerRender(PickaxeTin.instance());
        ComponentCoreLoader.registerRender(PickaxeBronze.instance());
        ComponentCoreLoader.registerRender(PickaxeAluminum.instance());
        ComponentCoreLoader.registerRender(ShovelCopper.instance());
        ComponentCoreLoader.registerRender(ShovelTin.instance());
        ComponentCoreLoader.registerRender(ShovelBronze.instance());
        ComponentCoreLoader.registerRender(ShovelAluminum.instance());
        ComponentCoreLoader.registerRender(AxeCopper.instance());
        ComponentCoreLoader.registerRender(AxeTin.instance());
        ComponentCoreLoader.registerRender(AxeBronze.instance());
        ComponentCoreLoader.registerRender(AxeAluminum.instance());
        ComponentCoreLoader.registerRender(HoeCopper.instance());
        ComponentCoreLoader.registerRender(HoeTin.instance());
        ComponentCoreLoader.registerRender(HoeBronze.instance());
        ComponentCoreLoader.registerRender(HoeAluminum.instance());
    }
}
