package me.Craig.robotics;

import java.util.Arrays;
import java.util.logging.Logger;

import me.Craig.robotics.listener.ClickListener;
import me.Craig.robotics.listener.InteractListener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Robotics extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		
		logger.info("[Robotics-Craig]Creating Robot A...");
		logger.info("[Robotics-Craig]Fixing Robot A's bugs...");
		logger.info("[Robotics-Craig]Testing Robot A...");
		logger.info("[Robotics-Craig]Robot A exploded...");
		logger.info("[Robotics-Craig]Making new Robot...");
		logger.info("[Robotics-Craig]Robotics Enabled!");
		getServer().getPluginManager().registerEvents(new InteractListener(), this);
		getServer().getPluginManager().registerEvents(new ClickListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public static Inventory getInventory() {
		
		Inventory inv = Bukkit.createInventory(null, 9, "Choose a mode!");
		
		{
			ItemStack item = new ItemStack(Material.ANVIL, 1);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.GREEN + "Humaniod Mode");
			meta.setLore(Arrays.asList("Puts you into Humaniod mode!"));
			item.setItemMeta(meta);
			inv.addItem(item);
		}
		{
			ItemStack item = new ItemStack(Material.ARROW, 1);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.GREEN + "Tank Mode");
			meta.setLore(Arrays.asList("Puts you into Tank mode!"));
			item.setItemMeta(meta);
			inv.addItem(item);
		}
		{
			ItemStack item = new ItemStack(Material.BANNER, 1);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.GREEN + "Sniper Mode");
			meta.setLore(Arrays.asList("Puts you into Sniper mode!"));
			item.setItemMeta(meta);
			inv.addItem(item);
		}
		{
			ItemStack item = new ItemStack(Material.DIAMOND, 1);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.GREEN + "Drone Mode");
			meta.setLore(Arrays.asList("Puts you into Drone mode!"));
			item.setItemMeta(meta);
			inv.addItem(item);
		}
		{
			ItemStack item = new ItemStack(Material.EMERALD, 1);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.GREEN + "Berserker Mode");
			meta.setLore(Arrays.asList("Puts you into Berserker mode!"));
			item.setItemMeta(meta);
			inv.addItem(item);
		}
		
		return inv;
	}

	public static Inventory getInventory2() {
	
		Inventory inv = Bukkit.createInventory(null, 9, "Get your sword!");
		
		{
			ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Lab Blade");
			meta.setLore(Arrays.asList(ChatColor.BLUE + "Blade owner:", ChatColor.BLUE + "0987654673838a388d80b", ChatColor.BLUE + "Blade wielder type:", ChatColor.BLUE + "Whip Blade"));
			item.setItemMeta(meta);
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 10);
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 10);
			item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 10);
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 10);
			inv.addItem(item);
		}
		
		return inv;
	}
		

}
