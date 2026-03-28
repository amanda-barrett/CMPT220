/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class Debug5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
//problem 2
    System.out.println("Problem 2: Enter a number and I will tell you the factorial: ");
    Integer num1 = sc.nextInt();
    System.out.println(factorialnum(num1));
    
//problem 3
    System.out.println("Problem 3: Enter a number and I will tell you the sum of every other number: ");
    Integer num2 = sc.nextInt();
    System.out.println(adddigits(num2));

    Scanner input = new Scanner(System.in);
//problem 5
    System.out.println("Problem 5: Enter a string and I will print it in reverse: ");
    String words = input.nextLine();
    System.out.println(reverse(words));
    
    }

//problem 2
    public static int factorialnum(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++){
            factorial = factorial * i;
        }
        return(factorial);
    }
  
//problem 3
    public static int adddigits(int y) {
        int sum = 0;
        for (int i = 1; i <= y; i += 2){
            sum += i;
        }
        return(sum);
    }

//problem 5
    public static String reverse(String z) {
        String reversed = "";
        for (int i = z.length() - 1; i >= 0; i--){
            reversed = reversed + z.charAt(i);
        } 
        return(reversed);
    }
}
