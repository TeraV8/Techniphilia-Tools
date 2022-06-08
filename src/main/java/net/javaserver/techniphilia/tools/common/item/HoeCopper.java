package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemHoe;

public class HoeCopper extends ItemHoe {
    private static HoeCopper instance = null;
    private HoeCopper() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.COPPER_TOOL);
        setUnlocalizedName("hoe_copper");
        setRegistryName("techniphilia", "hoe_copper");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized HoeCopper instance() {
        if (instance == null)
            instance = new HoeCopper();
        return instance;
    }
}
