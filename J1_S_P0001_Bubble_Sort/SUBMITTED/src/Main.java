
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter number of array: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] array = generateRandomArray(n);

        System.out.print("Unsorted Array: ");
        displayArray(array);

        bubbleSort(array);

        System.out.print("Sorted Array: ");
        displayArray(array);

        sc.close();
    }

    public static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public static void displayArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
