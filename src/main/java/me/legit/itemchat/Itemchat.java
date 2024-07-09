package me.legit.itemchat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Itemchat extends JavaPlugin {

    public String msgcolor(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    String prefix = msgcolor("&e[&6ItemChat&e]&r ");

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&eItemChat Plugin Started !!"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&ePlugin Version: &c1.0"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&ePlugin Made By: &cLegit Killer"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));
        this.getCommand("itemchat").setExecutor(new ItemChatCommand());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&eItemChat Plugin Stopped !!"));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+" "));
        Bukkit.getConsoleSender().sendMessage(msgcolor(prefix+"&c------------------------------"));
    }
}