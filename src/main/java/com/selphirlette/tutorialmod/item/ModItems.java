package com.selphirlette.tutorialmod.item;

import com.selphirlette.tutorialmod.TutorialMod;
import com.selphirlette.tutorialmod.item.custom.DowsingRodItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // Generic Items
    // Item register names must be lowercase, no spaces, and unique.
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> RIFLE = ITEMS.register("rifle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> ALGAL_BLEND = ITEMS.register("algal_blend",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));


    // Custom Items
    public static final RegistryObject<Item> DOWSING_ROD  = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).durability(128)));

    public static final RegistryObject<Item> CUSTOM_BOW  = ITEMS.register("custom_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).durability(500)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
