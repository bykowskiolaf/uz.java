//Dla macierzy wynikowej z zadania numer 1 zaimplementuj i wykonaj mechanizmy:
//
//- sortowania bąbelkowego
//- sortowania szybkiego (quicksort)
//Przedstaw 2 pierwsze przebiegi mechanizmów sortowania.

import java.util.Arrays;

public class Zad4 {
    public static void bubbleSort(Integer[] arr) {
        // this loop will run arr.length times
        for (int i = arr.length; i > 0; i--) {
            // this loop will run arr.length - 1 times
            for (int j = 1; j < i; j++ ) {
                // this if statement checks if the current element is bigger than the next one
                if (arr[j - 1] > arr[j]) {
                    // if it is, then swap them
                    Integer buffer = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
    }

    public static void quickSort(Integer[] arr, int begin, int end) {
        // this if statement checks if the begin index is smaller than the end index
        if (begin < end) {
            // this variable stores the index of the pivot
            int partitionIndex = partition(arr, begin, end);

            // this recursive call sorts the left side of the array
            quickSort(arr, begin, partitionIndex-1);
            // this recursive call sorts the right side of the array
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        // this loop will run from begin to end-1
        for (int j = begin; j < end; j++) {
            // this if statement checks if the current element is smaller or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // if true then swap arr[i] and arr[j]
                int buffer = arr[i];
                arr[i] = arr[j];
                arr[j] = buffer;
            }
        }

        // swap arr[i+1] and arr[end] (or pivot)
        int buffer = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = buffer;

        // return the index of the pivot
        return i+1;
    }

    public static void main(String[] args) {
        Zad1 zad1 = new Zad1();

        // clone numArr to numArrCopy using .clone() method
        System.out.println(Arrays.toString(zad1.numArr));
        quickSort(zad1.numArr, 0 , zad1.numArr.length-1);
        System.out.println(Arrays.toString(zad1.numArr));
    }
}
