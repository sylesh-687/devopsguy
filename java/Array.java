
class DVD{
  
  public String name;
  public int releaseYear;
  public String director;

  public DVD(String name, int releaseYear, String director){
    this.name=name;
    this.releaseYear=releaseYear;
    this.director=director;
  }

}
public class Array{
  public static void main(String [] args){
    DVD[] dvdCollection = new DVD[15];
    DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
    DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
    DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
    dvdCollection[0]=avengersDVD;
    dvdCollection[1]=findingDoryDVD;
    dvdCollection[2]=lionKingDVD;
    dvdCollection[3]=lionKingDVD;
    int[] sqrNum=new int[10];
    for ( int i=0; i<10;i++){
      sqrNum[i]=(1+i)*(1+i);
    }

    for (int sqr: sqrNum){
     System.out.println(sqr);
    }
  }
}
