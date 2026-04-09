public class Main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy e1 = new Enemy(5, 2);
        e1.attack();

        //create a fire and an ice wizard and call all functions
        Wizard w1 = new Wizard(8, 4, "fire");
        Wizard w2 = new Wizard(7, 6, "ice");
        w1.damageType();
        w2.damageType();

        //create a goblin and call its functions
        Goblin g1 = new Goblin(6, 5);
        g1.attack();
    }
}
