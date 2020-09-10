/**
 *@author Locket-Man ORG
 *@proyect Locket-Man
 *@proyectClass Locket-Man
 *@Date 9 sept. 2020
 *@authorClass Esteban Novoa
	 
 */
package utilities;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Esteban
 *
 */
public class FontGame {

	private String nameFontDigitalNumbers;
	private Font font = null;
	
	public FontGame() {
		nameFontDigitalNumbers = "DS-Digital";
	}
	/**
	 * Cragamos la fuente para nuestro timer sin instalarla
	 * @param pathFont ruta del archivo
	 * @param style estilo
	 * @param sizeFont tamaño 
	 * @return
	 */
	
	public Font loadTimerFont(String pathFont,int sizeFont){		
        try {
        	InputStream inputStream = ClassLoader.class.getResourceAsStream(pathFont);
        	font = Font.createFont(Font.TRUETYPE_FONT,inputStream);
			//font.deriveFont(Float.valueOf(sizeFont+"f"));
        	inputStream.close();
			} catch (FontFormatException | IOException e) {
				e.printStackTrace();
			}
			
		
		return font;
	}

}
