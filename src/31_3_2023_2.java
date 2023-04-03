import java.util.Scanner;

class Test5{
    public static void main(String[]arg)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter 1st term: ");
    int A=scanner.nextInt();
    System.out.print("Enter 2nd term: ");
    int B=scanner.nextInt(); 

    if (A%B==0){
        System.out.println(A+" is divisible by "+B);
    }
    else 
    {
        System.out.println(A+" is not divisible by "+B);    
    }

    if (B%A==0){
        System.out.println(B+" is divisible by "+A);
    }
    else    
    {
        System.out.println(B+" is not divisible by "+A);
    }    

    scanner.close();}
}
