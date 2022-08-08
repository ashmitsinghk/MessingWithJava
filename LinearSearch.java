import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {10, 12, 14, 16, 18, 20};
        System.out.print("Enter the number to search from the array: ");
        int search = input.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == search) {
                System.out.print(search + " is present in the array.");
                break;
            } else if(i == (list.length - 1)) {
                System.out.print(search + " is not present in the array.");
            }
        }
        input.close();
    }
}
