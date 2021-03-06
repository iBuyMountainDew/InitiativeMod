package com.initstudios.initiative.util.handlers;

import com.initstudios.initiative.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class FallEventHandler {
	
	@SubscribeEvent
    public static void cancelPlayerFallDamage(LivingFallEvent event)
    {
		if (event.getEntityLiving() instanceof EntityPlayer)
		{
        	EntityPlayer player = (EntityPlayer) event.getEntityLiving();
 
        	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.LB_LONG_FALL_BOOTS)
        	{
            	event.setCanceled(true);
        	}
	    }
    }
}
