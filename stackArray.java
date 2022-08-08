import java.util.Scanner;

public class stackArray {

    int tos = -1;

    void push(int[] stack, int element) {
        try{
        tos++;
        stack[tos] = element;
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("No more elements can be pushed. The stack has overflowed.");
        }
        this.printArr(stack);
    }

    void pop(int[] stack) {
        try{
        System.out.println(stack[tos] + " has been popped.");
        stack[tos] = 0;
        --tos;
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("No more elements can be popped. The stack has underflowed.");
        }
        this.printArr(stack);
    }

    void peep(int[] stack) {
        try{
        System.out.println(stack[tos]);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("There are no elements in the stack.");
        }
    }

    void printArr(int[] stack) {
        System.out.println("Your stack:");
        for (int n: stack) {
            System.out.print(n + "\t");
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        stackArray obj1 = new stackArray();
        int[] stack = new int[5];
        Scanner input = new Scanner(System.in);
        int flag = 0;
        while (flag == 0) {
            System.out.println("=======================");
            System.out.println("Select the operation you want to perform:");
            System.out.println("1. Peep");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Exit");
            int action = input.nextInt();
            System.out.println("=======================");

            switch (action) {
                case 1:
                obj1.peep(stack);
                break;
                case 2:
                System.out.print("Enter the integer you want to push:");
                int element = input.nextInt(); 
                obj1.push(stack, element);
                break;
                case 3:
                obj1.pop(stack);
                break;
                case 4:
                flag = 1;
            }
        }
        input.close();
    }
}
