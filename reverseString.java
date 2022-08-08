import java.util.Scanner;

// import java.util.Scanner;

public class reverseString {
    static String reverse(String str,int len) {
        if(len>0){
            return (str.charAt(len-1)+reverse(str,len-1));
        }
        else{
            System.out.println("");
            return " ";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string you want to reverse: ");
        String str = input.nextLine();
        int len = str.length();
        String reversed = reverse(str,len);
        System.out.println("Reversed String = "+reversed);

        input.close();
    }
}
