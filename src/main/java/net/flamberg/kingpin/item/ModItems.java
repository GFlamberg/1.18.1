package net.flamberg.kingpin.item;

import net.flamberg.kingpin.Kingpin;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Kingpin.MOD_ID);

    public static final RegistryObject<Item> GEM = ITEMS.register("gem" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KINGPIN_TAB)));

    public static final RegistryObject<Item> RAW_GEM = ITEMS.register("raw_gem" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KINGPIN_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
