import java.util.Scanner;

public class Reverse01{

    public static void main(String args []){

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number");

        int number=sc.nextInt();

        while(number > 0){

            int dig=number%10;
            number=number/10;
            System.out.print(dig);
        }
    }
}