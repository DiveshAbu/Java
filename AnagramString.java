import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "Listen";
		String s2 = "silent";
		System.out.println(CheckAnagram(s1, s2));
	}

	public static boolean CheckAnagram(String s1, String s2) {

		// remove all whitespace
		s1 = s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");

		// check both length

		if (s1.length() != s2.length()) {

			return false;
		}
		else {

			// convert all string in lowercase and into CharArra6y

			char[] arr1 = s1.toLowerCase().toCharArray();// 'l'i's't'e'n'
			char[] arr2 = s2.toLowerCase().toCharArray();// 's'i'l'e'n't'

			// sort both character Array

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {

				return true;
			}

		}
		return false;

	}

}
