package fr.aimcvent.hazelcast.server.api.event;

import com.hazelcast.core.HazelcastInstance;
import fr.aimcvent.kernel.api.event.Event;

public record HazelcastPostInitEvent(HazelcastInstance hazelcast) implements Event {}
