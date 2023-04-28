import java.util.Scanner;

class Test25{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int x = scanner.nextInt();
    double sum = 0;
    int max=0;

    System.out.println();

    String[] student = new String[x];
    int[] grade = new int[x];

    for (int i = 0 ; i < x ; i++){
        System.out.print("Enter name of student number "+(i+1)+":");
        student[i] = scanner.next();

        System.out.print("Enter grade for student number "+(i+1)+":");
        grade[i] = scanner.nextInt();

    System.out.println();
    }
    System.out.println("Student      Grade");
    for(int i = 0; i < x ; i++ ){
        System.out.println(student[i]+"            "+grade[i]);
        sum = sum + grade[i];

        if(grade[i] > max){
            max = grade[i];
        }
    }
    System.out.println("The class average is "+(sum/x)+" and the maximum grade is "+max);

    scanner.close();
}

}