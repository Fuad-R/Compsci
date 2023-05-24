public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getarea() {
        double area = 3.14*(radius*radius);
        return area;
    }
}
