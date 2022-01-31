package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemPickaxe;

public class PickaxeCopper extends ItemPickaxe {
    private static PickaxeCopper instance = null;
    private PickaxeCopper() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.COPPER_TOOL);
        setUnlocalizedName("pickaxe_copper");
        setRegistryName("techniphilia", "pickaxe_copper");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized PickaxeCopper instance() {
        if (instance == null)
            instance = new PickaxeCopper();
        return instance;
    }
}
