package January.Jan31;

import static jydm.util.Array.printArray;

public class BubbleSort {
    public static void main(String[] args) {
        /* Bubble Sort
         * 1. Nested loops. Outer loop - check boolean. Inner loop will do a pass.
         * 2. Temp variable/placeholder
         * 3. Boolean 'flag': Boolean flips to false if we make AT LEAST ONE SWAP!!
         * 3b.IF, at the end of a full pass of swaps, Boolean 'flag' is still true, break the loop.
         */
        int[] test = {0, 9, 2, 12, 100, 34, 16,17, 5};
        int temp;
        boolean isNotSorted = true;

        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < test.length - 1; i++) {
                if (test[i] > test[i + 1]) {
                    temp = test[i + 1];
                    test[i + 1] = test[i];
                    test[i] = temp;
                    isNotSorted = true;
                }

            }
        }

        printArray(test);

    }
}
