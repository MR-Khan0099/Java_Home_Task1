package Exceptions;

import java.io.IOException;  // Import the IOException class to handle errors

import java.io.*;
public class Store_data 
{
	public void create_file()
	{
		try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }		
	}
	public void Delete_file() 
	{
		try (FileOutputStream fos= new FileOutputStream("outputfile.txt");
	 
	             // Adding resource
	 
	             // Reading the stream of character from
	             BufferedReader br = new BufferedReader(
	                 new FileReader("gfgtextfile.txt"))) {
	 
	            // Declaring a string holding the
	            // stream content of the file
	            String text;
	 
	            // Condition check using readLine() method
	            // which holds true till there is content
	            // in the input file
	            while ((text = br.readLine()) != null) {
	 
	                // Reading from input file passed above
	                // using getBytes() method
	                byte arr[] = text.getBytes();
	 
	                // String converted to bytes
	                fos.write(arr);
	 
	                // Copying the content of passed input file
	                // 'inputgfgtext' file to outputfile.txt
	            }
	 
	            // Display message when
	            // file is successfully copied
	            System.out.println(
	                "File content copied to another one.");
	        }
	 
	        // Catch block to handle generic exceptions
	        catch (Exception e) {
	 
	            // Display the exception on the
	            // console window
	            System.out.println(e);
	        }
	 
	        // Display message for successful execution of the
	        // program
	        System.out.println(
	            "Resource are closed and message has been written into the gfgtextfile.txt");
	}

}
