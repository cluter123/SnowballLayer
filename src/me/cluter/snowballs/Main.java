package me.cluter.snowballs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onSnowballHit(ProjectileHitEvent event) {
		if (event.getEntity() instanceof Snowball) {
			Snowball snowball = (Snowball) event.getEntity();
			if (snowball.getShooter() instanceof Player) {
				Location l = snowball.getLocation();
					l.getBlock().setType(Material.SNOW);
				}
			}
		}
	}