package figure;

public class Rectangle extends Figure{
    public Rectangle(String figureName, double height, double weight) {
        this.figureName = figureName;
        this.area = height * weight;
        this.perimeter = 2 * (height + weight);
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
