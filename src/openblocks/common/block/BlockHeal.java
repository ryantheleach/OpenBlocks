package openblocks.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import openblocks.OpenBlocks;
import openblocks.common.tileentity.TileEntityHealBlock;

public class BlockHeal extends OpenBlock {

	public BlockHeal() {
		super(OpenBlocks.Config.blockHealId, Material.ground);
		setupBlock(this, "heal", "Heal Block", TileEntityHealBlock.class);
	}

	@Override
	public boolean canBeReplacedByLeaves(World world, int x, int y, int z) {
		return false;
	}

	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z,
			int metadata, ForgeDirection face) {
		return false;
	}

}
