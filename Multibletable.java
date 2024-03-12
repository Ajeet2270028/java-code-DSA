import java.util.*;
public class Multibletable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start no to end no");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;n<=m;i++)
        {
            for(int j=1;j<=10;j++){
                System.out.print(i+"*"+j+ "="+i*j+"\t");
            }
        }
        System.out.println();
    }
}
