package com.xtenzq.datastructures;

import com.xtenzq.datastructures.utils.Entry;
import com.xtenzq.datastructures.utils.GenericArray;

public class LCPArray extends GenericArray<LCPArray.LCPEntry> {

    public LCPArray(String text) {
        super(LCPEntry.class, text.length());
        SuffixArray suffixArray = new SuffixArray(text);
        array = new LCPEntry[suffixArray.getSize()];
        build(suffixArray);
    }

    private void build(SuffixArray suffixArray) {
        String previous = "";
        int index = 0;
        for (SuffixArray.SuffixEntry entry : suffixArray) {
            array[index] = new LCPEntry(getCommonSubstring(previous, entry.getValue()), entry);
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

    static class LCPEntry extends Entry<Integer, SuffixArray.SuffixEntry> {

        public LCPEntry(int value, SuffixArray.SuffixEntry suffixEntry) {
            super(value, suffixEntry);
        }
    }
}
