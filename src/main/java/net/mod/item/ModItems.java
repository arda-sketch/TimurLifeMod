package net.mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mod.TimurLifeMod;
import net.mod.item.custom.CigaretteItem;
import net.mod.item.custom.CigaretteStrength;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TimurLifeMod.MOD_ID);

    public static final RegistryObject<Item> SOBRANIE_CIGARETTE = ITEMS.register("sobranie_cigarette",
            () -> new CigaretteItem(new Item.Properties()
                    .tab(ModCreativeModeTab.TIMURLIFE_TAB)
                    .stacksTo(1)
                    .setNoRepair()
                    .durability(5)
                    , CigaretteStrength.MIDDLE));

    public static final RegistryObject<Item> BOGATYRI_CIGARETTE = ITEMS.register("bogatyri_cigarette",
            () -> new CigaretteItem(new Item.Properties()
                    .tab(ModCreativeModeTab.TIMURLIFE_TAB)
                    .stacksTo(1)
                    .setNoRepair()
                    .durability(8)
                    , CigaretteStrength.EXTRA));

    public static final RegistryObject<Item> CHESTERFIELD_CIGARETTE = ITEMS.register("chesterfield_cigarette",
            () -> new CigaretteItem(new Item.Properties()
                    .tab(ModCreativeModeTab.TIMURLIFE_TAB)
                    .stacksTo(1)
                    .setNoRepair()
                    .durability(4)
                    , CigaretteStrength.MIDDLE));

    public static final RegistryObject<Item> LD100_CIGARETTE = ITEMS.register("ld100_cigarette",
            () -> new CigaretteItem(new Item.Properties()
                    .tab(ModCreativeModeTab.TIMURLIFE_TAB)
                    .stacksTo(1)
                    .setNoRepair()
                    .durability(3)
                    , CigaretteStrength.LIGHT));

    public static final RegistryObject<Item> MACKINTOSH_CIGARETTE = ITEMS.register("mackintosh_cigarette",
            () -> new CigaretteItem(new Item.Properties()
                    .tab(ModCreativeModeTab.TIMURLIFE_TAB)
                    .stacksTo(1)
                    .setNoRepair()
                    .durability(6)
                    , CigaretteStrength.STRONG));

    public static final RegistryObject<Item> MARLBORO_CIGARETTE = ITEMS.register("marlboro_cigarette",
            () -> new CigaretteItem(new Item.Properties()
                    .tab(ModCreativeModeTab.TIMURLIFE_TAB)
                    .stacksTo(1)
                    .setNoRepair()
                    .durability(5)
                    , CigaretteStrength.MIDDLE));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
