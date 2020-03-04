
public class PalinDromeString {

	public static void main(String[] args) {
      String str="cat"; 
      System.out.println(CheckPalindrome(str));
 
	}
	public static String CheckPalindrome(String str) {
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			
			return "planimdrome";
		}
		else {
			
			return "not";
		}
		
		
		
	}

}
