package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemAxe;

public class AxeAluminum extends ItemAxe {
    private static AxeAluminum instance = null;
    private AxeAluminum() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.ALUMINUM_TOOL,
                net.javaserver.techniphilia.core.common.ModRegistry.ALUMINUM_TOOL.getAttackDamage(),
                net.javaserver.techniphilia.core.common.ModRegistry.ALUMINUM_TOOL.getEfficiency());
        setUnlocalizedName("axe_aluminum");
        setRegistryName("techniphilia", "axe_aluminum");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized AxeAluminum instance() {
        if (instance == null)
            instance = new AxeAluminum();
        return instance;
    }
}
