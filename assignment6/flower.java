public class flower {
    String name;
    String color;
    int height;
    String location;

    public flower(String n, String c, int h, String l) {
        name = n;
        color = c;
        height = h;
        location = l;
    }

    void cute() {
        if (this.height < 20) {
            System.out.println(this.name + " is a cute flower");
        } else {
            System.out.println(this.name + " isn't cute, but still a pretty flower");
        }
    }

    void sunny() {
        if (this.location == "sun") {
            System.out.println(this.name + " should be planted on the south side of your house");
        } else {
            System.out.println(this.name + " should be planted on the north side of your house");
        }
    }
}
