package me.lortseam.noweathereffects.config;

import me.lortseam.completeconfig.api.ConfigContainer;
import me.lortseam.completeconfig.api.ConfigEntries;
import me.lortseam.completeconfig.data.Config;
import me.lortseam.completeconfig.gui.cloth.ClothConfigScreenBuilder;
import me.lortseam.noweathereffects.NoWeatherEffects;
import net.fabricmc.loader.api.FabricLoader;

@ConfigEntries
public class ModConfig extends Config implements ConfigContainer, ModState {

    public static ModConfig initialize() {
        ModConfig config = new ModConfig();
        config.load();
        if (FabricLoader.getInstance().isModLoaded("cloth-config")) {
            ClothConfigScreenBuilder.setMain(NoWeatherEffects.MOD_ID, new ClothConfigScreenBuilder());
        }
        return config;
    }

    private boolean enabled = true;

    private ModConfig() {
        super(NoWeatherEffects.MOD_ID);
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}
