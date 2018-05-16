import java.util.Scanner;

public class TwoCircles {
	
	 private static final String touching = "Touching";
   
 private static final String concentric = "Concentric";
    
private static final String intersecting = "Intersecting";
  
  private static final String dis_out = "Disjoint‐Outside";
   
 private static final String dis_in = "Disjoint‐Inside";

   

 static String[] circles(String[] info) {

    
    /*
        System.out.println("circle information:");
        for (String s:info) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        */
    

    int l = info.length;

       
 String[] relations = new String[l];
   
     for (int n=0;n<l;n++) {
         
   String[] infoStr = info[n].split(" ");
   
         int[] infoInt = new int[infoStr.length];
    
        for (int i=0;i<infoStr.length;i++) infoInt[i]=Integer.valueOf(infoStr[i]);

   
         if (infoInt[0]==infoInt[3]&&infoInt[1]==infoInt[4])
   
             relations[n]=concentric;
            else {
                int distance = Math.abs(infoInt[0]-infoInt[3]+infoInt[1]-infoInt[4]);
                int radiusSum = infoInt[2]+infoInt[5];
                int radiusDiff = Math.abs(infoInt[2]-infoInt[5]);
                if (radiusDiff==distance||radiusSum==distance) relations[n]=touching;
                else if (radiusDiff<distance&&radiusSum>distance) relations[n]=intersecting;
                else if (radiusDiff>distance) relations[n]=dis_in;
                else relations[n]=dis_out;
            }
        }
        return relations;
 
 }
		
}
