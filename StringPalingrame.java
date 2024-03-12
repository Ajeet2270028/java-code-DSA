import java.util.*;
public class StringPalingrame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String a=sc.nextLine();
        char ch[]=a.toCharArray();
        for(int i=0;i<ch.length/2;i++){
             char t=ch[i];
             ch[i]=ch[ch.length-1-i];
             ch[ch.length-1-i]=t;
        }
        String str=new String(ch);
        if(str.equalsIgnoreCase(a)){
            System.out.println("this is palindrome");
        }else{
            System.out.println("this is not palindrome");

        }

    }
}
