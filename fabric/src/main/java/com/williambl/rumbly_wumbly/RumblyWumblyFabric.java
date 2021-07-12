package com.williambl.rumbly_wumbly;

import com.williambl.rumbly_wumbly.RumblyWumbly;
import net.fabricmc.api.ModInitializer;

public class RumblyWumblyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RumblyWumbly.init();
    }
}
