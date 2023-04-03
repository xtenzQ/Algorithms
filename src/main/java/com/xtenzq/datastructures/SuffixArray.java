package com.xtenzq.datastructures;

import com.xtenzq.datastructures.utils.GenericArray;

import java.util.Arrays;

/**
 * Suffix array is an array which contains all the sorted suffixes of a string
 *
 * @author Niktia Rusetskii
 */
public class SuffixArray extends GenericArray<SuffixArray.Suffix> {
    private final String text;

    public SuffixArray(String text) {
        super(Suffix.class, text.length());
        this.text = text;
    }

    /**
     * Construct a suffix by taking a substring from the end of a string to the beginning.
     * Time complexity: O(n)
     */
    public void build() {
        for (int i = getSize() - 1; i >= 0; i--) {
            array[i] = new Suffix(text.substring(i, getSize()));
        }
        Arrays.sort(this.array);
    }

    /**
     * Converts SuffixArray into array of strings
     * @return array of strings
     */
    public String[] toStringArray() {
        String[] res = new String[getSize()];
        for (int i = 0; i < getSize(); i++) {
            res[i] = array[i].getValue();
        }
        return res;
    }

    /**
     * Suffix is a substring at the end of a string of characters
     */
    public static class Suffix implements Comparable<Suffix> {
        public String getValue() {
            return value;
        }

        private final String value;
        private final int size;

        public Suffix(String value) {
            this.value = value;
            this.size = value.length();
        }
        /**
         * Sort suffix alphabetically
         *
         * @param o the object to be compared.
         * @return result of comparison
         */
        @Override
        public int compareTo(Suffix o) {
            int minSize = Math.min(size, o.getValue().length());
            // soft alphabetically first
            for (int i = 0; i < minSize; i++) {
                if (value.charAt(i) > o.getValue().charAt(i)) {
                    return 1;
                } else if (value.charAt(i) < o.getValue().charAt(i)) {
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
            return value;
        }
    }
}
