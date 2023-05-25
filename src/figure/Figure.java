package figure;

public abstract class Figure {
    private String figureName;



    public Figure(String figureName) {
        this.figureName = figureName;

        this.getRadius();
    }

    abstract void getRadius();

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }
    abstract double getArea();

    abstract double getPerimeter();




    void getInfo()
    {
        System.out.println("There is a: " + this.figureName);
        System.out.println("area is: " + getArea());
        System.out.println("perimeter is: " + getPerimeter());


    }
}