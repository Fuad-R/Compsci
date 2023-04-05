import java.util.Scanner;

class Test13{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter X coordinate: ");
    int x = scanner.nextInt();

    System.out.print("Enter Y coordinate: ");
    int y = scanner.nextInt();

    if (x > 0 && y > 0) {
        System.out.println("It is in Quadrant 1");
    }
    else if (x > 0 && y < 0) {
        System.out.println("It is in Quadrant 4");
    }
    else if (x < 0 && y < 0) {
        System.out.println("It is in Quadrant 3");
    }
    else {
        System.out.println("It is in Quadrant 2");
    }
    scanner.close();

}

}