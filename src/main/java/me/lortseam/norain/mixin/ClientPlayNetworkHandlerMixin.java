package me.lortseam.norain.mixin;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public abstract class ClientPlayNetworkHandlerMixin {

    @Inject(method = "onEntitySpawn", at = @At(value = "NEW", target = "net/minecraft/entity/LightningEntity"), cancellable = true)
    private void noweathereffects$cancelLightningSpawn(CallbackInfo ci) {
        ci.cancel();
    }

}
