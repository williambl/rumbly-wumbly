package com.williambl.rumbly_wumbly;

import me.shedaniel.architectury.platform.forge.EventBuses;
import com.williambl.rumbly_wumbly.RumblyWumbly;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RumblyWumbly.MOD_ID)
public class RumblyWumblyForge {
    public RumblyWumblyForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(com.williambl.rumbly_wumbly.RumblyWumbly.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RumblyWumbly.init();
    }
}
