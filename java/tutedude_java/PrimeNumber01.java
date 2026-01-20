import java.util.Scanner;
public class PrimeNumber01{

    public static void main ( String args []){

        Scanner scn = new Scanner(System.in);

        int numbers=scn.nextInt();

        for ( int i=0;i<numbers;i++){
            int number=scn.nextInt();
            int count=0;

            for( int divisor=1;divisor<=number;divisor++){
                if(number%divisor==0){
                    count++;
                }
            }
            if(count ==2 ){
                System.out.println("Prime");
            }
            else System.out.println("No Prime");
        }
    }
}