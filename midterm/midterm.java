import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // may need to change inital statement
        System.out.println("This system will allow you to manage a class list grades.");

        System.out.println("Your student Will wants to know his average, enter his assignment grades.");

        // user enters grades 
        int hw1 = sc.nextInt();
        int hw2 = sc.nextInt();
        int hw3 = sc.nextInt();

        // entered grades becomes an array 
        int[] grades = {hw1, hw2, hw3};

        // find the average of the grades 
        // starting at 0, repeat for the amount of grades, increase by 1
        // sum is the last sum plus the next grade 
        // average is the sum divided by the number of grades 
        int sum = 0;
        int average = 0;
        for (int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
            average = sum / grades.length;
        }

        // set letter variable to be empty first 
        // determine letter variable by the average number 
        String letter = "";
        if (average >= 90){
            letter = "A";
        } else if (average >= 80 && average < 90){
            letter = "B";
        } else if (average >= 70 && average < 80){
            letter = "C";
        } else{
            letter = "F";
        }

        // print out the final letter grade 
        System.out.println("Will's grade is: " + letter);


    }
}
