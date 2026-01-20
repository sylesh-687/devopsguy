import java.util.Scanner;

public class PrimeNumber02{

    public static void main (String args []){

        Scanner sc=new Scanner(System.in);

        int numbers=sc.nextInt();

        for( int i=0;i<numbers;i++){
            int number=sc.nextInt();
            int count=0;

            for(int div=2;div*div<=number;div++){
                if(number%div==0){
                    count ++;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            }
            else System.out.println("No Prime");
        }
    }
}