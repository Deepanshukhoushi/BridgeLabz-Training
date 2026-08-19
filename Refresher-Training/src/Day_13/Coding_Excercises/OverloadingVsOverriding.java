package Day_13.Coding_Excercises;

class Shape2 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Shape2D extends Shape2 {

    @Override
    void draw() {
        System.out.println("Drawing a 2D shape");
    }

    void draw(String color) {
        System.out.println("Drawing a 2D shape in " + color);
    }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        Shape2D s = new Shape2D();
        s.draw();
        s.draw("Red");

        Shape2 ref = new Shape2D();
        ref.draw(); // calls overridden version
    }
}
