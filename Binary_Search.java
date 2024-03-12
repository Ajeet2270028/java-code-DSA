import java.util.*;

public class Binary_Search {
  public static int binarySearch(int arr[], int key, int n) {
    int beg = 0;
    int last = n - 1;
    while (beg <= last) {
      int mid = beg + (last - beg) / 2;
      if (arr[mid] == key) {
        return mid + 1;
      }
      if (arr[mid] < key) {
        mid = mid + 1;
      } else {
        last = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array size: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array element: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int key = sc.nextInt();
    int result = binarySearch(arr, key, n);
    if (result == -1) {
      System.out.println("index is not found");
    } else {
      System.out.println(key + ", index is " + result);
    }
    sc.close();
  }
}
