import java.util.Scanner;

public class LargestSubset {

	static long[] maxSubsetSum(int[] k) {
		long [] sumOfSubsets =new long [k.length];			// array of sum of subset
		
		for(int i=0;i<k.length;i++){
			long sumOfSubset=0;								// sum of subset
			for(int j=1;j<=k[i];j++){
				if(k[i]%j==0){								// if j is a multiplier of k[i]
					sumOfSubset+=j;	
				}
			}
			System.out.println(sumOfSubset);
			sumOfSubsets[i]=sumOfSubset;
		}
		return sumOfSubsets;
    }
	public static void main(String[] args) {
		Scanner user_input = new Scanner( System.in );
		
		System.out.println("Enter here :"); 
		int k=user_input.nextInt();						// size of number array
	
		int numbers[] = new int[k];						// integer array for numbers
		for(int i=0;i<k;i++){
			numbers[i]=user_input.nextInt();
		}
		
		LargestSubset.maxSubsetSum(numbers);
	}

}
