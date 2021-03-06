package com.initstudios.initiative.init;

import java.util.ArrayList;
import java.util.List;

import com.initstudios.initiative.items.ItemBase;
import com.initstudios.initiative.items.ItemSpeedGelBall;
import com.initstudios.initiative.util.Reference;
import com.initstudios.initiative.items.ArmorBase;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL_INGOT = EnumHelper.addArmorMaterial("armor_material_steel_ingot", Reference.MOD_ID + ":ow_steel_ingot", 20, new int[] {5, 10, 12, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Moon
	public static final Item MD_ROCK_REFINED = new ItemBase("md_rock_refined");
	//Normal
	public static final Item OW_BH_DUST = new ItemBase("ow_bh_dust");
	public static final Item OW_BH_UNSTABLE = new ItemBase("ow_bh_unstable");
	public static final Item OW_BH_STABLE = new ItemBase("ow_bh_stable");
	public static final Item OW_BH_CRYSTAL = new ItemBase("ow_bh_crystal");
	public static final Item OW_STEEL_INGOT = new ItemBase("ow_steel_ingot");
	public static final Item OW_RFSTEEL_INGOT = new ItemBase("ow_rfsteel_ingot");
	//Laboratory
	public static final Item LB_PG_NORMAL = new ItemBase("lb_pg_normal");
	public static final Item LB_LONG_FALL_BOOTS = new ArmorBase("lb_long_fall_boots", ARMOR_MATERIAL_STEEL_INGOT, 1, EntityEquipmentSlot.FEET);
	public static final Item LB_GEL_SPEED_BALL = new ItemSpeedGelBall("lb_gel_speed_ball");
}