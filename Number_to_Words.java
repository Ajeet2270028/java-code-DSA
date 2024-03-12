import java.util.*;
public class Number_to_Words {
    static String one[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelven","Thirteen","Fourteen","Fiveteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String two[]={"","Twenty","Thirty","Fourty","Fivety","sixty","Seventy","Eighty","Ninety"};
    static void pw(int n,String str){
        if(n<=19)
        System.out.println(one[n]+"");
        else
        System.out.println(two[n/10]+one[n%10]+"");
        if(n!=0)
        System.out.println(str+"");
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    pw(n/10000000,"crores");
    pw((n/100000)%100,"lakhs");
    pw((n/1000)%100,"Thousand");
    pw((n/100)%10,"hundered");
    pw(n%100,"");
   } 
}
