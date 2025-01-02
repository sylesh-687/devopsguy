public class NumberswithEvenDigit {
  public static void main(String [] args){
    Solution sol=new Solution();
    int [] nums={12,345,2,6,7896};
    System.out.println(sol.findNumbers(nums));
  }
}

class Solution{
  
  int Digits(int num){
    int digit=0;
    while(num>0){
      digit++;
      num=num/10;
    }
   return digit;
  }

  int findNumbers(int [] nums){
    int number=0;
    int digit=0;
    for( int i=0;i< nums.length;i++){
       digit=Digits(nums[i]);
       if (digit % 2==0){
          number++;
       }
    }
    return number;
  }
}
