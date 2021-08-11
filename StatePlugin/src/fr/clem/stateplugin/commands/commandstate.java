package fr.clem.stateplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.clem.stateplugin.state.State;

public class commandstate implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String player_name, String[] args) {
		// TODO Auto-generated method stub
		
		if(sender instanceof Player) {
			Player player = (Player)sender; 
			
			if(cmd.getName().equalsIgnoreCase("etat creer")) {
				State args = new State(args, player, player);
				return true; 
			}
			
			if(cmd.getName().equalsIgnoreCase("alert")) {
				
			
				
				return true; 
			}
			
		}
		
		return false;
	}

}
