package practice_8;

import java.util.Collection;

/**
 *
 * @param <E>
 */
public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    /**
     * Constructor
     * @param capacity initial capacity of wait list
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Constructor
     *
     * @param c initial collection of elements
     */
    public BoundedWaitList(Collection<E> c) {
        super(c);
        this.capacity = c.size();
    }

    /**
     * Getter
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (this.content.size() < capacity)
            super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
