package com.moneybags.tempfly.aesthetic;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.moneybags.tempfly.TempFly;
import com.moneybags.tempfly.aesthetic.title.LegacyTitle;
import com.moneybags.tempfly.aesthetic.title.ModernTitle;
import com.moneybags.tempfly.aesthetic.title.Title;

public class TitleAPI {

	private static Title title;
	
    public static void initialize(TempFly tempfly) {
        String v = Bukkit.getServer().getBukkitVersion();
        if (v.startsWith("1.8") || v.startsWith("1.9") || v.startsWith("1.10") || v.startsWith("1.11")) {
            title = new LegacyTitle();
        } else {
            title = new ModernTitle();
        }
    }
    
    public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle) {
    	TitleAPI.title.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
    }

    public static void clearTitle(Player player) {
    	TitleAPI.title.clearTitle(player);
    }
}
