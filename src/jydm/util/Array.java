package jydm.util;

public class Array {

    /* -------- 1D Array --------*/
    public static void printArray(String[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(long[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(short[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
    public static void printArray(byte[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(i + " " + input[i]);
        }
    }

    public static void printArray(boolean[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(i + " " + input[i]);
        }
    }
    /* -------- 2D Array ------ */
    public static void printArray(String[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(double[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(long[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(short[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(char[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(byte[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }

    public static void printArray(boolean[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(" " + input[i][j] + " ");
            }
        }
    }


}
