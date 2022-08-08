public class forEach {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 34, 95};
        int sum = 0;

        for (int number: numbers) {
            System.out.print(sum + " + " + number + " = ");
            sum = sum+number;
            System.out.println(sum);
        }
    }
}
