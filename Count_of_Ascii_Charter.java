import java.util.*;
public class Count_of_Ascii_Charter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int lc=0,uc=0,dc=0,spc=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                uc++;
            }
            else if(ch[i]>=97 && ch[i]<=122){
                lc++;
            }
            else if(ch[i]>=48 && ch[i]<=57){
                dc++;
            }
            else
            spc++;
        }
        System.out.println("lower letter= "+lc);
        System.out.println("upper letter= "+uc);
        System.out.println("digit letter= "+dc);
        System.out.println("specal letter= "+spc);
       
    }
}
