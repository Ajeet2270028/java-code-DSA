import java.util.*;
public class Count_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String a=sc.nextLine();
        a=a.replace(" ", "");
        char ch[]=a.toCharArray();
        int j=ch.length;
        System.out.println("total character count ="+j);
    }
}
