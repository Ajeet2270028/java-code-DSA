import java.util.*;
public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter size:");
    int n=sc.nextInt();
    int ar[]=new int[n];
    System.out.println("Enter element:");
    for(int i=0;i<ar.length;i++){
        ar[i]=sc.nextInt();
    }
    System.out.println("Before Array element:");
    for(int i=0;i<ar.length;i++){
        System.out.print(ar[i]+" ");
    }
    System.out.println();
    System.out.println("After reverse Array Element:");
    // first mehtod
    /*  for(int i=n-1;i>=0;i--){
    System.out.print(ar[i]+" ");
    }*/
    //second method
    for(int i=0;i<ar.length/2;i++){
        int t=ar[i];
        ar[i]=ar[ar.length-i-1];
        ar[ar.length-i-1]=t;
    }
    for(int i=0;i<ar.length;i++){
        System.out.print(ar[i]+" ");
    }
    
    }
}
