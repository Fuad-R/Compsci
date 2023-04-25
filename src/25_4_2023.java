import java.util.Scanner;

class Test20{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int n = scanner.nextInt();
    int a = n;
    n = n-1;
    int i = n;
    int c = 0;

    do{
        
    while (n%2==0){
        n=n/2;
    }
    if(n==1){
        System.out.println(i+" is the largest power of 2 that is less than "+a+".");
        c = 1;
    }
    else{
        n = i-1;
        i--;
        c = 0;
        }
    
    } while (c==0);

    scanner.close();
    }
}