package edgruberman.bukkit.playeractivity.filters;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

import edgruberman.bukkit.playeractivity.Interpreter;

public class ProjectileHitEvent extends Interpreter {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onEvent(final org.bukkit.event.entity.ProjectileHitEvent event) {
        if (!(event.getEntity() instanceof Player)) return;

        final Player player = (Player) event.getEntity();
        this.tracker.record(player, event);
    }

}
