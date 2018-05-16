import java.util.Scanner;

public class TwoCircles {
	
	public static String[] circles(String[] info) {
		String [] results=new String [info.length];				 	// info array
		for(int i=0;i<info.length;i++){	
			//System.out.println(info[1]+info.length);
			 String[] infoStr = info[i].split(" ");
	            int[] infoInt = new int[infoStr.length];
	           // System.out.println(infoStr[5]);
	            for (int j=0;j<infoStr.length;j++) infoInt[j]=Integer.valueOf(infoStr[j]);
			
	            if(infoInt[0]==0 && infoInt[3]==0){			// circles with x=0
				if(infoInt[1]==infoInt[4]){				// both center at a point
					results[i]="Concentric";
				}
				else{
				
					int circleRad_1=infoInt[2];
					int circleRad_2=infoInt[5];
					
					if(infoInt[1]>infoInt[4]){				// if center of circle_one  above the center of circle_two
						//if(circleBottomPt_1==circleTopPt_2 || circleBottomPt_1==circleBottomPt_2 || circleTopPt_1==circleTopPt_2){
						if((circleRad_1+circleRad_2==infoInt[1]-infoInt[4]) ||(Math.abs(circleRad_2-circleRad_1)== infoInt[1]-infoInt[4])){	
						results[i]="Touching";
						}
						
						else if(circleRad_1+circleRad_2<infoInt[1]-infoInt[4]){
							results[i]="Disjoint‐Outside";
						}
						else{
							if(Math.abs(circleRad_1-circleRad_2)>infoInt[1]-infoInt[4] ){
								results[i]="Disjoint‐Inside";
								
							}else{
								results[i]="Intersecting";
							}
							
						}
					}else{								// if center of circle_two  above the center of circle_one
						if((circleRad_1+circleRad_2==infoInt[4]-infoInt[1])||(Math.abs(circleRad_1-circleRad_2)== infoInt[4]-infoInt[1])){
							results[i]="Touching";
						}
						else if(circleRad_1+circleRad_2<infoInt[4]-infoInt[1]){
							results[i]="Disjoint‐Outside";
						}
						else{
							if(Math.abs(circleRad_1-circleRad_2)>infoInt[4]-infoInt[1] ){
								results[i]="Disjoint‐Inside";
								
							}else{
								results[i]="Intersecting";
							}
							
						}
					}
				}
			}
			if(infoInt[1]==0 && infoInt[4]==0){				// circles with y=0
				if(infoInt[0]==infoInt[3]){					// centers of circles at a point
					results[i]="Concentric";
				}else{
					
					int circleRad_1=infoInt[2];
					int circleRad_2=infoInt[5];
					
							
					if(infoInt[0]>infoInt[3]){			// if center of circle_one  right to the center of circle_two
						if((circleRad_1+circleRad_2==infoInt[0]-infoInt[3])|| (Math.abs(circleRad_2-circleRad_1)== infoInt[0]-infoInt[3])){
							results[i]="Touching";
						}
						else if(circleRad_1+circleRad_2<infoInt[0]-infoInt[3]){
							results[i]="Disjoint‐Outside";
						}
						else{
							if(Math.abs(circleRad_1-circleRad_2)>infoInt[0]-infoInt[3] ){
								results[i]="Disjoint‐Inside";
								
							}else{
								results[i]="Intersecting";
							}
							
						}
					}else{								// if center of circle_two  right to the center of circle_one
						if((circleRad_1+circleRad_2==infoInt[3]-infoInt[0])|| (Math.abs(circleRad_1-circleRad_2)== infoInt[3]-infoInt[0])){
							results[i]="Touching";
						}
						else if(circleRad_1+circleRad_2<infoInt[3]-infoInt[0]){
							results[i]="Disjoint‐Outside";
						}
						else{
							if(Math.abs(circleRad_1-circleRad_2)>infoInt[3]-infoInt[0] ){
								results[i]="Disjoint‐Inside";
								
							}else{
								results[i]="Intersecting";
							}
							
						}
					}
				}		
			}
		}
		
		return results;
    }


		
}
