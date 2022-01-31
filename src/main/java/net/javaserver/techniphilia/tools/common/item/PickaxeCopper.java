package net.javaserver.techniphilia.tools.common.item;

import net.minecraft.item.ItemPickaxe;

public class PickaxeCopper extends ItemPickaxe {
    private static PickaxeCopper instance = null;
    private PickaxeCopper() {
        super(net.javaserver.techniphilia.core.common.ModRegistry.COPPER_TOOL);
    }
}
