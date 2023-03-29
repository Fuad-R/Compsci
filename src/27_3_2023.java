import java.util.Scanner;

class Test{
    public static void main(String[]arg)
{
    System.out.println("Hello, enter 2 numbers to calculate the sum, product, difference, and quotient");
    Scanner scanner = new Scanner(System.in);
 
    System.out.print("Input first number:");
    double a = scanner.nextInt(); 
    
    System.out.print("Input second number:");
    double b = scanner.nextInt();

    System.out.println("sum="+(a+b));
    System.out.println("product="+(a*b));
    System.out.println("difference="+(a-b));
    System.out.println("quotient="+(a/b));

    scanner.close();
    }
    
    
}

