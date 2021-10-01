package thoughts.rota;

public class RotaWork {

    int counter = 0;

    public static void main(String[] args) {

        // total person*day is 100 * 3 = 300

        // start form 5 people


//        int[][] aa = new int[5][5];
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(aa[i][j]);
//            }
//            System.out.println("");
//        }
        RotaWork rotaWork = new RotaWork();
        rotaWork.solution(15, 25);
        System.out.println("total count of possible selection is: " + rotaWork.counter);

    }

    public void solution(int k, int n) {
        System.out.println("Select k numbers from an array of n numbers.");
        System.out.println("k = " + k);
        System.out.println("n = " + n);

        int[] array = new int[n];
        getResult(0, n - 1, k, array);
    }

    public void getResult(int start, int end, int numberToPick, int[] array) {


        if (numberToPick == 0) {
            if (evenDistributed(array)) {
                counter = counter + 1;
            }
            // no more to pick, the condition is met
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i]);
//                if ((i + 1) % 5 == 0) {
//                    System.out.println("");
//                }
//            }
//            System.out.println("----");
            array[start - 1] = 0;

            return;
        }


        for (int i = start; i < end + 2 - numberToPick; i++) {

            // 先选这个
            array[i] = 1;
            getResult(i + 1, end, numberToPick - 1, array);

            // 再不选这个
            array[i] = 0;
        }
    }

    private boolean evenDistributed(int[] array) {
        int evenNumber = array.length * 3 / 25;
        // 确保每列平衡
        for (int i = 0; i < 5; i++) {
            int columnSum = 0;

            for (int j = i; j < array.length; j = j + 5) {
                if (columnSum > evenNumber) {
                    return false;
                }
                columnSum = columnSum + array[j];
            }
            if (columnSum != evenNumber) {
                return false;
            }
        }

        // 确保每行平衡

        for (int i = 0; i < array.length / 5; i++) {
            int rowSum = 0;
            rowSum = array[i * 5] + array[i * 5 + 1] + array[i * 5 + 2] + array[i * 5 + 3] + array[i * 5 + 4];
            if (rowSum != 3) {
                return false;
            }
        }
        System.out.println("============proper result===========");
        System.out.println("============Number: " + counter + "===========");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println("");
            }
        }
        System.out.println("============proper result===========");
        return true;
    }


}
