package edgruberman.bukkit.playeractivity.filters;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

import edgruberman.bukkit.playeractivity.Interpreter;

public class EntityRegainHealthEvent extends Interpreter {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onEvent(final org.bukkit.event.entity.EntityRegainHealthEvent event) {
        if (event.isCancelled()) return;

        if (!(event.getEntity() instanceof Player)) return;

        final Player player = (Player) event.getEntity();
        this.tracker.record(player, event);
    }

}