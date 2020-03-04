import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter any String");
		String str = sc.nextLine();
		System.out.println(getReverseString(str));

	}

	public static String getReverseString(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		return rev;

	}

}
