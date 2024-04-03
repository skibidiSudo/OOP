package hus.oop.lab3;

import java.util.Scanner;

public class ExercisesOnAlgorithms_SortingAndSearching {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //testLinearSearch();
        //testBinarySearch();
        testSort();
    }
    public static boolean linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int arr[], int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void testLinearSearch(){
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        if (linearSearch(arr, key)){
            System.out.println("Found the key");
            System.out.println("The index of the key in the array is: " + linearSearchIndex(arr, key));
        } else {
            System.out.println("Not found the key");
        }
    }
    public static boolean binarySearch(int arr[], int key, int fromIdx, int toIdx){
        int l = fromIdx, r = toIdx;
        while (l <= r){
            int m = (l+r)/2;
            if (arr[m] == key){
                return true;
            } else if (arr[m] > key) {
                return binarySearch(arr, key, fromIdx, m - 1);
            } else {
                return binarySearch(arr, key, m + 1, toIdx);
            }
        }
        return false;
    }
    public static boolean binarySearch(int arr[], int key){
        int l = 0, r = arr.length - 1;
        while (l <= r){
            int m = (l+r)/2;
            if (arr[m] == key){
                return true;
            } else if (arr[m] > key) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
    public static void testBinarySearch(){
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        System.out.print("Enter the first index search: ");
        int fromIdx = sc.nextInt();
        System.out.print("Enter the last index search: ");
        int toIdx = sc.nextInt();
        if (binarySearch(arr, key, fromIdx, toIdx)){
            System.out.println("Found the key");
        } else {
            System.out.println("Not found the key");
        }
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++){
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void testSort(){
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        /*bubbleSort(arr);
        System.out.print("Elements of array after bubble sort: ");
        for (int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }*/
        /*selectionSort(arr);
        System.out.print("Elements of array after seclection sort: ");
        for (int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }*/
        insertionSort(arr);
        System.out.print("Elements of array after insertion sort: ");
        for (int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
