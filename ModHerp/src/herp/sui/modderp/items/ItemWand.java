/**
 * 
 */
package herp.sui.modderp.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author suicune_dude
 *
 */
public class ItemWand extends Item {

	public ItemWand(int id) {
		super(id);
		
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		
		setUnlocalizedName(ItemInfo.WAND_UNLOC_NAME);
	}

	/* (non-Javadoc)
	 * @see net.minecraft.item.Item#itemInteractionForEntity(net.minecraft.item.ItemStack, net.minecraft.entity.player.EntityPlayer, net.minecraft.entity.EntityLivingBase)
	 */
	@Override
	public boolean itemInteractionForEntity(ItemStack par1ItemStack,
			EntityPlayer user, EntityLivingBase target) {
	
		if(!target.worldObj.isRemote) {
			target.motionY = 2;
		}
		
		return false;
	}
	

}
