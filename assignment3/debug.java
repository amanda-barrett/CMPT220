import java.util.Scanner;

public class Debug3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        // Fix: change i=1 and i<=10

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        Integer X = sc.nextInt();
        //here's a hint
        int factorial = 1;
        for (int i = 1; i <= X; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        // Fix: create variable for input, create variable for factorial, change i = 1, change i<=X, compute factorial in loop

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        Integer num = sc.nextInt();
        //No hint! what do you need to complete this task?
        int sum = 0; 
        for (int i = 1; i <= num; i += 2){
            sum += i;
        }
        System.out.println(sum);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false; 
        }
        // Fix: add run = false inside loop
        
        Scanner input = new Scanner(System.in);

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("Enter a string and I will print it in reverse: ");
        String normal = input.nextLine();
        //hint
        String reverse = "";
        for (int i = normal.length() - 1; i >= 0; i--){
            reverse = reverse + normal.charAt(i);
        }
        System.out.println(reverse);

    }
}
