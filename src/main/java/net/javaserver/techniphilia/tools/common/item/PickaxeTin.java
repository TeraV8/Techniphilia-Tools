package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemPickaxe;

public class PickaxeTin extends ItemPickaxe {
    private static PickaxeTin instance = null;
    private PickaxeTin() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.TIN_TOOL);
        setUnlocalizedName("pickaxe_tin");
        setRegistryName("techniphilia", "pickaxe_tin");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized PickaxeTin instance() {
        if (instance == null)
            instance = new PickaxeTin();
        return instance;
    }
}
