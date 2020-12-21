package Shape;

public class Circle extends Shape{
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getArea(){
        return radius*radius*Math.PI;
    }
    public Double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "Area="+getArea()+
                "Perimeter="+getPerimeter()+
                '}';
    }
}

