package me.lortseam.noweathereffects.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.lortseam.completeconfig.data.Config;
import me.lortseam.completeconfig.gui.cloth.ClothConfigScreenBuilder;
import me.lortseam.noweathereffects.NoWeatherEffects;

public class ModMenuIntegration implements ModMenuApi {

    private static final ClothConfigScreenBuilder configScreenBuilder = new ClothConfigScreenBuilder();

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> NoWeatherEffects.getConfig().map(config -> configScreenBuilder.build(parent, (Config) config)).orElse(null);
    }

}
