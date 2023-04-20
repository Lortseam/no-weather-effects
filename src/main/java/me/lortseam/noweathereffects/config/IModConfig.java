package me.lortseam.noweathereffects.config;

import net.minecraft.client.util.InputUtil;

public interface IModConfig {

    boolean isEnabled();

    InputUtil.Key getToggleKey();

    void toggle();

}
