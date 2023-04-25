import java.util.Scanner;

class Test21{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number to find factorial: ");
    int a = scanner.nextInt();
    int i = a;
    int output = a;

/*
    while (i>1){

        a = a*(i-1);
        i--;

    }
*/

    for (i=a-1;i>1;i--){
        a = a*i;
    }

    System.out.println("Factorial of "+output+" is "+a+".");

    scanner.close();
}

}