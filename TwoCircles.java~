import java.util.Scanner;

public class TwoCircles {
	
	static String[] circles(String[] info) {
		for(int i=0;i<info.length;i++){
			System.out.println(info[i]);
		}
		return info;
    }

	public static void main(String[] args) {

		Scanner user_input = new Scanner( System.in );
		
		System.out.println("Enter here :"); 
		int n=user_input.nextInt();						// array size  of combination
		int arr[][] = new int[n][6];					// 2D array of coordinates and r
		for(int i=0;i<n;i++){
			for(int j=0;j<6;j++){
				arr[i][j]=user_input.nextInt();
			}
		}
		String [] info=new String [n];				 	// info array
		for(int i=0;i<n;i++){							
			if(arr[i][0]==0 && arr[i][3]==0){			// circles with x=0
				if(arr[i][1]==arr[i][4]){				// both center at a point
						info[i]="Concentric";
				}
				else{
					int circleTopPt_1=arr[i][1]+arr[i][2];
					int circleBottomPt_1=arr[i][1]-arr[i][2];
					int circleTopPt_2=arr[i][4]+arr[i][5];
					int circleBottomPt_2=arr[i][4]-arr[i][5];
		
					if(arr[i][1]>arr[i][4]){				// if center of circle_one  above the center of circle_two
						if(circleBottomPt_1==circleTopPt_2 || circleBottomPt_1==circleBottomPt_2 || circleTopPt_1==circleTopPt_2){
							info[i]="Touching";
						}
						else if(circleBottomPt_1<circleTopPt_2 ){
							info[i]="Intersecting";
						}
						else if(circleBottomPt_1>circleTopPt_2){
							info[i]="Disjoint‐Outside";
						}
						else{
							info[i]="Disjoint‐Inside";
						}
					}else{								// if center of circle_two  above the center of circle_one
						if(circleBottomPt_2==circleTopPt_1 || circleBottomPt_1==circleBottomPt_2 || circleTopPt_1==circleTopPt_2){
							info[i]="Touching";
						}
						else if(circleBottomPt_2<circleTopPt_1 ){
							info[i]="Intersecting";
						}
						else if(circleBottomPt_2>circleTopPt_1){
							info[i]="Disjoint‐Outside";
						}
						else{
							info[i]="Disjoint‐Inside";
						}
					}
				}
			}
			if(arr[i][1]==0 && arr[i][4]==0){				// circles with y=0
				if(arr[i][0]==arr[i][3]){					// centers of circles at a point
					info[i]="Concentric";
				}else{
					int circleRightPt_1=arr[i][0]+arr[i][2];
					int circleLeftPt_1=arr[i][0]-arr[i][2];
					int circleRightPt_2=arr[i][3]+arr[i][5];
					int circleLeftPt_2=arr[i][3]-arr[i][5];
							
					if(arr[i][0]>arr[i][3]){			// if center of circle_one  right to the center of circle_two
						if(circleLeftPt_1==circleRightPt_2 || circleLeftPt_1==circleLeftPt_2 || circleRightPt_1==circleRightPt_2){
							info[i]="Touching";
						}
						else if(circleLeftPt_1<circleRightPt_2 ){
							info[i]="Intersecting";
						}
						else if(circleLeftPt_1>circleRightPt_2){
							info[i]="Disjoint‐Outside";
						}
						else{
							info[i]="Disjoint‐Inside";
						}
					}else{								// if center of circle_two  right to the center of circle_one
						if(circleLeftPt_2==circleRightPt_1 || circleLeftPt_1==circleLeftPt_2 || circleRightPt_1==circleRightPt_2){
							info[i]="Touching";
						}
						else if(circleLeftPt_2<circleRightPt_1 ){
							info[i]="Intersecting";
						}
						else if(circleLeftPt_2>circleRightPt_1){
							info[i]="Disjoint‐Outside";
						}
						else{
							info[i]="Disjoint‐Inside";
						}
					}
				}		
			}
		}
		TwoCircles.circles(info);
	}
		
}
