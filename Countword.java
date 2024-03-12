import java.util.*;
public class Countword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr word");
        String str=sc.nextLine();
        String st="";
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                st=st+c;
                c=0;

            }
            else{
                c++;
                st=st+str.charAt(i);
            }
            
        }
        st=st+c;
        System.out.println(" no of count each word in sentence= "+ st);


    }
}
