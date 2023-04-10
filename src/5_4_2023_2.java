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
        System.out.println("("+x+","+y+")"+" is in quadrant 1");
    }
    else if (x > 0 && y < 0) {
        System.out.println("("+x+","+y+")"+" is in quadrant 4");
    }
    else if (x < 0 && y < 0) {
        System.out.println("("+x+","+y+")"+" is in quadrant 3");
    }
    else {
        System.out.println("("+x+","+y+")"+" is in quadrant 2");
    }
    scanner.close();

}

}