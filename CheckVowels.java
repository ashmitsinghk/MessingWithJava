import java.util.Scanner;

public class CheckVowels {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = input.nextLine();
    int[] vowels = new int[5];

    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)) {
        case 'a':
        case 'A':
          vowels[0]++;
          break;
        case 'e':
        case 'E':
          vowels[1]++;
          break;
        case 'i':
        case 'I':
          vowels[2]++;
          break;
        case 'o':
        case 'O':
          vowels[3]++;
          break;
        case 'u':
        case 'U':
          vowels[4]++;
          break;
      }
    }

    System.out.print(
      "Occurences of the letter a = " +
      vowels[0] +
      "\nOccurences of the letter e = " +
      vowels[1] +
      "\nOccurences of the letter i = " +
      vowels[2] +
      "\nOccurences of the letter o = " +
      vowels[3] +
      "\nOccurences of the letter u = " +
      vowels[4] +
      "\nTotal vowels in the given string = " +
      (vowels[0] + vowels[1] + vowels[2] + vowels[3] + vowels[4])
    );

    input.close();
  }
}
