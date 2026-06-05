package fr.aimcvent.hazelcast.server.api;

import com.hazelcast.core.HazelcastInstance;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;

public interface HazelcastServerService extends Service, WithConfiguration {
    HazelcastInstance of();
}
