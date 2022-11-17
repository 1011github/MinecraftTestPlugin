package firstplugin.firstplugin;

import firstplugin.firstplugin.handlers.GiveMeDiamondHandler;
import firstplugin.firstplugin.handlers.ZombieKillHandler;
import firstplugin.firstplugin.handlers.TorchHandler;
import firstplugin.firstplugin.handlers.ZombieKillHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Server Up and Running");

        new TorchHandler(this);
        new ZombieKillHandler(this);
        new GiveMeDiamondHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Server Shutting Down");
    }
}
