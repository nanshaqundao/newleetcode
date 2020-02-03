package array.easy.p0026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        // brutal force
        // sort and add to set
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        List x = Arrays.stream(nums).parallel().distinct().boxed().collect(Collectors.toList());
        IntStream.range(0, x.size()).parallel().forEach(i -> nums[i] = (int) x.get(i));
        return x.size();

    }
}
