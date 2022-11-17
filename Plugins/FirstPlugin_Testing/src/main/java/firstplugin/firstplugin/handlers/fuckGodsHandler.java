package firstplugin.firstplugin.handlers;

import firstplugin.firstplugin.FirstPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.inventory.ItemStack;

public class fuckGodsHandler implements Listener {

    public fuckGodsHandler(FirstPlugin plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {


        if(event.getMessage().equalsIgnoreCase("fuck you gods")) {
            Player player = event.getPlayer();
            Location playerLocation = event.getPlayer().getLocation();

            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
            player.getWorld().spawnEntity(playerLocation.add(0, 30, 0), EntityType.ARROW);
        }
    }
}
