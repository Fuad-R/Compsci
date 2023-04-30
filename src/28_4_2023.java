import java.util.Scanner;
import java.text.DecimalFormat;

class Test25{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Enter number of students: ");
    int x = scanner.nextInt();
    double sum = 0;
    int max=0;

    System.out.println();

    String[] student = new String[x];
    int[] grade = new int[x];
    String[] gradeString = new String[x];
    String[] passfail = new String[x];

    for (int i = 0 ; i < x ; i++){
        System.out.print("Enter name of student number "+(i+1)+":");
        student[i] = scanner.next();

        System.out.print("Enter grade (0-100) for student number "+(i+1)+":");
        grade[i] = scanner.nextInt();

    System.out.println();
    }
    // System.out.println("Student & Grade");
    for(int i = 0; i < x ; i++ ){
        // System.out.println(student[i]+" got "+grade[i]);
        sum = sum + grade[i];

        if(grade[i] > max){
            max = grade[i];
        }
        gradeString[i] = String.valueOf(grade[i]);

        if(grade[i]<50){
            passfail[i] = "\u001B[31m Fail \u001B[37m";
        } else{
            passfail[i] = "\u001B[32m Pass \u001B[37m";
        }
       
    }
        
    // System.out.println("The class average is "+(sum/x)+" and the maximum grade is "+max);
 
    // System.out.println();
// 
// final Object[][] table = new String[x][];
//     for(int i=0 ; i < x ; i++){
        
//         table[i] = new String[] { student[i], gradeString[i], passfail[i]};
//     }

// for (final Object[] row : table) {
//     System.out.format("%2s%7s%7s%n", row);
// }
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    
    String l = "--------------------------------%n";


System.out.printf(l);
    System.out.printf("|         Class Results        |%n");
    System.out.printf(l);
    System.out.printf("| %-13s | %-12s |%n", "   Average", "   Highest");
    System.out.printf("| %-3s %-9s | %-4s %-7s |%n","", df.format((sum/x)),"", max);
    System.out.printf(l);


    System.out.printf("|       Student results        |%n");
    System.out.printf(l);
    

    for(int n = 0; n < x ; n++ ){
        System.out.printf("| %-10s | %-1s %-4s | %-7s |%n", student[n],"", gradeString[n], passfail[n]);
    }
    System.out.printf(l);
    
    scanner.close();
    

}

}