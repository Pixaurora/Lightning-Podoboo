package dev.lostluma.lightningpodoboo.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import dev.lostluma.lightningpodoboo.CosmeticFireBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Mixin(Registry.class)
public class RegistryMixin {
    @Inject(method = "freezeRegistries()V", at = @At("HEAD"))
    private static void beforeRegistryFreeze(CallbackInfo callbackInfo) {
        Registry.register(Registry.BLOCK, new Identifier("lightningpodoboo", "cosmetic_fire"), CosmeticFireBlock.getInstance());
    }
}
