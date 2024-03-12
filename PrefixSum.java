import java.util.*;

public class PrefixSum {
  public static void fillPrefixSum(int arr[], int n, int prefixsum[]) {
    prefixsum[0] = arr[0];
    for (int i = 1; i < n; i++) {
      prefixsum[i] = prefixsum[i - 1] + arr[i];
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter Array Element:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int prefixsum[] = new int[n];

    fillPrefixSum(arr, n, prefixsum);
    System.out.println("prefix sum=");
    for (int i = 0; i < n; i++) {
      System.out.print(prefixsum[i] + " ");
    }
    System.out.println();

    sc.close();
  }
}
