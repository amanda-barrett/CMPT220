/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will give you your average grade of 3 assignments");
//user input of grades
        System.out.println("Enter your first grade");
        int grade1 = sc.nextInt();
        System.out.println("Enter your second grade");
        int grade2 = sc.nextInt();
        System.out.println("Enter your third grade");
        int grade3 = sc.nextInt();

//print out average grade 
//call average function with grade inputs as parameters
        System.out.println(average(grade1, grade2, grade3));
    }

//average function
    public static String average(int x, int y, int z){
//calcuating average 
        int grade = (x+y+z)/3;
//determining letter equivalance 
        String letter;
        if (grade >= 90) {
            letter = "an A";
        } else if (grade >= 80) {
            letter = "a B";
        } else if (grade >= 70) {
            letter = "a C";
        } else {
            letter = "failing F";
        }
//returning final statement
        return "You average grade is: " + grade + ". You have " + letter;
    }

   
}
