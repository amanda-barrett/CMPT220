/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
!!!!!!
Look into things like charAt- DO NOT NAME YOUR VARIABLE "REVERSED". If you do, automatic 0 points!!!!!!
!!!!!!!
if you're confused reach out!
 */

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}

/* charAt() takes a string and can return a new string given the index 
    For this code, I included the basics of asking for user input with a scanner. 
    The loop in the code is what prints out the string's letters indiviually. 
    The string in english: 
        Start at 0, repeat for how long the inputed string is, increase by 1
        Print the inputed string one index at a time, repeat the number of times said above
 */
