package February.Feb24;
import jydm.util.Array;
import jydm.util.TP;

public class Main {
    public static void main(String[] args) {
        System.out.println("John Wallar February 24, 2020");
        System.out.println("    Arduous method of adding values to loops");

        int [] [] sombrero = { {5, -2, 8, 5}, {7,7,4,1}, {0,9,22,6},{17,3,30,16}};
        for (int[] i : sombrero) {
            for (int j: i) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }


        double[] test1 = {1, 2, 3,4,5,6,7,8,9,0,1,2,3,4};
        double[] test2 = appendThreeValues(test1, new double[]{11, 22, 33});
        Array.printArray(test2);
    }

    public static double[] appendThreeValues(double[] inputArray, double[] addedValues) {
        double[] outputArray = new double[inputArray.length + 3];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i];
            TP.a();
        }
        for (int i = 0; i < addedValues.length; i++) {
            outputArray[inputArray.length + i] = addedValues[i];
            TP.b();
        }
        return outputArray;
    }
}
