import java.util.Scanner;

class Test24{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of terms: ");
    int n = scanner.nextInt();
    int sum = 0;

    for (int i = 0 ; i <n ; i++){
        System.out.print("Enter "+(i+1)+" term: ");
        int a = scanner.nextInt();
        sum = sum + a;
    }
    System.out.print("The sum of the "+n+" terms is "+sum+".");

    scanner.close();
    }
}