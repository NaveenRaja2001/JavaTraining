package seven;

import java.util.ArrayList;

//interface for Stack 
interface Stack {
	public int pop();

	public void push(int num);

}

//FixedStack class
class FixedStack implements Stack {
	int arr[] = new int[4];
	int top = -1;

	@Override
	public int pop() {
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

	@Override
	public void push(int num) {
		// TODO Auto-generated method stub
		if (top >= arr.length - 1) {
			System.out.println("Stack Overflow");
		} else {
			arr[++top] = num;
		}
	}
}

//DynamicStack class
class DynamicStack implements Stack {
	int size = 0;
	ArrayList<Integer> a1 = new ArrayList<Integer>();

	@Override
	public int pop() {
		if (a1.isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int temp = a1.get(a1.size() - 1);
			a1.remove(a1.size() - 1);
			System.out.println(a1);
			return temp;
		}
	}

	@Override
	public void push(int num) {
		// TODO Auto-generated method stub
		a1.add(num);
		System.out.println(a1);
	}
}

public class PushPop {
	public static void main(String[] args) {
		FixedStack obj = new FixedStack();
//	pushing in fixedStack
		obj.push(4);
		obj.push(7);
		obj.push(44);
		obj.push(41);
		obj.push(44);
		obj.push(44);
//pop in fixed stack
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());

		DynamicStack obj2 = new DynamicStack();
//		push in DynamicStack 
		obj2.push(99);
		obj2.push(89);
		obj2.push(969);
		obj2.push(44);
		obj2.push(1223);
//		pop in DynamicStack 
		obj2.pop();

	}
}
