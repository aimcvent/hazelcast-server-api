package fr.aimcvent.hazelcast.server.api;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.nio.serialization.StreamSerializer;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;

public interface HazelcastService extends Service, WithConfiguration {

    HazelcastInstance of();

    <T> StreamSerializer<T> serializerOf(Class<T> clazz);
}
