import java.util.Scanner;

public class CountingGroup {
	
	static int [] countingGroup (int [][] coordinatesVal, int [] calVal,int n, int m){
		int [] gc=new int[calVal.length];
		
		for(int c=0;c<calVal.length;c++){
			int cc=0;
			for(int i =0; i< n;i++){
				for(int j=0;j<m;j++){
					if(coordinatesVal[i][j]==1){
						for(int ii =i; ii< n;ii++){
							for(int jj=j;jj<m;jj++){
								if(coordinatesVal[ii][jj]==1){
									System.out.println("i"+i);
									System.out.println(j);
									System.out.println("ii"+ii);
									System.out.println(jj);
									int xDiff=ii-i;
									if(xDiff<0)
										xDiff=i-ii;
									int yDiff=jj-j;
									if(yDiff<0)
										yDiff=j-jj;
									if(xDiff+yDiff==calVal[c]){
										System.out.println("satis"+calVal[c]);
										cc++;	
									}
								}
							}
					}
				
				}
			}
			
		}
		gc[c]=cc;
		System.out.println(gc[c]);
		}
		
		return gc;
		
	}

	public static void main(String[] args) {
		Scanner user_input = new Scanner( System.in );
	
		System.out.println("Enter here :"); 
		int n=user_input.nextInt();	
		int m= user_input.nextInt();

		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=user_input.nextInt();
			}			
		}
		int p=user_input.nextInt();
		int []  calVal=new int[p];
	 
		for(int i=0;i<p;i++){
			calVal[i]=user_input.nextInt();
		}
		
		CountingGroup.countingGroup(arr, calVal,n,m);
	}
}

