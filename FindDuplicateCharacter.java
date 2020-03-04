import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {

	public static void main(String[] args) {

		String str = "talentscreen";
		GetDuplicateChar(str);
	}

	public static void GetDuplicateChar(String str) {
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {

			if (!map.containsKey(ch)) {

				map.put(ch, 1);
			} else {

				map.put(ch, map.get(ch) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + "=" + entry.getValue() + " times");
			}
		}

	}

}
