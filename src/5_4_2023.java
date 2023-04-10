import java.util.Scanner;

class Test12{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = scanner.nextInt();

    if (year % 4 == 0) {
    System.out.println(year+ " is a leap year");

    }
    else {
    System.out.println(year+ " is not a leap year");
    }   
    scanner.close();
    }
}