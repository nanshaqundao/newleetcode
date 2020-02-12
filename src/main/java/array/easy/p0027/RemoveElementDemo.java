package array.easy.p0027;

public class RemoveElementDemo {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {
                3,2,2,3
        };
        int val = 2;
        int result = removeElement.removeElement(nums,val);
        System.out.println(result);
    }
}
