public class Rectangle extends Shape {
 
    
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.width = height;
    }
    public double getarea() {
        double area = height*width;
        return area;
    }
}
