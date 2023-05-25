package figure;

public class Triangle extends Figure{
    public double a = 3;
    public double b = 3;
    public double c = 5.5;

    public double per = a + b + c;

    public Triangle(String figureName) {
        super(figureName);
    }

    @Override
    void getRadius() {
        return;
    }

    @Override
    double getArea() {
        return (a + b + c)/2;
    }

    @Override
    double getPerimeter() {
        return per;

    }
}
