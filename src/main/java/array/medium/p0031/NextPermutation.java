package array.medium.p0031;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }

        int brokenIndex = brokenIndex(nums);
        if (brokenIndex == 0) {
            Arrays.sort(nums);
        } else {

            int temp = nums[brokenIndex];

            int[] secondPart = Arrays.copyOfRange(nums, brokenIndex, length);
            Arrays.sort(secondPart);
            int potentialIndex = Arrays.binarySearch(secondPart, temp);
            for (int j = potentialIndex; j < secondPart.length; j++) {
                if (secondPart[j] > temp) {
                    potentialIndex = j;
                    break;
                }
            }

            int[] realResults = new int[length];
            System.arraycopy(nums, 0, realResults, 0, brokenIndex);
            realResults[brokenIndex] = secondPart[potentialIndex];
            System.arraycopy(secondPart, 0, realResults, brokenIndex + 1, potentialIndex);
            if (potentialIndex != secondPart.length - 1) {
                System.arraycopy(secondPart, potentialIndex + 1, realResults, length - secondPart.length + potentialIndex, secondPart.length - potentialIndex - 1);
            }
            nums = Arrays.copyOfRange(realResults,0,length);
            nums[1] = 10;

        }
        nums[0] = 11;
    }

    int brokenIndex(int[] nums) {
        int length = nums.length;
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}
