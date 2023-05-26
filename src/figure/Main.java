package figure;

public class Main {
    public static void main(String[] args){
        figureArray();
    }
    public static void figureArray() {
        Figure[] figures = {
                new Rectangle("Rectangle", 3.5, 5.5),
                new Triangle("Triangle", 5, 5, 9),
                new Triangle("TriangleEqualsSizes", 6, 6, 6),
                new Circle("Circle", 6.0),
                new Circle("Circle2", 8.8),
                };
        for (int i=0; i<1; i++)
        {
            //System.out.println(figures[i].getFigureName() + " " + figures[i].getPerimeter());
            System.out.print("The sum perimeter of the all of figures: ");
            System.out.println(figures[0].getPerimeter() + figures[1].getPerimeter()+figures[2].getPerimeter()
                   +figures[3].getPerimeter()+figures[4].getPerimeter());
            //System.out.println(figures[i]);

        }
    }
}