import java.util.Arrays;
import java.util.Scanner;

public class binary_search{
    public static int indexOf(int[] arr, int targetVal) {
        int low = 0;
        int high = arr.length - 1; 
        int mid;
        while (low <= high) { 
            mid = (low + high) / 2;
            if (arr[mid] == targetVal) {
                return mid;
            } else if (arr[mid] < targetVal) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return -1; 
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i] > arr[j]) { 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array values: ");
        int n = scanner.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter the array values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value: ");
        int targetVal = scanner.nextInt();
        arr = sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr)); 
        int result = indexOf(arr, targetVal);
        if (result != -1) {
            System.out.println("Value is found at index: " + result);
        } else {
            System.out.println("Value not found in the array.");
        }
        scanner.close();
    }
}
