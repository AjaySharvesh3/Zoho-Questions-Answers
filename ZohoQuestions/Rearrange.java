package ZohoQuestions.ZohoQuestions;

import java.util.Scanner;

public class Rearrange {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int array[] = new int[limit];

        for(int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        printArray(array);
        sortArray(array);
        System.out.println();
        printArray(array);
        rearrange(array, limit);
        System.out.println();
        printArray(array);
    }

    private static void printArray(int array[]) {
        for (int arr: array) {
            System.out.print(arr + " ");
        }
    }

    private static void sortArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void rearrange(int array[], int n) {
        int temp[] = new int[n];
        boolean value = true;
        int small = 0, large = n-1;
        for (int i = 0; i < array.length; i++) {
            if (value)  temp[i] = array[large--];
            else temp[i] = array[small++];
            value = !value;
        }
        for (int ii = 0; ii < array.length; ii++) {
            array[ii] = temp[ii];
        }
    }
}