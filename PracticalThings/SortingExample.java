package PracticalThings;

import java.io.PrintStream;
import java.util.Arrays;

import collectionInterface.Sortable;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 7};
        
        // Using BubbleSort
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr.clone()); 
        System.out.println("Sorted array using BubbleSort: " + Arrays.toString(arr));

        // Using SelectionSort
        Sortable selectionSort = (Sortable) new SelectionSort();
        selectionSort.sort(arr.clone()); 
        System.out.println("Sorted array using SelectionSort: " + Arrays.toString(arr));
    }
}