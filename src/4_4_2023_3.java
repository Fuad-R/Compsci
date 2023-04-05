import java.util.Scanner;

class Test11{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of products bought: ");

    int product = scanner.nextInt();
    double discount = 0;
    double cost = 0;

    if (product < 50){

    cost = product * 100;

    }
    else if ((product - 50) < 10) {
    cost = product * 100 * 0.9;
    }
    else if ((product - 50) < 20) {
    cost = product * 100 * 0.89;
    }
    else if ((product - 50) < 30) {
    cost = product * 100 * 0.88;
    }
    else if ((product - 50) < 40) {
    cost = product * 100 * 0.87;
    }
    else if ((product - 50) < 50) {
    cost = product * 100 * 0.86;
    }
    else {
    cost = product * 100 * 0.85;
    }

    System.out.println("Total cost is: "+cost);

    scanner.close();
}

}

