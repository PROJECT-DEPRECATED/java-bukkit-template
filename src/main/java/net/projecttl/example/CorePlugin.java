package net.projecttl.example;

import net.projecttl.example.listeners.Example;
import org.bukkit.plugin.java.JavaPlugin;

public class CorePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new CommandDispatcher());
        getServer().getPluginManager().registerEvents(new Example(), this);
    }

    @Override
    public void onDisable() {}
}
