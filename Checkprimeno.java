import java.util.*;
public class Checkprimeno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check prime no");
        int n=sc.nextInt();
        int count=0;
        if(n==1){
            System.out.println(n+" is nt prime no");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0)
            count++;
        }
        if(count==2)
        System.out.println(n+" is aprime no");
        else 
        System.out.println(n+" is a composition no");
    }
}

