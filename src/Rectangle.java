public class Rectangle extends Shape {
 
    
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.width = height;
    }
    public double getarea() {
        return height*width;
    }
    public double getperimiter() {
        return 2*(height+width);
    }
}
