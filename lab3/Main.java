package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayOperations arrayOperations = new ArrayOperations(array);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sort array using Bubble Sort");
            System.out.println("2. Sort array using Selection Sort");
            System.out.println("3. Search array using Binary Search");
            System.out.println("4. Merge two arrays");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arrayOperations.bubbleSort();
                    System.out.println("Sorted Array using Bubble Sort: " + Arrays.toString(array));
                    break;
                case 2:
                    arrayOperations.selectionSort();
                    System.out.println("Sorted Array using Selection Sort: " + Arrays.toString(array));
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    int target = scanner.nextInt();
                    int result = arrayOperations.binarySearch(target);
                    if (result != -1) {
                        System.out.println("Element " + target + " found at index " + result);
                    } else {
                        System.out.println("Element " + target + " not found in the array");
                    }
                    break;
                case 4:
                    System.out.print("Enter size of the second array: ");
                    int size2 = scanner.nextInt();
                    int[] array2 = new int[size2];
                    System.out.println("Enter elements of the second array:");
                    for (int i = 0; i < size2; i++) {
                        array2[i] = scanner.nextInt();
                    }
                    int[] mergedArray = arrayOperations.mergeArrays(array2);
                    System.out.println("Merged Array: " + Arrays.toString(mergedArray));
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
