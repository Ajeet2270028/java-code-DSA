import java.util.Arrays;

public class RemoveArray {
  public static void main(String[] args) {
    int[] orignalarray = { 1, 2, 3, 4, 5, 6, };
    int removeelement = 4;
    int[] newArray = remove(orignalarray, removeelement);

    System.out.println("original Array" + Arrays.toString(orignalarray));
    System.out.println("New Array" + Arrays.toString(newArray));
  }

  public static int[] remove(int[] array, int element) {
    int newarray[] = new int[array.length - 1];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != element) {
        newarray[index] = array[i];
        index++;
      }
    }
    return newarray;
  }
}
