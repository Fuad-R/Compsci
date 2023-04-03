import java.util.Scanner;

class Test7{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter student grade:");
    int grade = scanner.nextInt();

    if (grade <0 || grade > 10){
        System.out.println("Invalid grade");

    }
    else if (grade <= 4) {
        System.out.println("The student has failed");

    }
    else if (grade <= 6) {
        System.out.println("The student has passed");

    }
    else if (grade <= 8) {
        System.out.println("The student did good");

    }
    else {
        System.out.println("The student did excelent");
    }
    scanner.close();
    }
}
