import java.util.Scanner;

class Test2{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);
    double pi = 3.14;
    System.out.println("Enter radius");
    int r=scanner.nextInt();
    double a=pi*r*r;
    double c=2*pi*r;
    System.out.println("Area="+a);
    System.out.println("Circumference="+c);

    scanner.close();
    }
}