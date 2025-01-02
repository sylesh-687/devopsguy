class MaxconsecutiveOnes {
    public static void main(String [] args){
    
    int nums[]={1,1,0,0,1,1,1,0,1,0,1,1,1,1};
    System.out.println(findMaxConsecutiveOnes(nums));
        
    }
    public static int max(int x, int y){
        if (x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int max_c=0;
        
        for (int i=0; i<nums.length;i++){
            if (nums[i]==1){
                count++;
                max_c=max(count,max_c);
            }
            else{
                count=0;
            }
        }
        return max_c;
    }
}
