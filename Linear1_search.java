
public class Linear1_search {
  public static int linerSearch(int arr[], int key, int n) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 23, 45, 67, 34, 22, 20, 10, 31 };
    int key = 34;
    int len = arr.length;
    int result = linerSearch(arr, key, len);
    if (result == -1) {
      System.out.println(key + ",Index is not Found");
    } else {
      System.out.println(key + ",index is " + result);
    }
  }
}
