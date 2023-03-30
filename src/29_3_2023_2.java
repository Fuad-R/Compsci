import java.util.Scanner;

class Test3{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of terms:");   
    double X=scanner.nextInt();
    int I=1;
    int Sum=0;
    int N=0;
    while (I<(X+1))
    {
        System.out.print("Enter "+(I)+" term");  
        N=scanner.nextInt();
        Sum = (Sum+N);
        I++;
    }
    System.out.println("Average="+(Sum/(X*1.0)));
    scanner.close();

    }
}