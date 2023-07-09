package com.github.happyrogelio7.nightvisionplugingiveplayerjoin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class NightVisionPluginGivePlayerJoin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a NightVisionPluginGivePlayerJoin has been enabled!"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a Version:&f 1.0"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a Author:&f HappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a GitHub:&f https://github.com/HappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));


        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getCommand("nightvisionplugingiveplayerjoin").setExecutor(new NightVisionPluginGivePlayerJoinCMD());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c NightVisionPluginGivePlayerJoin has been disabled!"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c Version:&f 1.0"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a Author:&f HappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a GitHub:&f https://github.com/HappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));
    }

    private class PlayerJoinListener implements Listener {

        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent event) {
            Player player = event.getPlayer();
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 1));
        }

    }

    private class NightVisionPluginGivePlayerJoinCMD implements CommandExecutor {


        @Override
        public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a NightVisionPluginGivePlayerJoin"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a Version:&f 1.0"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a Author:&f HappyRogelio7"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a GitHub:&f https://github.com/HappyRogelio7"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&r "));

            return true;
        }
    }


}
