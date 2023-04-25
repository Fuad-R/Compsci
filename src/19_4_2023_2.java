import java.util.Scanner;

class Test15{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter animal name: ");
    String animal = scanner.nextLine();

    switch (animal) {
        case "dog":
        case "cat":
        case "bird":
            System.out.println(animal+"is a pet");
            break;
        case "snake":
        case "crocodile":
        case "tiger":
            System.out.println(animal+"is a wild animal");
            break;

        default:
            System.out.println("Unknown animal");
            break;
    }
    scanner.close();
}
}


