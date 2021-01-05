package com.mcculloch.eot.setup;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> COPPER_ORE = register("copper_ore", ()->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 5).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block", ()->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2, 5).harvestLevel(2).sound(SoundType.METAL)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends  Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }
}
