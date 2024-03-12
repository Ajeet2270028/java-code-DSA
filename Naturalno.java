import java.util.*;
public class Naturalno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter end number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
