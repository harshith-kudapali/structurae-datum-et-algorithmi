package BuildArrayFromPermutatio;

public class Solution {
    public int[] buildArray(int[] nums){
        int[] ans=new int[20]; 
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;

    }
    public static void main (String[] args){

    }
    
}
