public class square implements drawable{
    
    private double sidelength;

    public square(double sidelength){
        this.sidelength = sidelength; 
    }

    public double getarea() {
        return sidelength*sidelength;
    }

    public double getperimiter() {
        return sidelength*4;
    }

    public void draw() {
        System.out.println("Drawing a square with side length of "+ sidelength);
    }

}
