package array.medium.p0031;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }
        if (length == 2) {
            swapArrayValue(nums, 0, 1);
            return;
        }

        int brokenIndex = findBrokenIndex(nums);
        if (brokenIndex == -1) {
            Arrays.sort(nums);
        } else if (brokenIndex == length - 2) {
            swapArrayValue(nums, length - 2, length - 1);
        } else {
            int brokenValue = nums[brokenIndex];
            int strictLargerIndex = findStrictLargerIndex(nums, brokenValue, brokenIndex + 1, length - 1);
            int strictLargerValue = nums[strictLargerIndex];

            nums[brokenIndex] = strictLargerValue;

            int tailLength = length - brokenIndex - 1;
            int[] tailNums = new int[tailLength];

            tailNums[0] = brokenValue;
            int tailIndex = 1;
            for (int tempIndex = length - 1; tempIndex > brokenIndex; tempIndex--) {
                if (tempIndex == strictLargerIndex) {
                    continue;
                }
                tailNums[tailIndex] = nums[tempIndex];
                tailIndex++;
            }

            //before sort
            // tailNums[1... end] is already ascending order
            // just tailNums[0] needs to be in the right place
            Arrays.sort(tailNums);

            //copy the tail back to nums
            for (int newIndex = brokenIndex + 1; newIndex < length; newIndex++) {
                nums[newIndex] = tailNums[newIndex - brokenIndex - 1];
            }

        }

    }

    // Note this is not the normal find strict method
    // the arrays passed in is already sorted in reversed order
    // the arrays passed in guarantees solution exists
    public int findStrictLargerIndex(int[] nums, int target, int start, int end) {
        int answer = -1;
        while (start <= end) {
            int mid = (start + end) / 2;


            if (nums[mid] <= target) {
                //if the target is in the left part
                end = mid - 1;
            } else {
                //if the target is in the right part
                answer = mid;
                start = mid + 1;
            }
        }
        return answer;
    }

    public int findBrokenIndex(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public void swapArrayValue(int[] nums, int firstIndex, int secondIndex) {
        nums[firstIndex] = nums[firstIndex] + nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] - nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] - nums[secondIndex];
    }
}
