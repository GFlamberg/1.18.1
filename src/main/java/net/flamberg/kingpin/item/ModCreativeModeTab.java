package net.flamberg.kingpin.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab KINGPIN_TAB = new CreativeModeTab("kingpintab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GEM.get());
        }
    };
}
