package figure;

public class Rectangle extends Figure{
    public double height = 3.5;
    public double weight = 7.5;
    public Rectangle(String figureName) {
        super(figureName);
    }

    @Override
    void getRadius() {
        return;
    }

    @Override
    double getArea() {
        return height * weight;
    }

    @Override
    double getPerimeter() {
        return 2 * (height + weight);
    }
}
