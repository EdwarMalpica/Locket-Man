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
import java.io.File;
import java.io.IOException;


/**
 * @author Esteban
 *
 */
public class FontGame {

	@SuppressWarnings("unused")
	private String nameFontDigitalNumbers;
	private Font font = null;
	
	public FontGame() {
	}
	
	/**
	 * Cragamos la fuente para nuestro timer sin instalarla
	 * @param pathFont ruta del archivo
	 * @param style estilo
	 * @param sizeFont tama�o 
	 * @return
	 */
	
	public Font loadFont(String pathFont,int sizeFont){		
		Font fontt = null;
		try {
        	File file = new File(getClass().getResource(pathFont).getPath());
        	font = Font.createFont(Font.TRUETYPE_FONT,file);
			fontt = font.deriveFont(Font.BOLD,sizeFont);
			} catch (FontFormatException | IOException e) {
				e.printStackTrace();
			}			
		
		return fontt;
	}

}
