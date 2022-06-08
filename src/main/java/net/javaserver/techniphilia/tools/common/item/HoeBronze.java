package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemHoe;

public class HoeBronze extends ItemHoe {
    private static HoeBronze instance = null;
    private HoeBronze() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.BRONZE_TOOL);
        setUnlocalizedName("hoe_bronze");
        setRegistryName("techniphilia", "hoe_bronze");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized HoeBronze instance() {
        if (instance == null)
            instance = new HoeBronze();
        return instance;
    }
}
