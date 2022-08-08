import java.util.Scanner;

public class checkSort {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] list = new int[10];
    int flag = 0, j = 0;
    while (j < list.length) {
      System.out.print("Enter number #" + (j + 1) + ": ");
      list[j] = input.nextInt();
      j++;
    }
    for (int i = 0; i < (list.length - 1); i++) {
      if (list[i] >= list[i + 1]) {
        flag = 1;
      } else {
        flag = 2;
        break;
      }
    }
    if (flag == 2) {
      for (int i = 0; i < (list.length - 1); i++) {
        if (list[i] <= list[i + 1]) {
          flag = 0;
        } else {
          flag = 2;
          break;
        }
      }
    }
    switch (flag) {
      case 0:
        System.out.print("The array is sorted in ascending order.");
        break;
      case 1:
        System.out.print("The array is sorted in descending order.");
        break;
      case 2:
        System.out.print("The array is not sorted in any order.");
    }
    input.close();
  }
}
