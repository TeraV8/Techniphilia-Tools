package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemSpade;

public class ShovelBronze extends ItemSpade {
    private static ShovelBronze instance = null;
    private ShovelBronze() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.BRONZE_TOOL);
        setUnlocalizedName("shovel_bronze");
        setRegistryName("techniphilia", "shovel_bronze");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ShovelBronze instance() {
        if (instance == null)
            instance = new ShovelBronze();
        return instance;
    }
}
