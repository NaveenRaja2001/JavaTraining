package four;

/**
 * 
 * class container the passbyvalue and passbyreference method
 */
public class passByValueAndReference {
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * @param num is passed and value is changed
	 */
	public void passByValue(int num) {
		num = 7;
		System.out.println("Printing the number before passing   " + num);
	}

	/**
	 * this method is used to prove the array is an example of passByReference
	 * 
	 * @param arr used to check the passby reference
	 * @return array is return after changing the elment in the selected array
	 *         position
	 */
	public int[] passByReference(int[] arr) {
		arr[2] = 122;
		return arr;
	}

	/**
	 * initialization of array and num is done and object of the
	 * passByValueAndReference is done methods are called
	 * 
	 * @param args unused
	 */

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
