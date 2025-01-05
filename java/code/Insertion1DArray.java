class Insertion1DArray{
   
   int [] a = new int[100];
   int size;

   void create(int size){
      
      if(size>100){
          System.out.println("Could not Intialize");
          return 0;
      }
      this.size=size;
      Scanner in = new Scanner(System.in);
      for (  int i=0;i<size;i++){
          System.out.println("Enter the"+(i+1)+"th Element");
          a[i]=nextInt();
      }
      System.out.println("Capacity "+a.length+" Length "+size);
   }
   void insert(int loc){
    
     if(size==a.length){
         System.out.println("Insertion Fails, Array overflows");
         return 0;
     }
       
     if((loc<0) || (loc>size)){
         System.out.println("Insertion Fails, Array overflows");
         return 0;
     }
        Scanner in = new Scanner(System.in);
        int item=in.nextInt();

        for ( int i=size;i<loc;i--){
            a[i+1]=a[i];
       }
            a[loc]=item;
   }
}
