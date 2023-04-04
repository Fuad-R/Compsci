import java.util.Scanner;

class Test9{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = scanner.nextInt();

    System.out.print("Enter second number: ");
    int b = scanner.nextInt();

    System.out.print("Enter third number: ");
    int c = scanner.nextInt();

    if (a+b+c == 180) {
        System.out.println("The 3 numbers can be the angles of a triangle");

    }
    else if (a+b < c || a+c < b || b+c < a ) {
        System.out.println("The 3 numbers can be the sides of a triangle");

    }
    else {
        System.out.println("The 3 numbers cant be the sides or angles of a triangle");
    }

    scanner.close();
    }
}