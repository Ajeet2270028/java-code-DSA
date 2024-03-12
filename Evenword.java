public class Evenword {
  public static void main(String[] args) {
    String str = "hell words";
    String s[] = str.split(" ");
    for (int i = 0; i < s.length; i++) {
      if (s[i].length() % 2 == 0) {
        System.out.println(s);
      }
    }
  }
}
