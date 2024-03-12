import java.util.*;

public class Merge_sort {
  public static void merge(int arr[], int first, int mid, int last) {

    int n1 = mid - first + 1;
    int n2 = last - mid;
    int L[] = new int[n1];
    int R[] = new int[n2];
    for (int i = 0; i < n1; ++i) {
      L[i] = arr[i + first];
    }
    for (int j = 0; j < n2; ++j) {
      R[j] = arr[mid + 1 + j];
    }
    int i = 0, j = 0;
    int k = first;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  public void sort(int arr[], int first, int last) {
    if (first < last) {
      int mid = first + (last - first) / 2;
      sort(arr, first, mid);
      sort(arr, mid + 1, last);
      merge(arr, first, mid, last);

    }

  }

  public void printArray(int arr[]) {
    for (int i = 0; i < arr.length; ++i)
      System.out.print(arr[i] + " ");
  }

  public static void main(String[] args) {
    Merge_sort ob = new Merge_sort();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size in array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array element: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    ob.sort(arr, 0, arr.length - 1);
    System.out.println("After Mergesort sorting: ");
    ob.printArray(arr);

    sc.close();
  }
}
