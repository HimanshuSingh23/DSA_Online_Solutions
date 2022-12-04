package NGE;
import java.util.Stack;
public class Main {
	public static int[] nextGreaterElement(int[] array)
	{
		Stack<Integer> st=new Stack <>();
		int n=array.length;
		int NGE[]=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			while(st.isEmpty()==false && st.peek()<=array[i])
			{
				st.pop();
			}
			st.push(array[i]);
		}
		for(int j=n-1;j>=0;j--)
		{
			while(st.isEmpty()==false && st.peek()<=array[j])
			{
			  st.pop();	
			}
			if(st.isEmpty()==true)
			{
				NGE[j]=-1;
			}
			else 
			{
			    NGE[j]=st.peek();	
			}
			st.push(array[j]);
		}
		return NGE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array1[]= {1,2,3,4,5,6};
        int array2[]=nextGreaterElement(array1);
        for(int i=0;i<array2.length;i++)
        {
        	System.out.print(array2[i]+" ");
        }
		
		
		
	}

}