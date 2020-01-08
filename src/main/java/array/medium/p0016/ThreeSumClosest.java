package array.medium.p0016;

import java.util.*;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        //Arrays.sort(nums);
        int oldLength = nums.length;
        int[] newNums = Arrays.copyOf(nums, oldLength + 1);
        newNums[oldLength] = target;
        Arrays.sort(newNums);

        int searchResult = Arrays.binarySearch(newNums, target);
        int i = Math.max(0, searchResult - 1);
        int j = Math.min(oldLength, searchResult + 1);
        int leftInt;
        int rightInt;
        int counter = 0;
        int returnResult = 0;
        for (int k = Math.max(0, searchResult - 3); k <= Math.min(oldLength, searchResult + 3); k++) {
            if (k == searchResult) {
                continue;
            }
            if(i == searchResult){
                counter = counter + 1;
                returnResult = returnResult + newNums[j];
                j = j + 1;
            }else if (j == searchResult){
                counter = counter + 1;
                returnResult = returnResult + newNums[i];
                i = i - 1;
            }else if (i < Math.max(0, searchResult - 3)) {
                counter = counter + 1;
                returnResult = returnResult + newNums[j];
                j = j + 1;
            } else if (j > Math.min(oldLength, searchResult + 3)) {
                counter = counter + 1;
                returnResult = returnResult + newNums[i];
                i = i - 1;
            } else {
                leftInt = target - newNums[i];
                rightInt = newNums[j] - target;
                if (Math.abs(rightInt) > Math.abs(leftInt)) {
                    counter = counter + 1;
                    returnResult = returnResult + newNums[i];
                    i = i - 1;
                } else {
                    counter = counter + 1;
                    returnResult = returnResult + newNums[j];
                    j = j + 1;
                }
            }
            if (counter == 3) {
                return returnResult;
            }
        }

        return returnResult;
    }

    public static void main(String[] args) {
        ThreeSumClosest ob = new ThreeSumClosest();
        int[] abc = {0,2,1,-3};
        int kd = ob.threeSumClosest(abc, 1);
        System.out.println(kd);
    }
}
