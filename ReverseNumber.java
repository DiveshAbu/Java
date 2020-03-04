
public class ReverseNumber {

	public static void main(String[] args) {
		int x=123;
		getNumber(x);
	}
	public static void getNumber(int x) {
		
		System.out.print(x%10);
		if((x/10) != 0 ) {
		
			getNumber(x/10);
		
		}
		System.out.print(x%10);
	}

}
