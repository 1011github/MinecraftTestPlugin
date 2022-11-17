package firstplugin.firstplugin.handlers;

import firstplugin.firstplugin.FirstPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TorchHandler implements Listener {
    public TorchHandler(FirstPlugin plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTorchPlace_Low(BlockPlaceEvent event) {
        Block block = event.getBlock();

        if (block.getType() == Material.TORCH) {
            event.getBlock().setType(Material.DIAMOND_BLOCK);
            event.getPlayer().chat("I placed a torch and got awarded!");
        }
    }

    @EventHandler
    public void onTorchPlace_Normal(BlockPlaceEvent event) {
        Block block = event.getBlock();

        if (block.getType() != Material.TORCH) {
            return;
        }

        Bukkit.getLogger().info("A torch was Placed");

    }
}
