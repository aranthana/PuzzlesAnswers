import java.util.Scanner;

public class ConsecutiveSum {
	static int consecutiveCount = 0;
	
	static int consecutive(long num) {
		long triangleNum=0;
		long size=0;
		if(num % 2 != 0){								// if num is a odd number
	        size = num / 2 + 1;
	    }
	    else{											// if num is a even number
	        size = num / 2;
	    }
		
		for(int i=1; i<size;i++){
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
		
		//System.out.println("Enter here :"); 
		long num=user_input.nextInt();                              // get number 
		
		ConsecutiveSum.consecutive(num);
	}
}
