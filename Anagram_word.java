import java.util.*;
public class Anagram_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String word=sc.nextLine();
        String word1=sc.nextLine();

        word=word.replace(" ", "");
        word1=word1.replace(" ", "");
        word=word.toLowerCase();
        word1=word1.toLowerCase();

        char []a=word.toCharArray();
        char []b=word1.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result=Arrays.equals(a,b);
        if(result==true){
            System.out.println("this is anagram word");
        }else
        System.out.println("this is not anagram word");
    }
}
