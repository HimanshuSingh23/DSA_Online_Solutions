package EVENODD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd list=new EvenOdd();
		list.insertFirst(4);
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(1);
		list.display();
		list.displaySize();
		list.insertLast(5);
		list.display();
		list.displaySize();

	}

}

package EVENODD;

public class EvenOdd
{
	private Node head;
	private int size;
	
	EvenOdd()
	{
		this.size=0;
	}
	
	//insertAtFirst
	public void insertFirst(int value) 
	{
	  Node node=new Node(value);
	  node.next=head;
	  head=node;
	  size=size+1;
	}
	
	//insertAtLast
    public void insertLast(int value)	
    {
    	Node temp=head;
    	while(temp.next!=null)
    	{
    		temp=temp.next;
    	}
    	Node node=new Node(value);
    	temp.next=node;
    	node.next=null;
    	size=size+1;
    }
	
	//displayTheLinkedList
    public void display()
    {
    	Node temp=head;
    	while(temp!=null)
    	{
    		System.out.print(temp.value+"->");
    		temp=temp.next;
    	}
    	System.out.println("END");
    	System.out.println("The size of the linked list is"+size);
    }
    
    //Display the size is even or odd
    public void displaySize()
    {
    	if(size%2==0)
    	{
    		System.out.println("The size is even");
    	}
    	else
    	{
    		System.out.println("The size is odd");
    	}
    }
	
	
	
	
	
	
	
	
	
	
	
	class Node
	{
		private int value;
		private Node next;
		
		Node(int value)
		{
			this.value=value;
		}
		
		Node(int value, Node  next)
		{
			this.value=value;
			this.next=next;
		}
	}

}