package Feb3;

public class ArrayMean {
    public static void main(String[] args) {
        /* ------- INIT ------- */
        int[] numberSet = {13, 17, 9, 11, 4, 8, 2, 7, 10, 2, 9, 15, 6, 6, 2};

        /* ------- EXEC ------- */
        System.out.println(mean(numberSet));
    }

    public static double mean(int[] input) {
        /* ------- INIT ------- */
        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        double mean = sum / input.length; // sum is a double -> division is calculated as a double
        return mean;
    }
}
