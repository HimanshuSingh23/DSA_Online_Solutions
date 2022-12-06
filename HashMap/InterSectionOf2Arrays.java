//Using map hashmap for storing values of nums1 and retreiving them in O(1)
//Using mapDummy to store only unique values of intersection between the 2 arrays
//Using resultMock to store the value of the hashmap mapDummy
//Using result to store the value of resultMock as resultMock will have null values at the end and we cannot return those values
//Returning the result array



class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> mapDummy=new HashMap<Integer,Integer>();
        int index=0;
        int indexDummy=0;
        int resultSize=0;
        int[] resultMock=new int[nums1.length];
        int resultMockIndex=0;
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],index++);//Storing uniques values in map
        }
        for(int i=0;i<nums2.length;i++)
        {
            if (map.containsKey(nums2[i]))
            {
               if(!mapDummy.containsKey(nums2[i]))//check if the above value is not in mapDummy
               {
                  mapDummy.put(nums2[i],indexDummy++);
                  resultSize++;
                  resultMock[resultMockIndex++]=nums2[i];
               }
            }
        }
        int[] result=new int[resultSize];
        for(int i=0;i<resultSize;i++)
        {
            result[i]=resultMock[i];
        }
        return result;
      
        
    }
}