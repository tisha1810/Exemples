package arrays;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 4, 6, 7, 4, 8};
        print(array);
        sortChanger(array);
        print(array);
    }

    public static void print(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }


    public static void sortChanger(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] == 4) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                array[i] = null;
            }
        }
    }
}
