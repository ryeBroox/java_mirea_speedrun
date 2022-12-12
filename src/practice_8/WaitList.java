package practice_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @param <E>
 */
public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Constructor
     */
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Constructor
     *
     * @param c elements to add with initialization
     */
    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>();
        this.content.addAll(c);
    }

    @Override
    public void add(E element) {
        this.content.add(element);
    }

    @Override
    public E remove() {
        if (this.content.isEmpty())
            return null;
        else
            return this.content.remove();
    }

    @Override
    public boolean contains(E element) {
        return this.content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return this.content.containsAll(c);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
