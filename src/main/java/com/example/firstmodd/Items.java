package com.example.firstmodd;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.lang.ref.Reference;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class Items {

    public static final Item sword = null;
    public static final Item sword2 = null;
    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(

                new Item(new Item.Properties()).setRegistryName(ExampleMod.MOD_ID, "sword"),
                //new Item(new Item.Properties()).setRegistryName(ExampleMod.MOD_ID, "sword2"),
                new Item(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC)).setRegistryName( ExampleMod.MOD_ID, "sword2")
        );
    }
}