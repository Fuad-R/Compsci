import java.util.Scanner;

class Test6{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");    
    int x = scanner.nextInt();

    System.out.print("Enter second integer: ");    
    int y = scanner.nextInt();    

    System.out.print("Enter third integer: ");    
    int z = scanner.nextInt();

    int max=0;

    if (x >= y && y >= z){

        max = x;
    }
    else if (y >= x && y >= z) {

        max = y;

    }
    else {
        max = z;

    }

    System.out.println("Maximum is "+max);

    scanner.close();

    }

}