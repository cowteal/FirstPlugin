package me.cowteal.FirstPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Main(),this);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		e.setJoinMessage(ChatColor.AQUA + p.getPlayerListName() + ChatColor.GOLD + " Has Joined The " + ChatColor.GREEN + "Awesome " + ChatColor.GOLD + "Server!");
		p.sendMessage(ChatColor.GOLD + "Welcome To My Server " + ChatColor.AQUA + p.getPlayerListName());
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("cowteal")){
			player.sendMessage(ChatColor.GOLD + "You Ran The Command " + ChatColor.AQUA + "Cowteal!");
			player.setAllowFlight(true);
		}
		return true;
	}

}
