class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] final1=new int[2];
        int index=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
         if(map.containsKey(target-nums[i]))
            {
              final1[0]=map.get(target-nums[i]);
              final1[1]=i;
              return final1;
            }
            else
            {
                map.put(nums[i],index++);
            }
         }
        return final1;
            
    }
}