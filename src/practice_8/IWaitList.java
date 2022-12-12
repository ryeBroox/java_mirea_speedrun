package practice_8;

import java.util.Collection;

/**
 *
 * @param <E>
 */
public interface IWaitList<E> {
    /**
     * Inserts an element into wait list
     *
     * @param element the element to add
     */
    void add(E element);

    /**
     * Removes first elements from wait list
     *
     * @return removed element
     */
    E remove();

    /**
     * Checks if element is in wait list
     *
     * @param element element to check
     * @return {@code true} if wait list contains the specified element
     */
    boolean contains(E element);

    /**
     * Checks if all elements from a collections are in wait list
     *
     * @param c collection of elements to check
     * @return {@code true} if wait list contains all specified elements
     */
    boolean containsAll(Collection<E> c);
}
