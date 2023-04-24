import java.util.Scanner;

class Test19{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    int i=0;
    int sum=0;
    System.out.print("Enter first n digits: ");
    int n = scanner.nextInt();
/* 
    while (i<=n){
        System.out.print(i+" ");
        sum = sum + i;
        i= i+2;  

    }
 */

 do{
    System.out.print(i+" ");
    sum = sum + i;
    i= i+2;
 } while (i<=n);

    System.out.println("Sum of all even digits until n digits is: "+sum);
    scanner.close();
    }
}
