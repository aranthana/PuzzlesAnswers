import java.util.Scanner;
import java.util.Stack;

public class BalancedOrNot {
	
	static int[] balancedOrNot(String[] expressions, int[] maxReplacements){
		int[] results=new int[expressions.length];
		for(int i=0;i<expressions.length;i++){
			int count=0;
			Stack<Character> stack=new Stack<>();
			for(int j=0;j<expressions[i].length();j++){
				Character c=expressions[i].charAt(j);
				if(c=='<'){
					stack.push(c);
				}
				else {
					if(stack.size()==0){
						count++;
					}
					else{
						stack.pop();
					}
				}
			}
			if(stack.size()>0){
				results[i]=0;
			}
			else {
				if(count<=maxReplacements[i])
				{
					results[i]=1;
				}
				else{
					results[i]=0;
				}
			}

			System.out.println(results[i]);
		}

		return results;
	}

	public static void main(String[] args) {
		Scanner user_input = new Scanner( System.in );
		//System.out.println("Enter here :"); 
		int n=user_input.nextInt();							// size of expressions array
	 	String expressions[] = new String[n];				// string array
		for(int i=0;i<n;i++){
			expressions[i]=user_input.next();
		}
		int m=user_input.nextInt();							// size of maxReplacements array
		int []  maxReplacements=new int[m];					// max replacements array
		for(int i=0;i<m;i++){
			maxReplacements[i]=user_input.nextInt();
		}
		
		balancedOrNot(expressions,maxReplacements);
	}
	
	

}
