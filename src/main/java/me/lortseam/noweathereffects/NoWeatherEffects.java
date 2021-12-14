package me.lortseam.noweathereffects;

import me.lortseam.noweathereffects.config.Settings;
import me.lortseam.noweathereffects.config.NoWeatherEffectsState;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class NoWeatherEffects implements ClientModInitializer {

    public static final String MOD_ID = "noweathereffects";
    private static NoWeatherEffectsState state;

    public static boolean isEnabled() {
        return state.isEnabled();
    }

    @Override
    public void onInitializeClient() {
        if(FabricLoader.getInstance().isModLoaded("completeconfig")) {
            state = Settings.initialize();
        } else {
            state = NoWeatherEffectsState.DEFAULT;
        }
    }

}
