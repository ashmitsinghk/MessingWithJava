import java.util.ArrayList;
import java.util.Scanner;

public class stackArraylist {

    int tos = -1;
    private ArrayList<Integer> arrayList = new ArrayList<>();


    void push(int element) {
        try{
        tos++;
        arrayList.add(element);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("No more elements can be pushed. The stack has overflowed.");
        }
        this.printArr();
    }

    void pop() {
        try{
        System.out.println(arrayList.get(tos) + " has been popped.");
        arrayList.remove(tos);
        --tos;
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("No more elements can be popped. The stack has underflowed.");
        }
        this.printArr();
    }

    void peep() {
        try{
        System.out.println(arrayList.get(tos));
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("There are no elements in the stack.");
        }
    }

    void printArr() {
        System.out.println("Your stack:");
        System.out.println(arrayList);
    }

    public static void main(String[] args){
        stackArraylist obj1 = new stackArraylist();
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
                obj1.peep();
                break;
                case 2:
                System.out.print("Enter the integer you want to push:");
                int element = input.nextInt(); 
                obj1.push(element);
                break;
                case 3:
                obj1.pop();
                break;
                case 4:
                flag = 1;
            }
        }
        input.close();
    }
}
