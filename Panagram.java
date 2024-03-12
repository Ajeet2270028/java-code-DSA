import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr sentence1");
        String b=sc.nextLine();
        String a=sc.nextLine();
        a=a.replace(" ", "");
        b=b.replace(" ", "");
        a=a.toLowerCase();
        b=b.toLowerCase();
        int result=a.compareTo(b);
        if(result==1){
            System.out.println("this is panagram");
        }else
        System.out.println("this is not panagram");
    }
}
