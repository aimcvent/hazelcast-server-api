package fr.aimcvent.hazelcast.server.api.utils;

import com.hazelcast.config.MapStoreConfig;
import com.hazelcast.map.MapStore;

public interface PersistenceMapStore<K, V> extends MapStore<K, V> {
    String name();

    String mapName();

    Class<? extends V> type();

    boolean critical();

    default int batchSize() {
        return MapStoreConfig.DEFAULT_WRITE_BATCH_SIZE;
    }
}
