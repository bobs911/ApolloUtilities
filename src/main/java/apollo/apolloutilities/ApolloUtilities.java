package apollo.apolloutilities;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ApolloUtilities extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Apollo Utilities Is Running Correctly!");

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.println("Welcome to the Apollo Network " + event.getPlayer().getName());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Apollo Utilities Is Saving Data Then Shutting Down!");
    }
}
