import java.util.Scanner;

public class TwoCircles {
	
	

   

 static String[] circles(String[] info) {

     int l = info.length;

      String[] resultsArray = new String[l];
   
 	for (int i=0; i<l; i++) { 
		String[] lineElements = info[i].split(" "); 
			int[] array = Arrays.asList(lineElements).stream().mapToInt(Integer::parseInt).toArray(); 

		int x1 = array[0]; 
		int y1 = array[1]; 
		int r1 = array[2]; 
		int x2 = array[3]; 
		int y2 = array[4]; 
 		int r2 = array[5];	 
 		String res = null; 
 
 
			if ((x1 == x2) && (y1 == y2)) { 	
				res = "Concentric"; 
 			} else { 
 				double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5); 
 
 				if (distance == (r1 + r2) || distance == Math.abs(r1 - r2)) { 
 					res = "Touching"; 
 				} else if ((r2 >= r1 && distance <= (r2 - r1)) || (r1 >= r2 && distance <= (r1 - r2))) { 
 					res = "Disjoint-Inside"; 
 				} else if (distance > (r1 + r2)) { 
 					res = "Disjoint-Outside"; 
 				} else { 
 					res = "Intersecting"; 
 				} 
 			} 
 			 
 			resultsArray[i] = res; 
 		} 
 		 
 		return resultsArray; 

  	} 

   
 
 
		
}
