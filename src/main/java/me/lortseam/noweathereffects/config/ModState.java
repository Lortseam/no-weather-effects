package me.lortseam.noweathereffects.config;

public interface ModState {

    ModState DEFAULT = () -> true;

    boolean isEnabled();

}
