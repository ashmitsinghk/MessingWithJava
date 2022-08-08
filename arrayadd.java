import java.util.Scanner;

public class arrayadd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, sum = 0, odd = 0, even = 0;
        int[] numbers = new int[20];
        while (i < 20) {
            System.out.print("Enter number #" + i + ": ");
            numbers[i] = input.nextInt();
            if (numbers[i]%2 == 0) {
                System.out.println(numbers[i] + " is an even number.");
                even++;
            } else {
                System.out.println(numbers[i] + " is an odd number");
                odd++;
            }
            sum += numbers[i];
            i++;
        }
        System.out.println("The sum of all the numbers in the array is: " + sum);
        System.out.println("Total odd numbers: " + odd);
        System.out.println("Total even numbers: " + even);

        input.close();
    }
}
