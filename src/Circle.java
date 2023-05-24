
public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getarea() {
        return 3.14*(radius*radius);
    }
    public double getperimiter() {
        return 2*3.14*radius;
    }

}
