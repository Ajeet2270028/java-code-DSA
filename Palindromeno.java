import java.util.*;
public class Palindromeno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check palindrome no ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(sum+" is a palindrome no");
            
        }
        else{
            System.out.println(sum+" is not a palindrome no");

        }
    }
}
