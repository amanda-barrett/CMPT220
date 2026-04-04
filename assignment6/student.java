import java.util.Random;

public class student{ 
    String name;
    String year;
    double gpa; 
    int id;

    public student (String n, String y, double g, int i) {
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

//step 2: create method returning honor roll students
    String honors() {
        if(this.gpa > 3.6) {
            return(this.name + " is an honor student");
        } else {
            return(this.name + " is not an honor student");
        }
    }

//step 4: create method generating random id for free lunch
    void lunch(int randomId) {
        if(this.id == randomId) {
            System.out.println(this.name + " gets free lunch");
        } else {
            System.out.println(this.name + " does not get free lunch");
        }
    }
}
