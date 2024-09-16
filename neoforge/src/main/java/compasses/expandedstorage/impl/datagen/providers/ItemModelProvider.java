package compasses.expandedstorage.impl.datagen.providers;

import compasses.expandedstorage.impl.misc.Utils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public final class ItemModelProvider extends net.neoforged.neoforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, Utils.MOD_ID, fileHelper);
    }

    @Override
    protected void registerModels() {
        ModelHelper.registerItemModels(this::simple);

        //this.chest(ModItems.WOOD_CHEST);
        //this.chest(ModItems.PUMPKIN_CHEST);
        //this.chest(ModItems.PRESENT);
        //this.chest(ModItems.IRON_CHEST);
        //this.chest(ModItems.GOLD_CHEST);
        //this.chest(ModItems.DIAMOND_CHEST);
        //this.chest(ModItems.OBSIDIAN_CHEST);
        //this.chest(ModItems.NETHERITE_CHEST);

        //this.oldChest(ModItems.OLD_WOOD_CHEST);
        //this.oldChest(ModItems.OLD_IRON_CHEST);
        //this.oldChest(ModItems.OLD_GOLD_CHEST);
        //this.oldChest(ModItems.OLD_DIAMOND_CHEST);
        //this.oldChest(ModItems.OLD_OBSIDIAN_CHEST);
        //this.oldChest(ModItems.OLD_NETHERITE_CHEST);

        //this.barrel(ModItems.IRON_BARREL);
        //this.barrel(ModItems.GOLD_BARREL);
        //this.barrel(ModItems.DIAMOND_BARREL);
        //this.barrel(ModItems.OBSIDIAN_BARREL);
        //this.barrel(ModItems.NETHERITE_BARREL);
    }

    @SuppressWarnings("ConstantConditions")
    private void simple(Item item) {
        String itemId = BuiltInRegistries.ITEM.getKey(item).getPath();
        this.withExistingParent(itemId, mcLoc("item/generated")).texture("layer0", "item/" + itemId);
    }

//    @SuppressWarnings("ConstantConditions")
//    private void chest(Item item) {
//        this.withExistingParent(ForgeRegistries.ITEMS.getKey(item).getPath(), mcLoc("item/chest"));
//    }

//    @SuppressWarnings("ConstantConditions")
//    private void oldChest(BlockItem item) {
//        this.getBuilder(ForgeRegistries.ITEMS.getKey(item).getPath()).parent(this.getExistingFile(Utils.id("block/" + ForgeRegistries.BLOCKS.getKey(item.getBlock()).getPath() + "/single")));
//    }

//    @SuppressWarnings("ConstantConditions")
//    private void barrel(BlockItem item) {
//        this.getBuilder(ForgeRegistries.ITEMS.getKey(item).getPath()).parent(this.getExistingFile(Utils.id("block/" + ForgeRegistries.BLOCKS.getKey(item.getBlock()).getPath())));
//    }

    @Override
    public String getName() {
        return "Expanded Storage/Item Models";
    }
}
