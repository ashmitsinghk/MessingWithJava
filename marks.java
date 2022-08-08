import java.util.Scanner;
class marks {
 public static void main(String[] args) {
    int[] rollNumbers = {1, 2, 4, 7, 8};
    int[] marks = {10, 20, 14, 17, 18};
    String[] names = {"Ram","Sham","Ajay","Krishma","Bhawna"};
    Scanner input = new Scanner(System.in);
    int choice;
    int index = -1;
    System.out.println("Please enter your choice to search for the marks:\n1. Search by Name\n2. Search by Roll Number");
    choice = input.nextInt();
    switch(choice){
        case 1:
            System.out.println("Enter the name of stu student.");
            String name = input.next();
            for(int i=0;i<5;i++){
                if(names[i].equals(name)){
                     System.out.println("The student with name "+name+" has scored "+marks[i]+" marks.");
                }
            }
            if(index==-1){
                    System.out.println("The requested student name does not exist");
                }
            break;
        case 2:
            System.out.println("Enter the roll number of the student");
            int rollNo = input.nextInt();
            for(int i=0;i<5;i++){
                if(rollNumbers[i]==rollNo){
                    System.out.println("The student with roll number "+rollNo+" has scored "+marks[i]+" marks.");
                }
                if(index==-1){
                    System.out.println("The requested student roll number does not exist");
                }
            }
            break;
        default:
            System.out.println("The selected choice is invalid. Please try again!");
    }
    input.close();
 }
}