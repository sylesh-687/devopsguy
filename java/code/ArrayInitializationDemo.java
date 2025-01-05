import java.util.Scanner;
class ArrayInitializationDemo{
   
  static int[] a = new int [100]; 
  static int size;
  
  static void loadArray(){
   
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the size < 100");
     size=in.nextInt();
     for ( int i =0; i< size; i++){
         System.out.println("Enter the"+(i+1)+"th number");
         a[i]=in.nextInt();
     }
   System.out.println("Length of array"+a.length);
   System.out.println(a);
  }
  public static void main(String[] args){
    loadArray();
  }
}
