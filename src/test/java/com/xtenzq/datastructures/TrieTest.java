package com.xtenzq.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    public void shouldInsert() {
        Trie trie = new Trie();
        trie.insert("Hello, world");
        trie.insert("Helio");
        assertTrue(trie.contains("Helio"));
    }

}
