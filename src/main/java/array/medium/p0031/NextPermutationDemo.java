package array.medium.p0031;

public class NextPermutationDemo {
    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        int[] nums = {
                2, 3, 1
        };

        nextPermutation.nextPermutation(nums);
        print(nums);
        System.out.println("");
    }

    static void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i);
        }
    }


}
