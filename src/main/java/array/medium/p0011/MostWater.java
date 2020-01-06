package array.medium.p0011;

public class MostWater {
    public int maxArea(int[] height) {
        int tempMax = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tempSize = (j - i) * Math.min(height[i], height[j]);
                tempMax = Math.max(tempMax, tempSize);
            }
        }
        return tempMax;
    }
}
