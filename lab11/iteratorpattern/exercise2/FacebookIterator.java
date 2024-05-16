package hus.oop.lab11.iteratorpattern.exercise2;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String prifileId;
    private String type;
    private int curentPosition = 0;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String prifileId, String type) {
        this.facebook = facebook;
        this.prifileId = prifileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(prifileId, type);
        }
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return curentPosition < cache.length;
    }

    @Override
    public Profile getNext() {
        if (!hasMore()) {
            return null;
        }
        return cache[curentPosition++];
    }
}
