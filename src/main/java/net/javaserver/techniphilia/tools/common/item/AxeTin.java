package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemAxe;

public class AxeTin extends ItemAxe {
    private static AxeTin instance = null;
    private AxeTin() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.TIN_TOOL,
                net.javaserver.techniphilia.core.common.ModRegistry.TIN_TOOL.getAttackDamage(),
                net.javaserver.techniphilia.core.common.ModRegistry.TIN_TOOL.getEfficiency());
        setUnlocalizedName("axe_tin");
        setRegistryName("techniphilia", "axe_tin");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized AxeTin instance() {
        if (instance == null)
            instance = new AxeTin();
        return instance;
    }
}
