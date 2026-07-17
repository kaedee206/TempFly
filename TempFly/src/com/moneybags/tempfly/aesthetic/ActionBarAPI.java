package com.moneybags.tempfly.aesthetic;

import com.moneybags.tempfly.aesthetic.actionbar.ActionBar;
import com.moneybags.tempfly.aesthetic.actionbar.LegacyActionBar;
import com.moneybags.tempfly.aesthetic.actionbar.ModernActionBar;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.moneybags.tempfly.TempFly;

public class ActionBarAPI {
	
	private static ActionBar actionBar;
    
    public static void initialize(TempFly tempfly) {
        String v = Bukkit.getServer().getBukkitVersion();
        if (v.startsWith("1.8") || v.startsWith("1.9") || v.startsWith("1.10") || v.startsWith("1.11")) {
            actionBar = new LegacyActionBar(tempfly);
        } else {
            actionBar = new ModernActionBar(tempfly);
        }
    }
    
    public static void sendActionBar(final Player player, final String message) {
    	actionBar.sendActionBar(player, message);
    }
    
    public static void sendActionBar(final Player player, final String message, int duration) {
    	actionBar.sendActionBar(player, message, duration);
    }
}
