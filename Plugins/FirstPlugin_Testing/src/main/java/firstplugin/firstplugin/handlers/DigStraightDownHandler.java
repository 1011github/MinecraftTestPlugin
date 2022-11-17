package firstplugin.firstplugin.handlers;

import firstplugin.firstplugin.FirstPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;


// STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK
//STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK STILL NEEDS WORK


public class DigStraightDownHandler implements Listener {

    public DigStraightDownHandler(FirstPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onDigDownEvent (BlockBreakEvent event) {
        Player player = event.getPlayer();
        int x = (int) player.getLocation().getX();
        int z = (int) player.getLocation().getZ();
        int numberBlocksAllowed = (int) player.getLocation().getY() - 5;
        for (int y = (int) player.getLocation().getY(); y == numberBlocksAllowed; y--){
            Location playerLocation = event.getPlayer().getLocation();

            Material blockAbove = Material.AIR;
            if (player.getWorld().getBlockAt(playerLocation.add(0, 20, 0)).getType() == blockAbove) {
                player.getWorld().getBlockAt(playerLocation.add(0, 20, 0)).setType(Material.DAMAGED_ANVIL);
            }
        }
    }

}
