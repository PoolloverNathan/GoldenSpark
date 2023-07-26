package net.timeworndevs.golden_spark.block;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.timeworndevs.golden_spark.block_entity.EndlessSourceBlockEntity;
import net.timeworndevs.golden_spark.init.GSBlockEntityTypes;
import org.jetbrains.annotations.Nullable;

public class EndlessSourceBlock extends BlockWithEntity {


    public EndlessSourceBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EndlessSourceBlockEntity(GSBlockEntityTypes.ENDLESS_SOURCE_TYPE, pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
