import java.util.Scanner;

public class PsychometricTesting {
	
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int results []=new int [lowerLimits.length];		// array of results
		
		for(int i=0;i< lowerLimits.length;i++){
			int r=0;										// r for get count of scored people
			for(int j=0;j<scores.length;j++){
				if(scores[j]>=lowerLimits[i] && scores[j]<=upperLimits[i]){
					r++;
				}
			}
			results[i]=r;
			System.out.println(results[i]);
		}
		return results;
	}
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner( System.in );
		
		//System.out.println("Enter here :"); 
		int n=user_input.nextInt();					// size of scores array
		int scores[] = new int[n];					// scores array
		for(int i=0;i<n;i++){
			scores[i]=user_input.nextInt();
		}
		int l=user_input.nextInt();					// size of lower limit array
		int []  lowerLimits=new int[l];				// lower limit array
		for(int i=0;i<l;i++){
			lowerLimits[i]=user_input.nextInt();
		}
		int u=user_input.nextInt();					// size of upper limit array
		int []  upperLimits=new int[u];				// upper limit array
		for(int i=0;i<u;i++){
			upperLimits[i]=user_input.nextInt();
		}
		
		PsychometricTesting.jobOffers(scores, lowerLimits, upperLimits);

	}

}
