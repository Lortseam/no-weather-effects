package me.lortseam.noweathereffects;

import me.lortseam.noweathereffects.config.ModConfig;
import me.lortseam.noweathereffects.config.IModConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class NoWeatherEffects implements ClientModInitializer {

    public static final String MOD_ID = "noweathereffects";
    @Nullable
    private static IModConfig config;

    @Override
    public void onInitializeClient() {
        if(FabricLoader.getInstance().isModLoaded("completeconfig-base")) {
            config = ModConfig.initialize();
        }
    }

    public static boolean isEnabled() {
        return config == null || config.isEnabled();
    }

    public static Optional<IModConfig> getConfig() {
        return Optional.ofNullable(config);
    }

}
