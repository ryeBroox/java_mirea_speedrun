package practice_8;

import java.util.Collection;

/**
 *
 * @param <E>
 */
public class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Constructor
     */
    public UnfairWaitList() {}

    /**
     *
     * @param c initial collection of elements
     */
    public UnfairWaitList(Collection<E> c) {
        super(c);
    }

    /**
     * Removes specific element from wait list
     *
     * @param element element to remove
     */
    public void remove(E element) {
        this.content.remove(element);
    }

    /**
     * Moves a specific element to back
     *
     * @param element element to move
     */
    public void moveToBack(E element) {
        this.remove(element);
        this.add(element);
    }
}
