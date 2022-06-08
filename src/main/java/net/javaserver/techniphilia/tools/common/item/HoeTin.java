package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemHoe;

public class HoeTin extends ItemHoe {
    private static HoeTin instance = null;
    private HoeTin() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.TIN_TOOL);
        setUnlocalizedName("hoe_tin");
        setRegistryName("techniphilia", "hoe_tin");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized HoeTin instance() {
        if (instance == null)
            instance = new HoeTin();
        return instance;
    }
}
