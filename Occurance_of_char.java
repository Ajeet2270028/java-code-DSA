import java.util.*;
public class Occurance_of_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enetr sentence");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int n=str.length();
        char ch[]=str.toCharArray();
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=i+1;j<n;j++){
                if(ch[i]==ch[j]){
                    count++;
                    int k=j;
                    while(k<n-1){
                        ch[k]=ch[k+1];
                        k++;
                    }
                    n--;
                    j--;
                }
            }
            System.out.println(ch[i]+" occurred "+count+" times");
        }
    }
}
