package my_tasks.task22;

public class FindSecondElement {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 9, 7};
        int[] array2 = {1, 3, 4, 7, 9, 2};
        int[] array3 = {5, 5, 5, 5};

        findSecondMax(array1);
        findSecondMax(array2);
        findSecondMax(array3);
    }

    public static void findSecondMax(int[] array) {
        Integer max = array[0];
        Integer preMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                preMax = max;   // 1 1 3 5 7
                max = array[i]; // 1 3 5 7 9
            }
        }

        if (preMax == max) {
            preMax = null;
        }
        System.out.println("Max element: " + max);
        System.out.println("PreMax element: " + preMax);
        System.out.println("-------------------------");
    }

}
