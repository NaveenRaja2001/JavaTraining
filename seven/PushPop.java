package seven;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 *interface contain push and pop method
 */
interface Stack {
	public Object pop();

	public void push(int num);

}

/**
 * Class contain push and pop method for a Stack with fixed size
 */
class FixedStack implements Stack {
	int arr[] = new int[4];
	int top = -1;

	/**
	 * function remove the last added element from the array and return the element
	 * 
	 * @param nothing passed
	 * @return popped Element (type:object)
	 */
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (top <= -1) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int temp = arr[top];
			top = top - 1;
			return temp;
		}
	}

	/**
	 * function add a new element to the top of the stack
	 * 
	 * @param num parameter used to pushed into stack
	 * @return nothing
	 */
	@Override
	public void push(int num) {
		// TODO Auto-generated method stub
		if (top >= arr.length - 1) {
			System.out.println("Stack Overflow");
		} else {
			arr[++top] = num;
		}
		System.out.println(Arrays.toString(arr));

	}
}

/**
 * class contain the push and pop method for the stack with dynamic size
 */
class DynamicStack implements Stack {
	int size = 0;
	ArrayList<Integer> array = new ArrayList<Integer>();

	/**
	 * function remove the last added element from the array and return the element
	 * 
	 * @param nothing passed
	 * @return popped element (type:Object)
	 */
	@Override
	public Object pop() {
		if (array.isEmpty()) {
			System.out.println("Stack is empty");
			return "Stack is empty";
		} else {
			int temp = array.get(array.size() - 1);
			array.remove(array.size() - 1);
			System.out.println(array);
			return temp;
		}
	}

	/**
	 * function add a new element to the top of the stack
	 * 
	 * @param num parameter used to pushed into stack
	 * @return nothing
	 */
	@Override
	public void push(int num) {
		// TODO Auto-generated method stub
		array.add(num);
		System.out.println(array);
	}
}

/**
 * class create the object for the fixedstack and dynamic stack and use to do
 * the respective function(push and pop)
 * 
 * @param args unused
 */

public class PushPop {
	public static void main(String[] args) {
		FixedStack obj = new FixedStack();
//pushing in fixedStack
		obj.push(4);
		obj.push(7);
		obj.push(44);
		obj.push(41);

//pop in fixed stack
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());

		DynamicStack obj2 = new DynamicStack();
//push in DynamicStack 
		obj2.push(99);
		obj2.push(89);
		obj2.push(969);
		obj2.push(44);
		obj2.push(1223);
//pop in DynamicStack 
		System.out.println(obj.pop());
		obj2.pop();

	}
}
