package net.projecttl.example.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Example implements Listener {
    @EventHandler
    void onJoin(PlayerJoinEvent event) {
        event.joinMessage(Component.text("Hello! " + event.getPlayer().getName()));
    }
}