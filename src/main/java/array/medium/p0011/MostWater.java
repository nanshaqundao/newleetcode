package array.medium.p0011;

public class MostWater {
    //brutal force
    public int maxArea_brutal_force(int[] height) {
        int tempMax = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tempSize = (j - i) * Math.min(height[i], height[j]);
                tempMax = Math.max(tempMax, tempSize);
            }
        }
        return tempMax;
    }

    // two pointer
    public int maxArea(int[] height) {
        int tempMax = 0;
        int lastMax = 0;
        int i = 0;
        int j = height.length - 1;
        for (int index = 0; index < height.length; index++) {
            if (height[i] > height[j]) {
                tempMax = (j - i) * height[j];
                j = j - 1;
            } else {
                tempMax = (j - i) * height[i];
                i = i + 1;
            }
            lastMax = Math.max(tempMax, lastMax);
            if (i == j) {
                break;
            }
        }
        return lastMax;
    }
}
