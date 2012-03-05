package edgruberman.bukkit.playeractivity.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.ProjectileHitEvent;

import edgruberman.bukkit.playeractivity.EventListener;
import edgruberman.bukkit.playeractivity.EventTracker;

public class ProjectileHitEventListener extends EventListener {

    public ProjectileHitEventListener(final EventTracker tracker) {
        super(tracker);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onEvent(final ProjectileHitEvent event) {
        if (!(event.getEntity() instanceof Player)) return;

        final Player player = (Player) event.getEntity();
        this.tracker.record(player, event);
    }

}
