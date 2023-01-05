import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		String inputFile = "input.csv";
		String outputFile = "output.txt";
		
		String line = null;
		String[] token;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(inputFile);

	        // Always wrap FileReader in BufferedReader.
	        bufferedReader = new BufferedReader(fileReader);
	        
	        // Create a new file, FileWriter and wrap with BufferedWriter
	        File file = new File(outputFile);
	        bufferedWriter = new BufferedWriter(new FileWriter(file));
	       
	        // Read until end of file
	        System.out.println("Start to Copy");
	        while((line = bufferedReader.readLine()) != null) 
	        {
		        	token = line.split(",");
		        	String flag = token[0];
		        	
		        if (flag.equals("copy")) 
		        {
		        		bufferedWriter.write(token[1]);
		        		bufferedWriter.write("\r\n");
		        		System.out.println(token[1]);
		        }
		                     
	        }
	    }
	    catch(FileNotFoundException ex) 
      {     
          System.out.println("File not found : "+inputFile);
      }
	    
	    catch(IOException ex) 
	    {   	
	        ex.printStackTrace();
	    }
	    finally
	    {
		    	if (bufferedReader != null)
		    		bufferedReader.close();
		    	if ( bufferedWriter != null ) 
		    		bufferedWriter.close();
	    }
	}
}

