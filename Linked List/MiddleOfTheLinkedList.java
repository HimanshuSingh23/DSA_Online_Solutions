class Solution {
    public ListNode middleNode(ListNode head) {
        int size=0;
        int c=1;
        int finalRep=1;
        ListNode midList=head;
        if(head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size=size+1;
        }
        if(size%2!=0)
        {
             size=(size+1)/2;
             while(c<size)
             {
                 midList=midList.next;
                 c++;
             }
              return midList;
        }    
          else if(size%2==0)
          {
              size=size/2;
              size=size+1;
              while(c<size)
              {
                  midList=midList.next;
                  c++;
              }
              return midList;
          }
        return head;
        
    }
}