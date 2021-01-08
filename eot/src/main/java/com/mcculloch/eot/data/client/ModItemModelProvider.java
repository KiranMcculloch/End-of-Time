package com.mcculloch.eot.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator,"eot",existingFileHelper);
    }

    @Override
    protected void registerModels(){
        withExistingParent("copper_block",modLoc("block/copper_block"));
        withExistingParent("copper_block",modLoc("block/lightly_weathered_copper_block"));
        withExistingParent("copper_ore",modLoc("block/copper_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated,"copper_ingot");

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name){
        return getBuilder(name).parent(itemGenerated).texture("layer0","item/" + name);
    }

}
