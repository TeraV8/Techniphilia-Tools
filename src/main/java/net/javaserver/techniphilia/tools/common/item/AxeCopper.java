package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemAxe;

public class AxeCopper extends ItemAxe {
    private static AxeCopper instance = null;
    private AxeCopper() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.COPPER_TOOL,
                net.javaserver.techniphilia.core.common.ModRegistry.COPPER_TOOL.getAttackDamage(),
                net.javaserver.techniphilia.core.common.ModRegistry.COPPER_TOOL.getEfficiency());
        setUnlocalizedName("axe_copper");
        setRegistryName("techniphilia", "axe_copper");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized AxeCopper instance() {
        if (instance == null)
            instance = new AxeCopper();
        return instance;
    }
}
