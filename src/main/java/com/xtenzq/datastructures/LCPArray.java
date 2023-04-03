package com.xtenzq.datastructures;

import com.xtenzq.datastructures.utils.Entry;
import com.xtenzq.datastructures.utils.GenericArray;

/**
 * The LCP array is an array in which every index tracks how many characters two sorted adjacent suffixes have in common
 * @author Nikita Rusetskii
 */
public class LCPArray extends GenericArray<LCPArray.LCPEntry> {

    private final SuffixArray suffixArray;

    public LCPArray(String text) {
        super(LCPEntry.class, text.length());
        suffixArray = new SuffixArray(text);
    }

    /**
     * Constructs an LCP array by counting common substring chars at the beginning of suffix
     * Time complexity: O(n)
     */
    public void build() {
        String previous = "";
        int index = 0;
        for (SuffixArray.Suffix entry : suffixArray) {
            array[index] = new LCPEntry(getCommonSubstring(previous, entry.getValue()), entry);
            previous = entry.getValue();
            index++;
        }
    }

    /**
     * Returns an array of the LCP values contained in this array
     * @return array of LCP values
     */
    public int[] valueList() {
        int[] lcpValues = new int[getSize()];
        for (int i = 0; i < getSize(); i++) {
            lcpValues[i] = array[i].getIndex();
        }
        return lcpValues;
    }

    /**
     * Returns an array of the suffixes contained in this array
     * @return array of suffix values
     */
    public String[] suffixList() {
        String[] suffixes = new String[getSize()];
        for (int i = 0; i < getSize(); i++) {
            suffixes[i] = array[i].getValue().getValue();
        }
        return suffixes;
    }

    /**
     * Get common substring at the beginning of the string
     * Time complexity: O(n)
     *
     * @param firstString first string
     * @param secondString second string
     * @return number of common characters
     */
    private int getCommonSubstring(String firstString, String secondString) {
        int sub = 0;
        int minSize = Math.min(firstString.length(), secondString.length());
        for (int i = 0; i < minSize; i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                sub++;
            }
            else {
                break;
            }
        }
        return sub;
    }

    public static class LCPEntry extends Entry<Integer, SuffixArray.Suffix> {

        public LCPEntry(int value, SuffixArray.Suffix suffix) {
            super(value, suffix);
        }
    }
}
