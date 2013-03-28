package com.elysiummc.Iemote;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Iemote extends JavaPlugin {
	 
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
			if(cmd.getName().equalsIgnoreCase("ifacepalm")){
				Player player = (Player) sender;
				Bukkit.getServer().broadcastMessage(ChatColor.BLUE + player.getName() + " facepalms!");
			return true;	
			}
				else if(cmd.getName().equalsIgnoreCase("iheaddesk")){
				Player player = (Player) sender;
				Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED + player.getName() + " hits their head against the desk!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ichc")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.BLUE + player.getName() + " has cheezburger!");
				return true;
			} 
				else if(cmd.getName().equalsIgnoreCase("ishoot")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GOLD + player.getName() + " shoots their arrows in the air!");
				return true;
			} 
				else if(cmd.getName().equalsIgnoreCase("ibeer")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN + player.getName() + " takes a swig of beer!");
				return true;
			} 
				else if(cmd.getName().equalsIgnoreCase("icreeper")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.DARK_GREEN + player.getName() + " has been creepered!");
				return true;
			} 
				else if(cmd.getName().equalsIgnoreCase("ihappy")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + player.getName() + " is happy!");
				return true;
			} 			
				else if(cmd.getName().equalsIgnoreCase("isad")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is sad!");
				return true;
			} 
				else if(cmd.getName().equalsIgnoreCase("icry")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.DARK_GREEN + player.getName() + " is crying!");
				return true;
			}
				else if(cmd.getName().equalsIgnoreCase("ihigh")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN + player.getName() + " is high!");
				return true;
			}
				else if(cmd.getName().equalsIgnoreCase("imad")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN + player.getName() + " is mad!");
				return true;
			}
				else if(cmd.getName().equalsIgnoreCase("iyoda")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GOLD + player.getName() + " feels the force!");
				return true;
			}
				else if(cmd.getName().equalsIgnoreCase("irant")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is ranting!");
				return true;
			}
				else if(cmd.getName().equalsIgnoreCase("irave")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + player.getName() + " is raving!");
				return true;
			}
				else if(cmd.getName().equalsIgnoreCase("itrip")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + player.getName() + " is tripping!");
				return true;
			}
				else if(cmd.getName().equalsIgnoreCase("idrunk")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.WHITE + player.getName() + " is drunk!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("istoned")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN + player.getName() + " is stoned!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("itroll")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " be trollin!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("idig")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.WHITE + player.getName() + " is digging!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ipissed")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN + player.getName() + " is pissed!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ifart")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.DARK_GRAY + player.getName() + " is farting!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ihungry")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.WHITE + player.getName() + " is hungry!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ibusy")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is busy!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("itired")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.BLUE + player.getName() + " is tired!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("isleep")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.BLUE + player.getName() + " is sleeping!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ibored")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is bored!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("idizzy")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GRAY + player.getName() + " is dizzy!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("iconfused")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + player.getName() + " is confused?!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("iwin")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.GOLD + player.getName() + " is winning!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ifail")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is failing!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ilol")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + player.getName() + " is laughing!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ilmao")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + player.getName() + " is laughing their ass off!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("iscared")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is scared!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ihate")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is hating!");
				return true;
				}
				else if(cmd.getName().equalsIgnoreCase("ieat")){
					Player player = (Player) sender;
					Bukkit.getServer().broadcastMessage(ChatColor.RED + player.getName() + " is eating!");
				return true;
				}
			//If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
			return false;
	
			}
}