import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4,5,9};
        int arr[];
        for(int i=ar.length-1;i>ar.length-2;i++){
            while(ar[i]==9){
                ar[i]=ar[i]+1;
                break;
            }
            if(ar[i]!=9){
                ar[i]=ar[i]+1;
            }
            for(int j=0;j<ar.length;j++){
              System.out.println(ar[j]);
            }

        }
        //System.out.println();
        arr=new int[ar.length+1];
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        //System.out.println();
    }
}
