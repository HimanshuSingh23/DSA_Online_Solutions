class ReverInGroups {
    static void reverse(int arr[], int n, int k)
    {
        for (int i = 0; i < n; i += k)
        {
            int left = i;
     
            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;
             
            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
    }