/**
 * 
 */
package persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import controllers.ControllerJButtonOptions;

/**
 * @author Esteban
 *
 */
public class FileWriterGame {

	private File filePlayersData;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private static FileWriterGame myFileWriterGame;
	
	public FileWriterGame() {

		try {
			filePlayersData = new File("src/playerData/PlayerData.txt");
	        filePlayersData.createNewFile();
	        fileWriter = new FileWriter(filePlayersData);
	        bufferedWriter = new BufferedWriter(fileWriter);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public  static FileWriterGame getFileWriterGame () {
		 if (myFileWriterGame ==null) {		 
			 myFileWriterGame = new  FileWriterGame();
		 }
		 return myFileWriterGame;
	}
	
	public void writeFile(String text) {
        try {
			bufferedWriter.write(text);
			bufferedWriter.write("\n"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        
    }
    public void closeWriters(){
        try {
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
	
	

}