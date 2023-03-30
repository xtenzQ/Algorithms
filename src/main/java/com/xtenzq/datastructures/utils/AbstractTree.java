package com.xtenzq.datastructures.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a skeletal implementation of the Tree interface, to minimize the effort required to implement this interface.
 * To implement a tree, the programmer must additionally override this class's add, remove and contains methods (which otherwise throws an UnsupportedOperationException)
 * The programmer should generally provide a void (no argument) and map constructor, as per the recommendation in the Tree interface specification.
 * The documentation for each non-abstract method in this class describes its implementation in detail. Each of these methods may be overridden if the tree being implemented admits a more efficient implementation
 * @param <T> the type of elements in this tree
 *
 * @author Nikita Rusetskii
 */
public abstract class AbstractTree<T> implements Tree<T> {

    /**
     * Tree root
     */
    protected Node<T> root;

    /**
     * Sole constructor. (For invocation by subclass constructors, typically implicit.)
     */
    protected AbstractTree() {
        this.root = null;
    }

    /**
     * {@inheritDoc}
     * @throws UnsupportedOperationException   {@inheritDoc}
     * @return number of nodes
     */
    public int size() {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation returns {@code root == null}.
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * {@inheritDoc}
     *
     * @throws UnsupportedOperationException   {@inheritDoc}
     * @return {@inheritDoc}
     */
    public int depth() {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     * @throws UnsupportedOperationException   {@inheritDoc}
     * @param value the value to be inserted into this tree
     */
    public boolean insert(T value) {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     *
     * @param <T> the type of value stored in the node
     */
    protected static class Node<T> implements Tree.Node<T> {
        /**
         * the value stored in this node
         */
        T value;

        /**
         * the children to this node
         */
        List<Tree.Node<T>> children;

        /**
         * {@code true} if this node is a leaf
         */
        boolean isLeaf;

        public Node(T value, boolean isLeaf) {
            this.value = value;
            this.isLeaf = isLeaf;
            this.children = new ArrayList<>();
        }

        /**
         * {@inheritDoc}
         *
         * @return
         */
        @Override
        public T getValue() {
            return this.value;
        }

        /**
         * {@inheritDoc}
         *
         * @param child the child node to add
         */
        @Override
        public void addChild(Tree.Node<T> child) {
            this.children.add(child);
        }

        /**
         * {@inheritDoc}
         *
         * @return
         */
        @Override
        public List<Tree.Node<T>> getChildren() {
            return this.children;
        }
    }
}
