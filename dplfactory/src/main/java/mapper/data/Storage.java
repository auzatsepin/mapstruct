package mapper.data;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class Storage {

    private AtomicLong identity = new AtomicLong(Long.MIN_VALUE);
    private Map<Long, Persistable> storage = new HashMap<>();

    public Persistable get(Long id) {
        Persistable t = storage.get(id);
        if (t == null) {
            throw new RuntimeException("Not found");
        }
        return t;
    }

    public Long put(Persistable persistable) {
        Long id = identity.incrementAndGet();
        storage.put(id, persistable);
        return id;
    }

    public void clear() {
        storage.clear();
        identity = new AtomicLong(Long.MIN_VALUE);
    }

    public int count() {
        return storage.size();
    }

}
