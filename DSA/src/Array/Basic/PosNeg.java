package Array.Basic;

import java.util.*;
// To make zig zag in positive and negative numbers 

public class PosNeg {
    public static void main(String[] args) {

        int[] a = {-2, 4, 6, -1, -6, 9, -4, -9,12,11,14,16,77};

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int num : a) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        // Merge alternately
        int i = 0, p = 0, n = 0;

        while (p < pos.size() && n < neg.size()) {
            a[i++] = pos.get(p++);
            a[i++] = neg.get(n++);
        }

        // Add remaining elements
        while (p < pos.size()) {
            a[i++] = pos.get(p++);
        }

        while (n < neg.size()) {
            a[i++] = neg.get(n++);
        }

        // Print result
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}