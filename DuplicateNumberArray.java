import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberArray {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 2, 6, 4, 12, 15, 18, 8 };
		GetDuplicate(arr);

	}

	public static void GetDuplicate(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {

			if (!map.containsKey(num)) {

				map.put(num, 1);
			} else {

				map.put(num, map.get(num) + 1);
			}
		}
		for (int num : map.keySet()) {

			if (map.get(num) > 1) {

				System.out.println(num);
			}
		}

	}

}
