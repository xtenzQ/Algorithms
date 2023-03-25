package com.xtenzq.datastructures.utils;

public abstract class Entry<K, V> {

    public K getIndex() {
        return index;
    }

    private final K index;

    public V getValue() {
        return value;
    }

    private final V value;

    public Entry(K index, V value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + index + ": " + value + "]";
    }
}
