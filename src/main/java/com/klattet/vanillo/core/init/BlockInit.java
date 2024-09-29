package com.klattet.vanillo.core.init;

import com.klattet.vanillo.vanillo;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, vanillo.MOD_ID);

    public static final RegistryObject<Block> TEMPLATE_BLOCK = BLOCKS.register("template_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.BARRIER)));

    public static final RegistryObject<CustomBlock> CUSTOM_BLOCK = BLOCKS.register("custom_block",
            () -> new CustomBlock(BlockBehaviour.Properties.of(Material.BARRIER)));
}
