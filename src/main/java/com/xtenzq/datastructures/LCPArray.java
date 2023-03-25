package com.xtenzq.datastructures;

public class LCPArray {

    private final LCPEntry[] LCPArray;

    public LCPArray(String text) {
        SuffixArray suffixArray = new SuffixArray(text);
        LCPArray = new LCPEntry[suffixArray.getSize()];
        build(suffixArray);
    }

    private void build(SuffixArray suffixArray) {
        String previous = "";
        int index = 0;
        for (SuffixArray.SuffixEntry entry : suffixArray) {
            LCPArray[index] = new LCPEntry(getCommonSubstring(previous, entry.getValue()), entry);
            previous = entry.getValue();
            index++;
        }
    }

    private int getCommonSubstring(String str1, String str2) {
        int sub = 0;
        int minSize = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minSize; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sub++;
            }
            else {
                break;
            }
        }
        return sub;
    }

    private static class LCPEntry {
        final int value;
        final SuffixArray.SuffixEntry suffixEntry;

        public LCPEntry(int value, SuffixArray.SuffixEntry suffixEntry) {
            this.value = value;
            this.suffixEntry = suffixEntry;
        }

        @Override
        public String toString() {
            return "[" + value + ": " + suffixEntry + "]";
        }
    }
}
