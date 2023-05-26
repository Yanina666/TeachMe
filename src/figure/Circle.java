package figure;

public class Circle extends Figure{
    public Circle(String figureName, double radius) {
        this.figureName= figureName;
        this.area = 3.14 * (radius*radius);
        this.perimeter = 2 * radius * 3.14;
    }

    @Override
    double getArea() {
        return this.area;
    }

    @Override
    double getPerimeter() {
        return this.perimeter;
    }

}
