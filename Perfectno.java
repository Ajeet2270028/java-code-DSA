import java.util.*;
public class Perfectno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check prefect no");
        int n=sc.nextInt();
         int sum=0;
         int temp=n;
         for(int i=1;i<=n/2;i++){
            if(n%i==0)
            sum=sum+i;
         }
         if(temp==sum){
            System.out.println(n+" is prefect no");
         }
         else
         System.out.println(n+" is not perfect no");
    }
}
