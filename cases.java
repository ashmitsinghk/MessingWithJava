public class cases {

  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    char c = '+';
    int result = 0;
    switch (c) {
        case '+':
            result = a+b;
        case '-':
            result = a-b;
        case '*':
            result = a*b;
        case '/':
            result = a/b;
        default:
            System.out.print("Wrong operand selected. Please try again!");
            // System.exit();
    }
    System.out.println("The result is  "+result);
  }
}
