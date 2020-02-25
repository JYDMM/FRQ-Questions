package February.Feb10;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLongest(15));
        //int[] nums = {7, 10, 10, 15, 15, 15, 15, 10, 10, 10, 15, 10, 10};
    }

    //private int[] nums = {7, 10, 10, 15, 15, 15, 15, 10, 10, 10, 15, 10, 10};

//    public static int findLongest(int target) {
//        int[] nums = {7, 10, 10, 15, 15, 15, 15, 10, 10, 10, 15, 10, 10};
//        int lenCount = 0; // length of current consecutive numbers
//        int maxLen = 0;   // max length of consecutive numbers
//        for (int k = 0; k < nums.length; k++) {
//            if (nums[k] == target) {
//                lenCount++;
//            } else if (lenCount > maxLen) {
//                maxLen = lenCount;
//            }
//        }
//        if (lenCount > maxLen) {
//            maxLen = lenCount;
//        }
//        return maxLen;
//    }

    public static int findLongest(int target) {
        int[] nums = {7, 10, 10, 15, 15, 15, 15, 10, 10, 10, 15, 10, 10};
        int lenCount = 0, maxLen = 0;
        for (int i : nums) {
            if (i == target) {
                lenCount++;
                if (lenCount > maxLen) maxLen = lenCount;
            } else {
                lenCount = 0;
            }
        }
        return maxLen;
    }

}
