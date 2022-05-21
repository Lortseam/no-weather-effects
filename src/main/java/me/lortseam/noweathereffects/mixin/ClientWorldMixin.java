package me.lortseam.noweathereffects.mixin;

import me.lortseam.noweathereffects.NoWeatherEffects;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.MutableWorldProperties;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;

import java.util.function.Supplier;

@Mixin(ClientWorld.class)
public abstract class ClientWorldMixin extends World {

    private ClientWorldMixin(MutableWorldProperties properties, RegistryKey<World> registryRef, RegistryEntry<DimensionType> dimension, Supplier<Profiler> supplier, boolean isClient, boolean debugWorld, long seed, int maxChainedNeighborUpdates) {
        super(properties, registryRef, dimension, supplier, isClient, debugWorld, seed, maxChainedNeighborUpdates);
    }

    @Override
    public float getRainGradient(float delta) {
        return NoWeatherEffects.isEnabled() ? 0 : super.getRainGradient(delta);
    }

    @Override
    public float getThunderGradient(float delta) {
        return NoWeatherEffects.isEnabled() ? 0 : super.getThunderGradient(delta);
    }

}
