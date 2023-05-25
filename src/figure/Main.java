package figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle("Rectangle"),
                new Triangle("Triangle"),
                new Triangle("TriangleEqualsSizes"),
                new Circle("Circle"),
                new Circle("Circle2"),
        };

        for (Figure figure : figures)
        {
            figure.getInfo();
            System.out.println();
            figure.getArea();
            figure.getPerimeter();
        }
    }
}