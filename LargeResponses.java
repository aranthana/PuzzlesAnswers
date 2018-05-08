import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LargeResponses {

	public static void main(String[] args) {
		 
		final Scanner scan = new Scanner(System.in);
		
		String fileName;
		fileName=scan.nextLine();
		
		
		// This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            while((line = bufferedReader.readLine()) != null) {
            	stringBuffer.append(line);
            	stringBuffer.append("\n");
                
            } 
            //  close files.
            bufferedReader.close();
            
            String [] str= stringBuffer.toString().split(" ");
            long max=Long.valueOf(str[9].trim());
            System.out.println(str[9]);
            int maxCount=1;
            for(int i=19;i<str.length;i+=10){
            	 System.out.println(str[i]);
            	if(max<Long.valueOf(str[i].trim())){
            		max=Long.valueOf(str[i].trim());
            		maxCount=1;
            		
            	}else if(max==Long.valueOf(str[i].trim())){
            		maxCount++;
            	}
            	 
            }
            System.out.println(max);
            System.out.println(maxCount);
             
            
         // The name of the file to open.
            String fileNameWrite = "bytes_"+fileName;

            try {
                // Assume default encoding.
                FileWriter fileWriter =
                    new FileWriter(fileNameWrite);

                // Always wrap FileWriter in BufferedWriter.
                BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

                // Note that write() does not automatically
                // append a newline character.
                bufferedWriter.write(String.valueOf(maxCount));
               
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(maxCount*max));
               

                // Always close files.
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println(
                    "Error writing to file '"
                    + fileName + "'");
                // Or we could just do this:
                // ex.printStackTrace();
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
           
        }

	}

}
