import java.util.Scanner;

public class BuyingShowTickets {
	static long waitingTime;
	
	static long waitingTime(int[] tickets, int p) {
		waitingTime = p+1;
		int numberOfPeople=tickets.length;
		int pChangPosition=p;
		
		for(int i= 1;i<tickets[p];i++){
			int leaving = 0;                   //leaving people who were before jessi, once got required tickets 
			int backleaving = 0;			  //leaving people who were after  jessi, once got required tickets 
			
			for(int j=0;j<p;j++){
				if(tickets[j]==i){
					leaving++;
				}
			}
			for(int k=p;k<tickets.length;k++){
				if(tickets[k]==i){
					backleaving++;
				}
			}
			
			waitingTime+=(numberOfPeople-leaving);
			numberOfPeople=numberOfPeople-leaving-backleaving;
			pChangPosition=pChangPosition-leaving;
		}
		System.out.println(waitingTime);
		return waitingTime;
    }
	
	public static void main(String[] args) {
	
		Scanner user_input = new Scanner( System.in );
		
		System.out.println("Enter here :"); 
		int n=user_input.nextInt();                          // Number of people in the line
	 
		int tickets[] = new int[n];                          // Array for required tickets
		for(int i=0;i<n;i++){
			tickets[i]=user_input.nextInt();
		}
		int p=user_input.nextInt();                           // position of Jessi
		
		BuyingShowTickets.waitingTime(tickets, p);
	}
}
