package figure;

public class Circle extends Figure{
    public double p = 3.14;
    public int radius = 6;


    public Circle(String figureName) {
        super(figureName);
    }

    @Override
    void getRadius() {
        return;
    }

    @Override
    double getArea() {
        return Math.round((radius*radius) * p);
    }

    @Override
    double getPerimeter() {
        return 2 * radius * p;
    }
}
