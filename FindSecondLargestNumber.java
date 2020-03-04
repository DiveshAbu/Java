
public class FindSecondLargestNumber {

	public static void main(String[] args) {

		int[] arr = { 2, 8, 9, 4, 5, 3, 7,11,10 };
		System.out.println(GetsecondlargetNumber(arr));

	}

	public static int GetsecondlargetNumber(int[] arr) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		return arr[1];

	}

}
