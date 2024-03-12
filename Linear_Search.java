import java.util.*;

public class Linear_Search {
    static int pos(int ar[], int n) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n)
                return i;

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element:");
        int m = sc.nextInt();
        int result = pos(arr, m);
        System.out.println(result);

        sc.close();
    }

}
