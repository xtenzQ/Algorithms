package com.xtenzq.datastructures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuffixArray implements Iterable<SuffixArray.SuffixEntry> {
    private final String text;

    public int getSize() {
        return size;
    }

    private final int size;
    private SuffixEntry[] suffixEntries;

    public SuffixArray(String text) {
        this.text = text;
        this.size = text.length();
        this.suffixEntries = new SuffixEntry[size];
        build();
        // sort alphabetically
        Arrays.sort(suffixEntries);
    }

    private void build() {
        for (int i = size - 1; i >= 0; i--) {
            suffixEntries[i] = new SuffixEntry(i, text.substring(i, size));
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(suffixEntries);
    }

    @Override
    public Iterator<SuffixEntry> iterator() {
        return new SuffixItr();
    }

    private class SuffixItr implements Iterator<SuffixEntry> {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        // prevent creating a synthetic constructor
        SuffixItr() {}

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
        public SuffixEntry next() {
            int i = cursor;
            if (i >= size) {
                throw new NoSuchElementException();
            }
            SuffixEntry[] elementData = SuffixArray.this.suffixEntries;
            cursor = i + 1;
            return elementData[lastRet = i];
        }

        @SuppressWarnings("unchecked")
        public SuffixEntry previous() {
            int i = cursor - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            SuffixEntry[] elementData = SuffixArray.this.suffixEntries;
            cursor = i;
            return elementData[lastRet = i];
        }
    }

    public static class SuffixEntry implements Comparable<SuffixEntry> {
        private final Integer index;

        public String getValue() {
            return value;
        }

        private final String value;

        SuffixEntry(Integer index, String value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(SuffixEntry o) {
            String other = o.value;
            int minSize = Math.min(value.length(), other.length());
            // soft alphabetically first
            for (int i = 0; i < minSize; i++) {
                if (value.charAt(i) > other.charAt(i)) {
                    return 1;
                } else if (value.charAt(i) < other.charAt(i)) {
                    return -1;
                }
            }
            // if strings are equal then sort by length
            if (value.length() < o.getValue().length()) {
                return -1;
            }
            else if (value.length() > o.getValue().length()) {
                return 1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "[" + index + ": " + value + "]";
        }
    }
}
