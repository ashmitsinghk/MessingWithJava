import java.util.Scanner;

public class bubbleSort {

  static void getArray(int[] array) {
    for (int n : array) {
      System.out.print(n + "  ");
    }
    System.out.println("");
  }

  static void sortArray(int[] array) {
    int i = 0;
    while (i < (array.length)) {
      for (int j = 0; j < (array.length - 1); j++) {
        if (array[j] > array[j + 1]) {
          array[j] = array[j] + array[j + 1];
          array[j + 1] = array[j] - array[j + 1];
          array[j] = array[j] - array[j + 1];
        }
      }
      i++;
    }
    getArray(array);
  }

  static void binarySearch(int query, int[] array) {
    int beginning = 0;
    int ending = array.length - 1;
    int middle = (beginning + ending) / 2;
    int loc = -1;
    while (beginning < ending) {
      if (query > array[middle]) {
        beginning = middle + 1;
      } else if (query < array[middle]) {
        ending = middle - 1;
      } else if (query == array[middle]) {
        loc = middle;
        break;
      }
      middle = (beginning + ending) / 2;
    }
    switch (loc) {
      case -1:
        System.out.print(
          "The element " + query + " does not exist in the array."
        );
        break;
      default:
        System.out.print(
          "The element " + query + " was found at position " + middle
        );
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] list = new int[10];
    int i = 0;
    while (i < list.length) {
      System.out.print("Enter element " + (i + 1) + ": ");
      list[i] = input.nextInt();
      i++;
    }
    System.out.print("Entered array = ");
    getArray(list);
    System.out.print("Sorted array = ");
    sortArray(list);

    System.out.print("Enter the element you want to search from the list: ");
    int query = input.nextInt();
    binarySearch(query, list);

    input.close();
  }
}
