import java.util.Scanner;

class Test8{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter power use in KW: ");

    double use = scanner.nextInt();
    double price = 0;
    
    if (use <= 300){
        price = use * 8;
    }
    else if (use <= 500) {
        price = 300 * 8 + (use - 300) * 10;
    }
    else {
        price = 300 * 8 + 200 * 10 + (use - 500) * 12;
    }

    System.out.println("Total cost is "+price+" lek");
    }
}