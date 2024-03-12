import java.util.*;
public class RangeofFibonacc {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter last tern of fiboncci series");
       int n=sc.nextInt();
       int a=0;
       int b=1;
       int c=0;
       System.out.print(a+" ");
       System.out.print(b+" ");
       for(int i=2;i<=n;i++){
        c=a+b;
        if(c<=n)
        System.out.print(c+" ");
        a=b;
        b=c;
       }
    }
}
