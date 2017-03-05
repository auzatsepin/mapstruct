package mapper.data;

import java.util.concurrent.atomic.AtomicLong;

public class Creator {

    private AtomicLong identity = new AtomicLong(Long.MIN_VALUE);

    public <T extends Persistable> T create(Class<T> clazz) {
        try {
            T t = clazz.newInstance();
            t.setId(identity.incrementAndGet());
            return t;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Something wrong", e);
        }
    }

}
