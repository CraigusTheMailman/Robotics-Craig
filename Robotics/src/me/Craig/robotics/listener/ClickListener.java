package me.Craig.robotics.listener;

import me.Craig.robotics.Robotics;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ClickListener implements Listener {

	@EventHandler
	public void onCLick(InventoryClickEvent event) {
		HumanEntity entity = event.getWhoClicked();
		if(entity instanceof Player) {
			Player player = (Player)entity;
			
			if(event.getInventory().getName().equals(Robotics.getInventory().getName())) {
				ItemStack clicked = event.getCurrentItem();
				if(clicked != null) {
					if(clicked.getType() == Material.ANVIL) {
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + player.getName() + " clear");
						player.sendMessage(ChatColor.BLUE + "Humaniod Mode Selected!");
					}else if(clicked.getType() == Material.ARROW) {
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + player.getName() + " clear");
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000, 2));
						player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 3));
						player.sendMessage(ChatColor.BLUE + "Tank Mode Selected!");
					}else if(clicked.getType() == Material.BANNER) {
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + player.getName() + " clear");
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000, 10));
						player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 3));
						player.sendMessage(ChatColor.BLUE + "Sniper Mode scSelected!");
					}else if(clicked.getType() == Material.DIAMOND) {
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + player.getName() + " clear");
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 7));
						player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1000000, 200000000));
						player.sendMessage(ChatColor.BLUE + "Drone Mode Selected!");
					}else if(clicked.getType() == Material.EMERALD) {
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + player.getName() + " clear");
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 2));
						player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 1));
						player.sendMessage(ChatColor.BLUE + "Berserker Mode Selected!");
					}
				}
				
				event.setCancelled(true);
				player.closeInventory();
			}
		}
	}
}
