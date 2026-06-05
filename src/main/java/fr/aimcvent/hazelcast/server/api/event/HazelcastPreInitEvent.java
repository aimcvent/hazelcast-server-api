package fr.aimcvent.hazelcast.server.api.event;

import com.hazelcast.config.Config;
import fr.aimcvent.kernel.api.event.Event;

public record HazelcastPreInitEvent(Config hazelcastConfig) implements Event {}
