import java.util.Scanner;

public class FindTheWinner {
	
	static String winner(int[] andrea, int[] maria, String s) {
		int andreaPoints=0;
		int mariaPoints=0;
		String winner;
		
		if(s.equals("Odd") && andrea.length>1){
			for(int i=1;i<andrea.length;i+=2){
				andreaPoints=andreaPoints+(andrea[i]-maria[i]);
				mariaPoints=mariaPoints+(maria[i]-andrea[i]);
			}
		}
		else if(s.equals("Even")){
			for(int i=0;i<andrea.length;i+=2){
				andreaPoints=andreaPoints+(andrea[i]-maria[i]);
				mariaPoints=mariaPoints+(maria[i]-andrea[i]);
			}
		}else{
			winner="Tie";
		}
		if(andreaPoints==mariaPoints){						//Tie
			winner ="Tie";
		}
		else if(andreaPoints>mariaPoints){					// Andrea
			winner= "Andrea";
		}else{												// Maria
			winner= "Maria";
		}
		System.out.println(winner);
		return winner;
		
		
    }

	public static void main(String[] args) {

		Scanner user_input = new Scanner( System.in );
		
		//System.out.println("Enter here :"); 
		int n=user_input.nextInt();								// array size for player 1 
		
		int player1[] = new int[n];								// integer array for player 1
		for(int i=0;i<n;i++){
			player1[i]=user_input.nextInt();
		}
		
		int m=user_input.nextInt();								// array size for player 2
		
		int []  player2=new int[m];								// integer array for player 2
		for(int i=0;i<m;i++){
			player2[i]=user_input.nextInt();
		}
		
		String s= user_input.next();							// Odd or Even
		
		FindTheWinner.winner(player1, player2, s);
	}
}
