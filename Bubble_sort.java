import java.util.*;

public class Bubble_sort {

  public void bubblesort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }

      }
    }
  }

  public void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

  public static void main(String[] args) {
    Bubble_sort ob = new Bubble_sort();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size in array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array element: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    ob.bubblesort(arr);
    System.out.println("After Bubblesort sorting: ");
    ob.printArray(arr);
    sc.close();
  }
}
