import java.util.*;
public class Reverse_the_Sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr sentemce");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            char t=ch[i];
            ch[i]=ch[ch.length-i-1];
            ch[ch.length-i-1]=t;
        }
        String str1=new String(ch);
        System.out.println(str1);
    }
}
