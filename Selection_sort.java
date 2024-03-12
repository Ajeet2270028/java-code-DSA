import java.util.*;

public class Selection_sort {
  public void sort(int arr[]) {

    // selection sort
    for (int i = 0; i < arr.length; i++) {
      int min_idx = i;
      for (int j = i + 1; j < arr.length; j++)
        if (arr[j] < arr[min_idx])
          min_idx = j;

      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;

    }

  }

  public void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

  public static void main(String[] args) {
    Selection_sort ob = new Selection_sort();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size in array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array element: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    ob.sort(arr);
    System.out.println("After selection sorting: ");
    ob.printArray(arr);

    sc.close();
  }
}
