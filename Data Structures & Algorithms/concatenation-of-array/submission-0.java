class Solution {
    public int[] getConcatenation(int[] nums) {
        int y=nums.length;
        int [] x=new int[y*2];
        for (int i=0;i<nums.length;i++){
            x[i]=nums[i];
            x[y+i]=nums[i];
        }
        return x;
    }
}