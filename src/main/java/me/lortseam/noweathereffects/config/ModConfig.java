package me.lortseam.noweathereffects.config;

import lombok.Getter;
import me.lortseam.completeconfig.api.ConfigEntries;
import me.lortseam.completeconfig.data.Config;
import me.lortseam.completeconfig.gui.ConfigScreenBuilder;
import me.lortseam.completeconfig.gui.cloth.ClothConfigScreenBuilder;
import me.lortseam.noweathereffects.NoWeatherEffects;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.util.InputUtil;

@ConfigEntries(includeAll = true)
public class ModConfig extends Config implements IModConfig {

    public static ModConfig initialize() {
        ModConfig config = new ModConfig();
        config.load();
        if (FabricLoader.getInstance().isModLoaded("cloth-config")) {
            ConfigScreenBuilder.setMain(NoWeatherEffects.MOD_ID, new ClothConfigScreenBuilder());
        }
        return config;
    }

    private boolean enabled = true;
    @Getter
    private InputUtil.Key toggleKey = InputUtil.UNKNOWN_KEY;

    private ModConfig() {
        super(NoWeatherEffects.MOD_ID);
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void toggle() {
        enabled = !enabled;
        save();
    }

}
