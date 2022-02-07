package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemPickaxe;

public class PickaxeAluminum extends ItemPickaxe {
    private static PickaxeAluminum instance = null;
    private PickaxeAluminum() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.ALUMINUM_TOOL);
        setUnlocalizedName("pickaxe_aluminum");
        setRegistryName("techniphilia", "pickaxe_aluminum");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized PickaxeAluminum instance() {
        if (instance == null)
            instance = new PickaxeAluminum();
        return instance;
    }
}
