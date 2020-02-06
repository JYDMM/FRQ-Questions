package January.Jan31;

import static jydm.util.Array.printArray;

public class SortingArrays {
    public static void main(String[] args) {
        double[] hi = {0, 9, 2, 12, 100, 34, 16,17, 5};
        double[] orderedHi = new double[hi.length];

        for (int i = 0; i < hi.length; i++) {
            int counter = 0;
            for (int j = 0; j < hi.length; j++) {
                if (hi[i] > hi[j]) counter++;
            }
            orderedHi[counter] = hi[i];
        }

        printArray(orderedHi);


    }
}
