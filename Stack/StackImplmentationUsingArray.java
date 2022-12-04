package Implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackArrayImpl impl = new StackArrayImpl(10);
		impl.pop();
		System.out.println("--------------");
		impl.push(210);
		impl.push(310);
		impl.push(50);
		impl.push(400);
		impl.push(410);
		impl.push(610);
		impl.push(70);
		impl.push(4);
		impl.push(1);
		impl.push(20);
		impl.push(21);
		System.out.println("------------------");
		impl.pop();
		impl.pop();
		impl.pop();
		System.out.println("------------------------");

	}

}

package Implementation;

public class StackArrayImpl {
	int size;
	int arr[];
	int topElement;

	// constructor having size as parameter
	StackArrayImpl(int size) 
	{
		this.size = size;
		this.arr = new int[size];
		this.topElement = -1;
	}
	// this method inserts an element on stack
	public void push(int element)
	{
		if (!isStackFull()) 
		{
			topElement++;
			arr[topElement] = element;
			System.out.println("Element Pushed on Stack is :" + element);
		} 
		else
		{
			System.out.println ("Cannot insert Stack is full...");
		}
	}
	// this method deletes an element from stack
	public int pop() {
		if (!isEmpty()) {
			int returnedtopElement = topElement;
			topElement--;
			System.out.println("Element Popped from Stack is :" + arr[returnedtopElement]);
			return arr[returnedtopElement];
		} else {
			System.out.println("Stack is empty...");
			return -1;
		}
	}
	// this method returns topmost element from stack
	public int peek() {
		if(!this.isEmpty())
			return arr[topElement];
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	// this method checks stack is empty
	public boolean isEmpty() {
		return (topElement == -1);
	}
	public boolean isStackFull() {
		return (size - 1 == topElement);
	}
}