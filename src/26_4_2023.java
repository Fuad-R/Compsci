import java.util.Scanner;

class Test23{
    public static void main(String[]arg)
{
    int c = 15;
    System.out.print(" ");

        for (int b = 0 ; b<15 ; b++){
        
            for (;c>0 ; c--){

                System.out.print(" ");
        
            }
            for (int i = 0 ; i < (b+1) ; i++){
            System.out.print("**");
            }

            System.out.println();
            c = (15-b);
        }

    }

}
