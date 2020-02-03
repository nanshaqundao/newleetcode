package array.easy.p0026;

public class RemoveDupliateDemo {
    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = {-3,-1,0,0,0,3,3};
        removeDuplicate.removeDuplicates3(nums);
        System.out.println(nums);
    }
}
