package net.javaserver.techniphilia.tools.common.item;

import net.javaserver.techniphilia.tools.common.ModRegistry;
import net.minecraft.item.ItemSpade;

public class ShovelAluminum extends ItemSpade {
    private static ShovelAluminum instance = null;
    private ShovelAluminum() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.ALUMINUM_TOOL);
        setUnlocalizedName("shovel_aluminum");
        setRegistryName("techniphilia", "shovel_aluminum");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ShovelAluminum instance() {
        if (instance == null)
            instance = new ShovelAluminum();
        return instance;
    }
}
