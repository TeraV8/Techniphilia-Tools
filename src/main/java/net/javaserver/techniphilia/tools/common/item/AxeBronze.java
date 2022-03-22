package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemAxe;

public class AxeBronze extends ItemAxe {
    private static AxeBronze instance = null;
    private AxeBronze() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.BRONZE_TOOL,
                net.javaserver.techniphilia.core.common.ModRegistry.BRONZE_TOOL.getAttackDamage(),
                net.javaserver.techniphilia.core.common.ModRegistry.BRONZE_TOOL.getEfficiency());
        setUnlocalizedName("axe_bronze");
        setRegistryName("techniphilia", "axe_bronze");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized AxeBronze instance() {
        if (instance == null)
            instance = new AxeBronze();
        return instance;
    }
}
