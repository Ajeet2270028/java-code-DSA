import java.util.*;
public class sumofprimeno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start no to end no");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        for(int i=n;i<=m;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                count++;
            }
            if(count==2)
            sum=sum+i;
        }
        System.out.println("Sum of prime no "+sum);
    }
}
