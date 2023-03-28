package com.xtenzq.datastructures.utils;

import java.util.List;

/**
 * An abstract data type representing a hierarchical tree structure consisting of connected nodes.
 *
 * @param <T> the type of elements stored in this tree
 * @since 27.03.2023
 * @author Nikita Rusetskii
 */
public interface Tree<T> {

    /**
     * Returns the root node of the tree.
     *
     * @return the root node of the tree
     */
    Node<T> getRoot();

    /**
     * Sets the root node of the tree.
     *
     * @param root the root node to be set
     */
    void setRoot(Node<T> root);

    /**
     * Returns the number of nodes in the tree.
     *
     * @return the number of nodes in the tree
     */
    int size();

    /**
     * Returns true if the tree is empty, false otherwise.
     *
     * @return true if the tree is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the depth of the tree (i.e. the maximum distance from the root to a leaf node).
     *
     * @return the depth of the tree
     */
    int depth();

    /**
     * Returns a list of nodes in pre-order traversal.
     *
     * @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this tree
     * @return a list of nodes in pre-order traversal
     */
    List<Node<T>> preOrder();

    /**
     * Returns a list of nodes in post-order traversal.
     * @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this tree
     * @return a list of nodes in post-order traversal
     */
    List<Node<T>> postOrder();

    /**
     * Returns a list of nodes in level-order traversal.
     * @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this tree
     * @return a list of nodes in level-order traversal
     */
    List<Node<T>> levelOrder();

    /**
     * Adds a new node to the tree with the specified parent node and element.
     * @param parent the parent node of the new node
     * @param element the element to be stored in the new node
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being inserted into this tree
     * @throws NullPointerException if the specified element is null and this
     *         tree does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being inserted into this tree
     * @return the new node that was added to the tree
     */
    Node<T> addNode(Node<T> parent, T element);

    /**
     * Removes the specified node from the tree.
     *
     * @param node the node to be removed
     */
    void removeNode(Node<T> node);

    /**
     * Returns true if the specified node is a descendant of the specified ancestor node, false otherwise.
     *
     * @param node the node to check for descent from the ancestor
     * @param ancestor the ancestor node to check for
     * @return true if the node is a descendant of the ancestor, false otherwise
     */
    boolean isDescendant(Node<T> node, Node<T> ancestor);

    /**
     * Returns a list of nodes that are descendants of the specified node.
     *
     * @param node the node whose descendants are to be returned
     * @return a list of nodes that are descendants of the specified node
     */
    List<Node<T>> getDescendants(Node<T> node);

    /**
     * This interface represents a node in a tree.
     *
     * @param <T> the type of element stored in the node
     */
    interface Node<T> {

        /**
         * Returns the element stored in the node.
         *
         * @return the element stored in the node
         */
        T getElement();

        /**
         * Sets the element stored in the node.
         *
         * @param element the element to be stored in the node
         */
        void setElement(T element);

        /**
         * Returns the parent node of this node.
         *
         * @return the parent node of this node
         */
        Node<T> getParent();

        /**
         * Sets the parent node of this node.
         *
         * @param parent the parent node of this node
         */
        void setParent(Node<T> parent);

        /**
         * Returns the children of this node.
         *
         * @return the children of this node
         */
        List<Node<T>> getChildren();

        /**
         * Adds a child to this node.
         *
         * @param child the child node to be added
         */
        void addChild(Node<T> child);

        /**
         * Removes a child from this node.
         *
         * @param child the child node to be removed
         */
        void removeChild(Node<T> child);

        /**
         * Returns true if this node is a leaf node (i.e. has no children), false otherwise.
         *
         * @return true if this node is a leaf node, false otherwise
         */
        boolean isLeaf();
    }
}
