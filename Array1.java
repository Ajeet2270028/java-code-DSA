import java.util.*;

// public class Array1 {
//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Hello");

//   }
// }

class A {
  int num;
  String name;
  // A(){}

  A(int num, String name) { // normal constructor
    this.num = num;
    this.name = name;
  }

  A(A b) { // copy constructor
    this.num = b.num;
    this.name = b.name;
  }

  void display() {
    System.out.println(num + "\n" + name);
  }
}

public class Array1 {
  public static void main(String[] args) {
    A a = new A(2270072, "Asish");
    // System.out.println(a.num);
    a.display();

    A b = new A(2270074, "Aman");
    b.display();
  }
}
