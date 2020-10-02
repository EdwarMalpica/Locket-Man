package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderGame {

	  private FileReader fileReader;
	    private BufferedReader bufferedReader;
	    
	    public FileReaderGame(String pathFileSource){
	        try {
				fileReader = new FileReader(new File(pathFileSource));
				bufferedReader = new BufferedReader(fileReader);
			} catch (FileNotFoundException e) {
			}
	        
	    }
	    
	    public ArrayList readLines() {
	         ArrayList<String> array = new ArrayList();      
	        try { 
	        	
	        	String currentLines;
				while((currentLines = bufferedReader.readLine())!= null){
				      array.add(currentLines);
				}
			} catch (IOException e) {

			}       
	        
	        return array;
	    }
	    public void closeReaders() {
	        try {
				bufferedReader.close();
				fileReader.close();
			} catch (IOException e) {
			}
	        
	    }
}
