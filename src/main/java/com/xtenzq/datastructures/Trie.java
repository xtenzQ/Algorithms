package com.xtenzq.datastructures;

import com.xtenzq.datastructures.utils.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Trie (pronounced "try")
 * Digital tree
 * Ordered tree structure
 *
 * @author Nikita Rusetskii
 */
public class Trie implements Tree<String>, Cloneable {

    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode(' ');
    }

    /**
     * {@inheritDoc}
     *
     * @implSpec String
     * @return
     */
    public boolean insert(String value) {
        TrieNode current = root;

        for (char l: value.toCharArray()) {
            current = current.children.computeIfAbsent(l, c -> new TrieNode(l));
        }
        current.eow = true;

        return true;
    }

    @Override
    public void remove(String value) {

    }

    @Override
    public void clear() {

    }

    /**
     *
     * @param value the value whose presence in this tree is to be tested
     * @return
     */
    @Override
    public boolean contains(String value) {
        TrieNode current = root;

        for (char l : value.toCharArray()) {
            TrieNode node = current.children.get(l);
            if (node == null) return false;
            current = node;
        }

        return current.eow;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Trie clone() {
        try {
            return (Trie) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return root.toString();
    }

    private static class TrieNode {
        char value;
        Map<Character, TrieNode> children;
        boolean eow;

        public TrieNode(char value) {
            this.value = value;
            this.children = new HashMap<>();
            this.eow = false;
        }

        @Override
        public String toString() {
            return value + children.entrySet().toString();
        }
    }
}
