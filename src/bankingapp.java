import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class Bankingapp{
    public static void main(String[]arg) throws IOException
{
    Scanner scanner = new Scanner(System.in);
    String logins = "src/logins.txt";
    Boolean loggedin = false;

    File file2 = new File("src/balances.txt");
    File file = new File(logins);
    FileReader reader = new FileReader(logins);
    BufferedReader bufferedReader = new BufferedReader(reader);
    FileWriter writer = new FileWriter(logins, true);
    Scanner fileScanner = new Scanner(file);

    Scanner balscanner = new Scanner(file2); 
    FileWriter balwriter = new FileWriter("balances.txt");

    System.out.println("Welcome to the banking app");
    System.out.println("Would you like to login or register?");
    System.out.println();
    System.out.println("1 - Login");
    System.out.println("2 - Register");

    int loginOrRegister = scanner.nextInt();
    
    while (loggedin == false){

    switch(loginOrRegister){
        case 1:
            
        System.out.print("Enter username: ");
        String inputusername = scanner.next();

        System.out.println();

        System.out.print("Enter password: ");
        String inputpassword = scanner.next();
        try {
            boolean accessGranted = false;
            while (fileScanner.hasNextLine()) {
                String storedUsername = fileScanner.nextLine();
                String storedPassword = fileScanner.nextLine();
                if (inputusername.equals(storedUsername) && inputpassword.equals(storedPassword)) {
                    accessGranted = true;
                    break;
                }
            }
            if (accessGranted) {
                System.out.println("Access granted.");
                loggedin = true;
            } else {
                System.out.println("Access denied.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred, please try again.");
            }
            break;

        case 2:

        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.println();

        System.out.print("Enter password: ");
        String password = scanner.next();

        try {

        writer.write(username + "\n" + password + "\n");
        writer.close();

        System.out.println("Credentials saved to file.");
        loggedin = true;

        } catch (IOException e) {

        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        
            break;

        default:
        System.out.println("Invalid action");

    }
    }

    //! VVV Balance tracking VVV

    Map<String, Double> accounts = new HashMap<>();
        try {
            while (balscanner.hasNextLine()) {
                String line = balscanner.nextLine();
                String[] parts = line.split(",");
                String username = parts[0];
                double balance = Double.parseDouble(parts[1]);
                accounts.put(username, balance);
            }
        } catch (Exception e) {
            System.out.println("An error occurred, please try again.");
            }
        // catch (FileNotFoundException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }

        // Update account balances
        
    //accounts.put("NAME", VALUE);

        try {
            for (Map.Entry<String, Double> entry : accounts.entrySet()) {
                balwriter.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred updating your balance.");
            e.printStackTrace();
        }


    scanner.close();
    reader.close();
    writer.close();
    bufferedReader.close();
    fileScanner.close();
    balscanner.close();
    balwriter.close();

    }
    
}