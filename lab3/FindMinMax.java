package lab3;

import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the largest and smallest elements
        int largest = findLargest(array);
        int smallest = findSmallest(array);

        // Display results
        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);

        scanner.close();
    }

    // Function to find the largest element in the array
    private static int findLargest(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    // Function to find the smallest element in the array
    private static int findSmallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}