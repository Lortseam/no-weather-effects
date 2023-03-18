package me.lortseam.noweathereffects.mixin;

import me.lortseam.noweathereffects.NoWeatherEffects;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyBinding.class)
public abstract class KeyBindingMixin {

    @Inject(method = "onKeyPressed", at = @At("RETURN"))
    private static void uglyscoreboardfix$onKey(InputUtil.Key key, CallbackInfo ci) {
        NoWeatherEffects.getConfig().ifPresent((config) -> {
            if (key == config.getToggleKey()) {
                config.toggle();
            }
        });
    }

}
