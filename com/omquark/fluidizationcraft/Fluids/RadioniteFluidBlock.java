package com.omquark.fluidizationcraft.Fluids;

import com.omquark.fluidizationcraft.Fluids.ReduxBaseFluid.FluidDamageValues;
import com.omquark.fluidizationcraft.init.ReduxFluids;
import com.omquark.fluidizationcraft.items.ItemVial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;

public class RadioniteFluidBlock extends ReduxBaseFluid {

	public RadioniteFluidBlock(Fluid fluid, Material material) {
		super(fluid, material);

		damageValue = FluidDamageValues.RADIONITE_DAMAGE_VALUE.ordinal();
}
	
	@Override
    public void func_180634_a(World world, BlockPos pos, IBlockState state, Entity entity){
		entityCollideCheck(world, pos, state, entity, radioniteDamage);
	}
}
