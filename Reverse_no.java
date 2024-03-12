import java.util.*;
public class Reverse_no {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sum=0;
        System.out.println("Before reverse no:"+n);
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;

        }
        System.out.println("After revrse no: "+sum);
    }
}
