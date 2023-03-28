package com.xtenzq.datastructures.utils;

/**
 * Tree is an abstract data type that represents hierarchical tree structure with a set of connected nodes.
 *
 * @param <T> the type of elements in this tree
 * @author Nikita Rusetskii
 */
public interface Tree<T> {

    /**
     * Adds the specified value to the tree.
     *
     * @param value value to be added to this tree
     * @return {@code true} if this tree changed as a result of the call
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this tree
     * @throws NullPointerException if the specified element is null and this
     *         tree does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being added to this tree
     */
    boolean insert(T value);

    /**
     * Removes the node from this tree if it is present (optional operation).
     * More formally, if this tree contains a node with value {@code value},
     * that node is removed.
     *
     * @param value value to be removed from the tree
     * @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this tree
     * @throws ClassCastException if the value is of an inappropriate type for
     *         this map
     * @throws NullPointerException if the specified value is null and this
     *         tree does not permit null nodes
     */
    void remove(T value);

    /**
     * Removes all of the elements from this list. The list will be empty after this call returns.
     */
    void clear();

    /**
     * Returns {@code true} if this tree contains the specified value.
     *
     * @param value value whose presence in this tree is to be tested
     * @return {@code true} if this tree contains one or more nodes that maps to the
     *         specified value
     * @throws ClassCastException if the value is of an inappropriate type for
     *         this tree
     * @throws NullPointerException if the specified value is null and this
     *         tree does not permit null values
     */
    boolean contains(T value);

    /**
     * Returns the number of nodes in this tree.  If the
     * tree contains more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of nodes in this tree
     */
    int size();

    /**
     * Returns {@code true} if this tree contains no nodes.
     *
     * @return {@code true} if this tree contains no nodes
     */
    boolean isEmpty();
}
