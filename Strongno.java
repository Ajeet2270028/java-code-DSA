import java.util.*;

public class Strongno {
    static int fact(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check Strong number");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(num>0){
            int rem=num%10;
             sum=sum+fact(rem);
             num=num/10;
        }
        if(n==sum){
            System.out.println(n+" is a stromg number");
        }
        else{
            System.out.println(n+" is not a stromg number");

        }
    }
}
