package com.mcculloch.eot.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.rmi.registry.Registry;

public class ModItems {
    public static final RegistryObject<Item> BLUE_ROSE = Registration.ITEMS.register("blue_rose",() ->
            new Item(new Item.Properties().group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> OLD_FISH = Registration.ITEMS.register("old_fish",() ->
            new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> COPPER_INGOT = Registration.ITEMS.register("copper_ingot",() ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register() {};


}
