
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		System.out.println(CheckArmstrongNumber(num));

	}
	public static boolean CheckArmstrongNumber(int num){
		
		int temp=num;
		int r,sum=0;
		
		while(num>0) {
			
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}

}
