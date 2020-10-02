/**
 *Constants.java  
 *asdasd
 */
package constants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author eduar
 *
 */
public class Constants {

	public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
	public static final Dimension SCREEN_FRAME = new Dimension(1300,740);
	
	
	
	//Rutas Resources
	
	public static final String PATH_IMAGE_PERSON_RIGHT = "../resources/PersonLeft.png";
	public static final String PATH_IMAGE_PERSON_LEFT = "../resources/PersonRight.png";
	public static final String PATH_IMAGE_PERSON_STAY = "../resources/PersonStay.png";
	public static final String PATH_IMAGE_PERSON_JUMP_RIGHT = "../resources/PersonJumpRight.png";
	public static final String PATH_SOURCES_LEVEL_BUILD = "../resources/data/LevelsData.json";
	
	//Colors
	
	public static final Color COLOR_TEST = Color.white;
}
