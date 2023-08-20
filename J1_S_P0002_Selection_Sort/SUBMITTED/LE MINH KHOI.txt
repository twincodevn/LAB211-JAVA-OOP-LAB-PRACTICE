
package javaapplication76;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication76 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int num;
        String tmp;
	do
	{
            do
            {
                System.out.println("Enter number of array: ");
                tmp = sc.nextLine();
            }while (tmp.equals("") || tmp.matches("[\\D]"));
            num = Integer.parseInt(tmp);
	}
	while (num <= 0);
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = rand.nextInt(100); 
        }
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
    
    public static void selectionSort(int...x)
    {
        int len = x.length;
        for (int i = 0; i < len - 1; i++)
        {
            int idx = i;
            // Find the min and store its index
            for (int j = i; j < len; j++)
            {
                if (x[j] <= x[idx])
                {
                    idx = j;
                }
            }            
            int tmp = x[idx];
            x[idx] = x[i];
            x[i] = tmp;
        }
    }
}
