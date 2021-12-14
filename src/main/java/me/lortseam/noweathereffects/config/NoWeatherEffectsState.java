package me.lortseam.noweathereffects.config;

public interface NoWeatherEffectsState {

    NoWeatherEffectsState DEFAULT = () -> true;

    boolean isEnabled();

}
