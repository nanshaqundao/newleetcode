package array.easy.p0027;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //to-do implement solution
        int length = nums.length;

        if (length == 1 && nums[0] == val) {
            return 0;
        } else if (length <= 1) {
            return length;
        }
        int i = 0;
        int j = length - 1;
        while (i < j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    j--;
                } else {
                    nums[i] = nums[j];
                    nums[j] = val;
                }

            } else {
                i++;
                if (nums[j] == val) {
                    j--;
                }
            }

        }
        if (i == j && i == 0) {
            return 0;
        }
        if (nums[i] == val) {
            return i;
        } else {
            return i + 1;
        }
    }

    public int removeElement2(int[] nums, int val) {
        //to-do implement solution
        int length = nums.length;

        if (length == 1 && nums[0] == val) {
            return 0;
        } else if (length <= 1) {
            return length;
        }
        int i = 0;
        int j = length - 1;
        while (i < j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    j--;
                } else {
                    nums[i] = nums[j];
                    nums[j] = val;
                    i++;
                    j--;
                }

            } else {
                i++;
                if (nums[j] == val) {
                    j--;
                }
            }

        }
        if (i == j && i == 0) {
            return 0;
        }
        if (nums[i] == val) {
            return i;
        } else {
            return i + 1;
        }
    }
}
