import java.util.Scanner;

public class insertAtLoc {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    int len = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        len++;
      } else {
        break;
      }
    }
    System.out.print("Enter the number you want to insert: ");
    int num = input.nextInt();
    System.out.print("Enter the index location you want to insert at: ");
    int index = input.nextInt();
    for (int i = len; i >= index; i--) {
      array[i] = array[i - 1];
    }
    array[index] = num;
    
    

    for (int i : array) {
      System.out.print(i + " ");
    }
    input.close();
  }
}
