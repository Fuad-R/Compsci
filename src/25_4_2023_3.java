import java.util.Scanner;

class Test22{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of rows for the triangle: ");
    int rows = scanner.nextInt();

    for (int c = 0 ; c<rows ; c++){
        
        for (int i = 0 ; i < (c+1) ; i++){
        System.out.print("*");
        }

        System.out.println();
    }


    scanner.close();
}
}