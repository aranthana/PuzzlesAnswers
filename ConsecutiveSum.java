import java.util.Scanner;

public class ConsecutiveSum {
	static int consecutiveCount = 0;
	
	static int consecutive(long num) {
		int triangleNum=0;
		
		for(int i=1; i<num/2;i++){
			triangleNum=i*(i+1)/2;								// find i th triangle number
			if(triangleNum<num){
				if((num-triangleNum)%(i+1)==0){					
					consecutiveCount++;
				}
			}
		}
		System.out.println(consecutiveCount);
		return consecutiveCount;
    }
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner( System.in );
		
		System.out.println("Enter here :"); 
		long num=user_input.nextInt();                              // get number 
		
		ConsecutiveSum.consecutive(num);
	}
}
