package com.klattet.vanillo.core.init;

import com.klattet.vanillo.vanillo;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, vanillo.MOD_ID);

    public static final RegistryObject<Item> TEMPLATE_ITEM = ITEMS.register("template_item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<BlockItem> TEMPLATE_BLOCK = ITEMS.register("template_block",
            () -> new BlockItem(BlockInit.TEMPLATE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
