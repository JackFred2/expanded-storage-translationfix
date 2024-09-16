package compasses.expandedstorage.impl.datagen.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class LootTableProvider extends net.minecraft.data.loot.LootTableProvider {
    public LootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, Set.of(), List.of(new SubProviderEntry(BlockLootProvider::new, LootContextParamSets.BLOCK)), provider);
    }

    @Override
    public String getName() {
        return "Expanded Storage/" + super.getName();
    }
}
