package me.lortseam.noweathereffects.config;

import me.lortseam.completeconfig.api.ConfigContainer;
import me.lortseam.completeconfig.api.ConfigEntries;
import me.lortseam.completeconfig.data.Config;
import me.lortseam.completeconfig.gui.cloth.ClothConfigScreenBuilder;
import me.lortseam.noweathereffects.NoWeatherEffects;
import net.fabricmc.loader.api.FabricLoader;

@ConfigEntries
public class Settings extends Config implements ConfigContainer, NoWeatherEffectsState {

    public static Settings initialize() {
        Settings settings = new Settings();
        settings.load();
        if (FabricLoader.getInstance().isModLoaded("cloth-config")) {
            ClothConfigScreenBuilder.setMain(NoWeatherEffects.MOD_ID, new ClothConfigScreenBuilder());
        }
        return settings;
    }

    private boolean enabled = true;

    private Settings() {
        super(NoWeatherEffects.MOD_ID);
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}
