import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		String str="talentscreen";
		removeDuplicate(str);
	}
	public static void removeDuplicate(String str) {
		
		Set<Character>set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(!set.contains(ch)) {//if 's' is not present in Hashset
				
				set.add(ch);//add 's' to the hashset
				sf.append(ch);
				
			}
		}
		System.out.println(sf.toString());
		
	}

}
