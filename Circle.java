package calculate;

public class Circle implements shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}