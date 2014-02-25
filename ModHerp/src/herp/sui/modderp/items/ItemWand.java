/**
 * 
 */
package herp.sui.modderp.items;

import herp.sui.modderp.lib.Values;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		itemIcon = register.registerIcon(Values.TEX_LOC + ":" + ItemInfo.WAND_ICON);
	}

}
