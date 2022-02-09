package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemSpade;

public class ShovelCopper extends ItemSpade {
    private static ShovelCopper instance = null;
    private ShovelCopper() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.COPPER_TOOL);
        setUnlocalizedName("shovel_copper");
        setRegistryName("techniphilia", "shovel_copper");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ShovelCopper instance() {
        if (instance == null)
            instance = new ShovelCopper();
        return instance;
    }
}
