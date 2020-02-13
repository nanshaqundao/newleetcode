package array.medium.p0031;

public class NextPermutationDemo {
    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        int[] nums = {
                1,2,3
        };

        nextPermutation.nextPermutation(nums);
        changeIt(nums);
        System.out.println(nums);
    }

    public static void changeIt(int[] nums){
        nums[0] = 11;
    }
}
