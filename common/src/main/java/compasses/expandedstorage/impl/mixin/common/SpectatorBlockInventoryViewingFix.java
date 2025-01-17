package compasses.expandedstorage.impl.mixin.common;

import com.llamalad7.mixinextras.sugar.Local;
import compasses.expandedstorage.impl.inventory.OpenableInventoryProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerPlayerGameMode;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerGameMode.class)
public abstract class SpectatorBlockInventoryViewingFix {
    @Inject(
            method = "useItemOn(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/block/state/BlockState;getMenuProvider(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/MenuProvider;"
            ),
            cancellable = true
    )
    private void expandedstorage$beforeVanillaSpectatorInventoryViewing(ServerPlayer player, Level level, ItemStack handStack, InteractionHand hand, BlockHitResult blockHit, CallbackInfoReturnable<InteractionResult> cir, @Local(ordinal = 0) BlockState state) {
        if (state.getBlock() instanceof OpenableInventoryProvider<?>) {
            state.useWithoutItem(level, player, blockHit);
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
    }
}
