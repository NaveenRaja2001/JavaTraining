package four;

public class passByValueAndReference {
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
//passByValue 
	public void passByValue(int num) {
		num = 7;
		System.out.println("Printing the number before passing   " + num);

	}
//passByReference
	public int[] passByReference(int[] arr) {
		arr[2] = 122;
		return arr;
	}

	public static void main(String[] args) {

		int num = 5;
		int arr[] = { 1, 2, 3, 3, 45, 6 };
		passByValueAndReference obj = new passByValueAndReference();
		System.out.print("Print the array before passing:  ");
		obj.print(arr);

		arr = obj.passByReference(arr);
		System.out.print("Print the array after passing:  ");
		obj.print(arr);


		obj.passByValue(num);
		System.out.println(num);

	}

}
