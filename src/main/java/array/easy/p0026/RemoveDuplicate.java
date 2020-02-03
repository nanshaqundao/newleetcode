package array.easy.p0026;

import java.util.*;
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

    public int removeDuplicates2(int[] nums) {

        TreeSet out = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            out.add(nums[i]);
        }
        Iterator<Integer> iterator = out.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            nums[i] = iterator.next();
            i++;
        }
        return i;
    }

    public int removeDuplicates3(int[] nums) {
        // maybe use set but sort before
        if (nums.length < 2) {
            return nums.length;
        }

        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int temp = nums[0];
        set.add(temp);
        for (int i = 1; i < nums.length; i++) {
            if (temp != nums[i]) {
                temp = nums[i];
                set.add(temp);

            }
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());
        int d = list.size();
        IntStream.range(0, d).forEach(x -> nums[x] = list.get(x));
        return d;
    }
}
