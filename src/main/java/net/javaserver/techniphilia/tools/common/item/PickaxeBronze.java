package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemPickaxe;

public class PickaxeBronze extends ItemPickaxe {
    private static PickaxeBronze instance = null;
    private PickaxeBronze() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.BRONZE_TOOL);
        setUnlocalizedName("pickaxe_bronze");
        setRegistryName("techniphilia", "pickaxe_bronze");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized PickaxeBronze instance() {
        if (instance == null)
            instance = new PickaxeBronze();
        return instance;
    }
}
