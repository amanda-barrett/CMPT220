import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //receiving and printing the user's age
        System.out.println("How old are you? ");
        Integer userage = sc.nextInt();
        System.out.println("Thanks! You are " + userage);
        
        //add two variables together
        int num1 = 10;
        int num2 = 37;
        System.out.println(num1 + num2);
        
        //what I learned: How to receive a user's age as an integer and print it back to them and how to add two integers together.
    }
}
