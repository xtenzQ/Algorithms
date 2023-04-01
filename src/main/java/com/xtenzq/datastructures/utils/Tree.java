package com.xtenzq.datastructures.utils;

/**
 * An abstract data type representing a hierarchical tree structure consisting of connected nodes.
 *
 * @param <T> the type of elements stored in this tree
 * @since 27.03.2023
 * @author Nikita Rusetskii
 */
public interface Tree<T> {

    /**
     * Inserts the specified value into the tree.
     *
     * @param value the value to be inserted into this tree
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being inserted into this tree
     * @throws NullPointerException if the specified element is null and this
     *         tree does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being inserted into this tree
     */
    void insert(T value);

    /**
     * Removes the node with the specified value from this tree (optional operation).
     * If this tree contains a node with the value {@code value}, that node is removed.
     *
     * @param value the value to be removed from this tree
     * @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this tree
     * @throws ClassCastException if the value is of an inappropriate type for
     *         this tree
     * @throws NullPointerException if the specified value is null and this
     *         tree does not permit null nodes
     */
    void remove(T value);

    /**
     * Removes all nodes from this tree. The tree will be empty after this call returns.
     */
    void clear();

    /**
     * Returns {@code true} if this tree contains the specified value.
     *
     * @param value the value whose presence in this tree is to be tested
     * @return {@code true} if this tree contains one or more nodes with the
     *         specified value
     * @throws ClassCastException if the value is of an inappropriate type for
     *         this tree
     * @throws NullPointerException if the specified value is null and this
     *         tree does not permit null values
     */
    boolean contains(T value);

    /**
     * Returns the number of nodes in this tree. If the tree contains more than
     * {@code Integer.MAX_VALUE} nodes, returns {@code Integer.MAX_VALUE}.
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
