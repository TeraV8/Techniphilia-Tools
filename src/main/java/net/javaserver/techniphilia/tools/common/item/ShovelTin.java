package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemSpade;

public class ShovelTin extends ItemSpade {
    private static ShovelTin instance = null;
    private ShovelTin() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.TIN_TOOL);
        setUnlocalizedName("shovel_tin");
        setRegistryName("techniphilia", "shovel_tin");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ShovelTin instance() {
        if (instance == null)
            instance = new ShovelTin();
        return instance;
    }
}
