class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ops.length;i++)
        {
            int record=0;
            if(ops[i].equals("D"))
            {
                record=2 * st.peek();
                st.push(record);
            }
            else if(ops[i].equals("C"))
            {
                st.pop();
            }
            else if(ops[i].equals("+"))
            {
                int backPush=st.peek();
                record=record+st.peek();
                st.pop();
                record=record+st.peek();
                st.push(backPush);
                st.push(record);
            }
            else
            {
              st.push(Integer.valueOf(ops[i]));
            }
        }
        int result=0;
        while(!st.empty())
        {
            result=result+st.pop();
        }
        return result;
    }
}