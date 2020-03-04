import java.util.*;
public class duplicateC {

	public static void main(String[] args) {
		String name="TalentScreen";
		char[] ch=name.toLowerCase().toCharArray();
		int cnt=0;
		
		for(int i=0;i<name.length();i++) {
			
			for(int j=i+1;j<name.length();j++) {
				
				if(ch[i] == ch[j]) {         
					
					System.out.println(ch[i]+"........."+i);
					cnt++;
					break;
				}
			}
			
		}

	}

}
