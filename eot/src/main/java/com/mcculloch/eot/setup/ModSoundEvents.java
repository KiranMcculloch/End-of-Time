package com.mcculloch.eot.setup;

import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;


public class ModSoundEvents {
    public static final RegistryObject<SoundEvent> COPPER_BREAK1 = register("copper_break1");

    static void register() {}

    private static RegistryObject<SoundEvent> register(String name){
        ResourceLocation soundLoc = new ResourceLocation(name);
        RegistryObject<SoundEvent> ret = Registration.SOUND_EVENTS.register(name, () -> new SoundEvent(soundLoc));
        return ret;
    }
}


