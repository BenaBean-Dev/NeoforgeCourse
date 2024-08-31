package net.benabean.mccourse.datagen;

import net.benabean.mccourse.McCourse;
import net.benabean.mccourse.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, McCourse.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
        simpleBlockWithItem(ModBlocks.RAW_BLACK_OPAL_BLOCK);
        simpleBlockWithItem(ModBlocks.BLACK_OPAL_ORE);
        simpleBlockWithItem(ModBlocks.BLACK_OPAL_DEEPSLATE_ORE);
        simpleBlockWithItem(ModBlocks.BLACK_OPAL_END_ORE);
        simpleBlockWithItem(ModBlocks.BLACK_OPAL_NETHER_ORE);
        simpleBlockWithItem(ModBlocks.MAGIC_BLOCK);
    }

    private void simpleBlockWithItem(DeferredBlock<Block> deferredBlock)
    {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
