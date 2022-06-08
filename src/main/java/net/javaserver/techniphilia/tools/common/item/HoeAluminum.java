package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemHoe;

public class HoeAluminum extends ItemHoe {
    private static HoeAluminum instance = null;
    private HoeAluminum() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.ALUMINUM_TOOL);
        setUnlocalizedName("hoe_aluminum");
        setRegistryName("techniphilia", "hoe_aluminum");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized HoeAluminum instance() {
        if (instance == null)
            instance = new HoeAluminum();
        return instance;
    }
}
