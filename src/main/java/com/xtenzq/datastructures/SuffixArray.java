package com.xtenzq.datastructures;

import java.util.Arrays;

public class SuffixArray {

    private final String text;

    public int getSize() {
        return size;
    }

    private final int size;
    private IntStringPair[] suffix;

    public Integer getKey(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return suffix[index].key;
    }

    public String getValue(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return suffix[index].value;
    }

    public SuffixArray(String text) {
        this.text = text;
        this.size = text.length();
        this.suffix = new IntStringPair[size];
        build();
        Arrays.sort(suffix);
    }

    private void build() {
        for (int i = size - 1; i >= 0; i--) {
            suffix[i] = new IntStringPair(i, text.substring(i, size));
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(suffix);
    }

    private static class IntStringPair implements Comparable {
        private final Integer key;
        private final String value;

        IntStringPair(Integer key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Object o) {
            String other = ((IntStringPair) o).value;
            int minSize = Math.min(value.length(), other.length());
            for (int i = 0; i < minSize; i++) {
                if (value.charAt(i) > other.charAt(i)) {
                    return 1;
                }
                else if (value.charAt(i) < other.charAt(i)) {
                    return -1;
                }
            }
            return 0;
        }

        @Override
        public String toString() {
            return "[" + key + ": " + value + "]";
        }
    }
}
