//LargestSubArray with 0 sum
//Using Hashing 


public static int solution(int[] arr)
{
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    int sum=0;
    int i=-1;
    int mLen=0;
    map.put(sum,i)
    while(i<arr.length -1)
    {
      i++;
      sum+=arr[i];
      if(map.containsKey(sum)==false)
      {
        map.put(sum,i);
      }
      else
      {
        int len=i-map.getKey(sum);
        if(len>mLen)
        {
          mLen=len;
        }
      }
    }
    return mLen;
}