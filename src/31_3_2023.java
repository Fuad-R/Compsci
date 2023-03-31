import java.util.Scanner;

class Test4{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of terms:");   
    int X=scanner.nextInt();
    int I=1;
    int max=0;
    int N=0;
    while (I<(X+1))
    {
        System.out.print("Enter "+(I)+" term");
        N=scanner.nextInt();
        if (N>max)
        {
            max=N;
        
        }
        I++;
    }

    System.out.println("Max="+max);
    scanner.close();
}

}