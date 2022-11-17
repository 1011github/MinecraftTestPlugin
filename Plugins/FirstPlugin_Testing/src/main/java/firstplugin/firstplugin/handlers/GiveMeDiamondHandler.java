package firstplugin.firstplugin.handlers;

import firstplugin.firstplugin.FirstPlugin;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.inventory.ItemStack;

public class GiveMeDiamondHandler implements Listener{

    public GiveMeDiamondHandler(FirstPlugin plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {


        if(event.getMessage().equalsIgnoreCase("can i have diamonds?")) {
            Player player = event.getPlayer();
            Location playerLocation = event.getPlayer().getLocation();

            ItemStack ItemStack = new ItemStack(Material.DIAMOND, 5);
            player.getWorld().dropItem(playerLocation.add(0, 2, 0), ItemStack);

        }
    }
}
