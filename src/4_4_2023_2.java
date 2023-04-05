import java.util.Scanner;

class Test10{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of classes: ");
    int classes = scanner.nextInt();

    System.out.print("Enter number of absences: ");
    double absences = scanner.nextInt();

    if (absences > classes){
        System.out.println("Error in absences");
    }
    else {
    double percent = (absences/classes * 100);

        if (percent > 25){
            System.out.println("Student can not take the exam because he missed "+percent+"% of classes");
        }
        else{
            System.out.println("Student can take the exam because he only missed "+percent+"% of classes");
        }
    }
    
    scanner.close();

}

}