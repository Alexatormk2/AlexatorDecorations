package net.alexatorv13.alexatordecorations.block.custom;


import net.alexatorv13.alexatordecorations.AlexatorDecorations;
import net.alexatorv13.alexatordecorations.entity.Modentities;
import net.alexatorv13.alexatordecorations.entity.custom.ChairEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Instrument;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


@SuppressWarnings("deprecation")
public class BaseChairFacing extends HorizontalFacingBlock {


    public static final DirectionProperty FACING = Properties.HOPPER_FACING;
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0, 2.2, 3.0, 13.0, 6.0, 13.0);


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            Entity entity = null;
            List<ChairEntity> entities = world.getEntitiesByType(Modentities.CHAIR_ENTITY, new Box(pos), chair -> true);
            if (entities.isEmpty()) {
                entity = Modentities.CHAIR_ENTITY.spawn((ServerWorld) world, pos, SpawnReason.TRIGGERED);

            } else {
                entity = entities.get(0);
            }
            player.startRiding(entity);
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {


        if (!world.isClient()){
     world.getEntitiesByType(Modentities.CHAIR_ENTITY, new Box(pos), chair -> true).forEach(Entity::kill);


        }

        super.onStateReplaced(state, world, pos, newState, moved);
    }


    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


    public BaseChairFacing(Settings settings) {

        super(settings);
    }
}



