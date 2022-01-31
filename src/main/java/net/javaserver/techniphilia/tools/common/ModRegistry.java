package net.javaserver.techniphilia.tools.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Logger;

public class ModRegistry {
    public static final String MOD_NAME = "Techniphilia Tools";
    public static final String MOD_ID = "techniphilia-tools";
    public static final String MOD_VERSION = "0.0.0.0";
    public static final String MOD_DEPENDENCIES = "required-after:techniphilia-core@[1.0.1.0,2.0.0.0)";
    public static Logger logger;
    private static ModItemGroup itemGroup = null;
    private ModRegistry() {}
    public static synchronized CreativeTabs getItemGroup() {
        if (itemGroup == null) {
            itemGroup = new ModItemGroup();
        }
        return itemGroup;
    }
    private static class ModItemGroup extends CreativeTabs {
        private ModItemGroup() {
            super("techniphiliaToolsBase");
        }
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.AIR);
        }
    }
}
