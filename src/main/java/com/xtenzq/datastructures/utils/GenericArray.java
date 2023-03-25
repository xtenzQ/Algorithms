package com.xtenzq.datastructures.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An abstract array of {@param T} type which allows iteration over itself
 * @param <T> type of array
 *
 * @author Nikita Rusetskii
 */
public abstract class GenericArray<T> implements Iterable<T> {
    protected T[] array;

    public int getSize() {
        return size;
    }

    private int size;

    private GenericArray() {

    }

    public GenericArray(Class<T> componentType, int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity can't be zero or negative.");
        }
        this.array = (T[]) Array.newInstance(componentType, capacity);
        this.size = capacity;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    private class Itr implements Iterator<T> {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        // prevent creating a synthetic constructor
        Itr() {}

        public boolean hasNext() {
            return cursor != size;
        }

        public boolean hasPrevious() {
            return cursor != 0;
        }

        public int nextIndex() {
            return cursor;
        }

        public int previousIndex() {
            return cursor - 1;
        }

        @SuppressWarnings("unchecked")
        public T next() {
            int i = cursor;
            if (i >= size) {
                throw new NoSuchElementException();
            }
            T[] elementData = GenericArray.this.array;
            cursor = i + 1;
            return elementData[lastRet = i];
        }

        @SuppressWarnings("unchecked")
        public T previous() {
            int i = cursor - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            T[] elementData = GenericArray.this.array;
            cursor = i;
            return elementData[lastRet = i];
        }
    }
}
