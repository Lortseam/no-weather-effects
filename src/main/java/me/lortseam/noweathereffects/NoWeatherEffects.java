package me.lortseam.noweathereffects;

import me.lortseam.noweathereffects.config.ModConfig;
import me.lortseam.noweathereffects.config.ModState;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class NoWeatherEffects implements ClientModInitializer {

    public static final String MOD_ID = "noweathereffects";
    private static ModState state;

    public static boolean isEnabled() {
        return state.isEnabled();
    }

    @Override
    public void onInitializeClient() {
        if(FabricLoader.getInstance().isModLoaded("completeconfig-base")) {
            state = ModConfig.initialize();
        } else {
            state = ModState.DEFAULT;
        }
    }

}
