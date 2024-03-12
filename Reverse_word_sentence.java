import java.util.*;
public class Reverse_word_sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr sentence");
        String str=sc.nextLine();
        String s[]=str.split(" ");
        for(int i=0;i<s.length;i++){
            int n=s[i].length();
            char ch[]=s[i].toCharArray();
            for(int j=0;j<n/2;j++){
                  char t=ch[j];
                  ch[j]=ch[n-j-1];
                  ch[n-j-1]=t;
            }
            String st1=new String(ch);
            System.out.print(st1+" ");
        }

    }
}
