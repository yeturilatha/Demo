package lab3;
import java.util.Arrays;
import java.util.Scanner;

class ArrayOperations {
    private int[] array;

    public ArrayOperations(int[] array) {
        this.array = array;
    }

    public void bubbleSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public int binarySearch(int target) {
        Arrays.sort(array); // Binary search requires a sorted array
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public int[] mergeArrays(int[] otherArray) {
        int[] mergedArray = new int[array.length + otherArray.length];
        System.arraycopy(array, 0, mergedArray, 0, array.length);
        System.arraycopy(otherArray, 0, mergedArray, array.length, otherArray.length);
        return mergedArray;
    }
}

