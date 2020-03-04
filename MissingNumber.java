
public class MissingNumber {

	public static void main(String[] args) {

       int[] num= {1,2,4,5};
       System.out.println(getMissingNumber(num));

	}
	public static int getMissingNumber(int[]num){
		
		int sum=0;
		int totalnumber=0;
		
		for(int i=0;i<num.length;i++) {
			
			sum=sum+num[i];
			
		}
		for(int j=1;j<=5;j++) {
			
			totalnumber=totalnumber+j;
		}
		return totalnumber-sum;
	}

}
