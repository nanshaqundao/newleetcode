package array.easy.p0026;

public class RemoveDupliateDemo {
    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = {1,1,1,1,2};
        int result = removeDuplicate.removeDuplicateQuick(nums);
        System.out.println(result);
    }
}
