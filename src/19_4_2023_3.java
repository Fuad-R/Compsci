import java.util.Scanner;

class Test16{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = scanner.nextInt();

    System.out.print("Enter second number: ");
    double b = scanner.nextInt();

    System.out.print("Enter operation, 1 for addition, 2 for subtraction, 3 for division, 4 for multiplication: ");
    int action = scanner.nextInt();

    switch (action) {
        case 1:
            System.out.println(a+b);
            break;
        case 2:
            System.out.println(a-b);
            break;
        case 3:
            System.out.println(a/b);
            break;
        case 4:
            System.out.println(a*b);
            break;
    
        default:
            System.out.println("Invalid operation");
            break;
    }
    scanner.close();
}
}