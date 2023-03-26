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
        // Initial the max value of the water container
        int tempMax = 0;
        // Initial the last max value of the water container
        int lastMax = 0;
        // Initial the index of the left side of the water container
        int left = 0;
        // Initial the index of the right side of the water container
        int right = height.length - 1;
        // Loop the height array
        for (int index = 0; index < height.length; index++) {
            // Compare the height of the left and right side of the water container
            // If the height of the left side is bigger than the right side, the right side will move to the left side
            if (height[left] > height[right]) {
                // Calculate the current water container's max value
                tempMax = (right - left) * height[right];
                // Move the right side to the left side
                right = right - 1;
            } else {
                // Calculate the current water container's max value
                tempMax = (right - left) * height[left];
                // Move the left side to the right side
                left = left + 1;
            }
            // Compare the current water container's max value and the last water container's max value
            lastMax = Math.max(tempMax, lastMax);
            // If the left side and right side meet, the loop will be break
            if (left == right) {
                break;
            }
        }
        return lastMax;
    }
}
