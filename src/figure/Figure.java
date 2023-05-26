package figure;

import java.util.Objects;

public abstract class Figure {
    protected String figureName;
    protected double area;
    protected double perimeter;

    abstract double getArea();

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    abstract double getPerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Double.compare(figure.area, area) == 0 && Double.compare(figure.perimeter, perimeter) == 0 && Objects.equals(figureName, figure.figureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(figureName, area, perimeter);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "figureName='" + figureName + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}
