import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class bankingapp{
    public static void main(String[]arg) throws IOException
{
    Scanner scanner = new Scanner(System.in);
   
    FileReader reader = new FileReader("src/logins.txt");
    BufferedReader bufferedReader = new BufferedReader(reader);
    FileWriter writer = new FileWriter("src/logins.txt", true);

    System.out.println("Welcome to the banking app");
    System.out.println("Would you like to login or register?");
    System.out.println();
    System.out.println("1 - Login");
    System.out.println("2 - Register");

    String loginOrRegister = scanner.next();

    String line;
 
        // for (int i = 0; i < 5; i++) {
        //     line = bufferedReader.readLine();
        //     System.out.println(line);
        // }

    switch(loginOrRegister){
        case "1":
            System.out.println("Please enter your username");
            String inputusername = scanner.next();
            System.out.println("Please enter your password");
            String inputpassword = scanner.next();

            for (int i = 1; i < 50; i=i+2) {
                line = bufferedReader.readLine();

                if (line.equals(inputusername)){

                    System.out.println("Username found");

                    for (int j=2; j<50; j=j+2){

                        line = bufferedReader.readLine();

                        if (line.equals(inputpassword)){
                            System.out.println("Login successful");
                        }
                        else{
                            System.out.println("Incorrect password");
                        }
                    }
                }
                else{
                    System.out.println("Username not found");
                }
            }
            break;
            
        case "2":

            String logincount = bufferedReader.readLine();
            int lc = Integer.parseInt(logincount);
            lc = lc+1;
            logincount = Integer.toString(lc);

            writer.write(System.getProperty("line.separator"));
            writer.write(logincount);

            System.out.println("Please enter your username");
            String username = scanner.next();
            System.out.println("Please enter your password");
            String password = scanner.next();

            writer.write(username);

            break;

    }
    

    scanner.close();
    reader.close();
    writer.close();
    bufferedReader.close();
    
    }
}

