import java.util.Scanner;

enum Size {
    XXVIII, XXX, XXXIV, XXXVIII, XL, NIL
}
class Jean {
    Size jeanSize;
    public Jean (int jeanSize) {
        Size selectedSize = null;
        switch(jeanSize) {
            case 28:
            selectedSize = Size.XXVIII;
            break;
            case 30:
            selectedSize = Size.XXX;
            break;
            case 34:
            selectedSize = Size.XXXIV;
            break;
            case 38:
            selectedSize = Size.XXXVIII;
            break;
            case 40:
            selectedSize = Size.XL;
            break;
            default:
            selectedSize = Size.NIL;
        }
        this.jeanSize = selectedSize;
    }
    public void orderJeans() {
        switch (jeanSize) {
            case XXVIII:
            System.out.println("I ordered a pair of jeans of size 28.");
            break;
            case XXX:
            System.out.println("I ordered a pair of jeans of size 30.");
            break;
            case XXXIV:
            System.out.println("I ordered a pair of jeans of size 34.");
            break;
            case XXXVIII:
            System.out.println("I ordered a pair of jeans of size 38.");
            break;
            case XL:
            System.out.println("I ordered a pair of jeans of size 40.");
            break;
            default:
            System.out.println("The size you selected is not available for this product.");
            break;
        }
    }
}

public record jeans() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your preferred size to order a pair of jeans: ");
        int size = input.nextInt();
        Jean j1 = new Jean(size);
        j1.orderJeans();
        input.close();
    }
}
