import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

//step 1: create 5 students
        student s1 = new student("Amanda", "sophomore", 3.8, 20385 );
        student s2 = new student("Lauren", "freshman", 3.7, 20386);
        student s3 = new student("Reese", "junior", 3.65, 20872);
        student s4 = new student("William", "sophomore", 3.3, 20129);
        student s5 = new student("Robert", "freshman", 3.55, 20254);

//step 3: check if students are honor roll
        System.out.println(s1.honors());
        System.out.println(s2.honors());
        System.out.println(s3.honors());
        System.out.println(s4.honors());
        System.out.println(s5.honors());

//step 6: check if students receive free lunch
        Random rand = new Random();
        int randomId = rand.nextInt(5) + 1;
        
        s1.lunch(randomId);
        s2.lunch(randomId);
        s3.lunch(randomId);
        s4.lunch(randomId);
        s5.lunch(randomId);

//flower class
        flower f1 = new flower("rose", "red", 40, "sun");
        flower f2 = new flower("hydrandra", "blue", 60, "sun");
        flower f3 = new flower("tulip", "orange", 12, "sun");
        flower f4 = new flower("lily of the valley", "white", 8, "shade");

        f1.cute();
        f2.cute();
        f3.cute();
        f4.cute();

        f1.sunny();
        f2.sunny();
        f3.sunny();
        f4.sunny();
    }
}

/* What I learned: 
    - how to create different classes
    - how to set parameters for a class
    - how to add new variables to a class
    - how to add functions to a class
    - how to run functions from a class 
 */
