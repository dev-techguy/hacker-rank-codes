package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestString {
    public List<Integer> commonPrefix(List<String> inputs) {
        String[] strs = new String[inputs.size()];
        List<Integer> list = new ArrayList<>();

        if (strs.length == 0) {
            return list;
        }

        String lcp = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String currentWord = strs[i];
            int j = 0;


                while (j < currentWord.length() && j < lcp.length() && currentWord.charAt(j) == lcp.charAt(j)) {
                    j++;
                }

            if (j == 0)
                return list;
            lcp = currentWord.substring(0, j);
        }

        list.add(Integer.parseInt(lcp));
        return list;


    }

    // Driver program to test above function
    public static void main(String args[]) {
        String arr[] = {"ababaa", "babaa", "baa", "aa", "a"};
        new LongestString().commonPrefix(Arrays.asList(arr));
    }
}
