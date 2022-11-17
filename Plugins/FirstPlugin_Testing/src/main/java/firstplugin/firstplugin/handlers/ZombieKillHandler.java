package firstplugin.firstplugin.handlers;

import firstplugin.firstplugin.FirstPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class ZombieKillHandler implements Listener {

    public ZombieKillHandler(FirstPlugin plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {

        LivingEntity entity = event.getEntity();
        ItemStack wrapper = new ItemStack(Material.TNT, 1);

        // getType() is inherited from Entity
        if(entity.getType() == EntityType.CREEPER) {
            // LivingEntity has a getKiller() method
            Player killer = entity.getKiller();
            // getKiller() returns a Player, so you don't have to check if it's a player.
            killer.getInventory().addItem(wrapper);
        }

    }


}
