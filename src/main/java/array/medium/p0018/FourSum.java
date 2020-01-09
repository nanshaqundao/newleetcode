package array.medium.p0018;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> results = new HashSet<>();
        int length = nums.length;
        if (length < 4) {
            return new ArrayList<>();
        }

        int tempCombo;
        int searchResults;
        int a;
        int b;
        int c;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    a = nums[i];
                    b = nums[j];
                    c = nums[k];
                    tempCombo = target - a - b - c;
                    searchResults = Arrays.binarySearch(nums, k + 1, length, tempCombo);
                    if (searchResults > 0) {
                        results.add(Arrays.asList(a, b, c, tempCombo));
                    }
                }

            }
        }

        return new ArrayList<>(results);
    }
}
