import java.util.*;
public class GCD {
        //Greater comman divison
        static int gcd(int n,int m){
            if(n<m)
            return gcd(m,n);
            if(m==0)
            return n;
            return gcd(m,n%m);


        }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter tow number a and b:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result=gcd(a,b);
    System.out.println(a+"and"+b+"is gcd="+result);
}
}
