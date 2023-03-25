package com.xtenzq.datastructures;

import com.xtenzq.datastructures.utils.Entry;
import com.xtenzq.datastructures.utils.GenericArray;

import java.util.Arrays;

/**
 *
 *
 * @author Niktia Rusetskii
 */
public class SuffixArray extends GenericArray<SuffixArray.SuffixEntry> {
    private final String text;

    public SuffixArray(String text) {
        super(SuffixEntry.class, text.length());
        this.text = text;
        build();
        // sort alphabetically
        Arrays.sort(this.array);
    }

    private void build() {
        for (int i = getSize() - 1; i >= 0; i--) {
            array[i] = new SuffixEntry(i, text.substring(i, getSize()));
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static class SuffixEntry extends Entry<Integer, String> implements Comparable<SuffixEntry> {

        SuffixEntry(Integer index, String value) {
            super(index, value);
        }

        @Override
        public int compareTo(SuffixEntry o) {
            String other = o.getValue();
            int minSize = Math.min(getValue().length(), other.length());
            // soft alphabetically first
            for (int i = 0; i < minSize; i++) {
                if (getValue().charAt(i) > other.charAt(i)) {
                    return 1;
                } else if (getValue().charAt(i) < other.charAt(i)) {
                    return -1;
                }
            }
            // if strings are equal then sort by length
            if (getValue().length() < o.getValue().length()) {
                return -1;
            }
            else if (getValue().length() > o.getValue().length()) {
                return 1;
            }
            return 0;
        }
    }
}
