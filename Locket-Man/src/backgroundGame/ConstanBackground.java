package backgroundGame;

import java.awt.Dimension;
import java.awt.Font;

import utilities.FontGame;

public class ConstanBackground {
	
		public static final String PATH_BACKGROUND_LEVEL1_IMAGE = "bin/resources/FondoNivel1V1.jpg";
		public static final String PATH_BACKGROUND_LEVEL2_IMAGE = "bin/resources/FondoNivel2V1.png";
		public static final String PATH_BUTTON_FONT = "../resources/Summer.ttf";
		public static final String PATH_FONT_TIMER = "../resources/FontLabel.ttf"; 
		public static final Font TIMER_FONT = new FontGame().loadFont(PATH_FONT_TIMER, 60);
		public static final Font TIMER_FONT_1 = new FontGame().loadFont(PATH_FONT_TIMER, 30);
		public static final Font SUMMER_FONT_1 = new FontGame().loadFont(PATH_BUTTON_FONT, 30);
		public static final String TIMER_NAME = "TIMER";
		public static final String START_VALUE_TIMER = "00:00";
		public static final int[] BOUNDS_TIMER = {969,53,273,80};
		public static final String PATH_IMAGE_BACKGROUND_MENU = "src/resources/FondoMenu1.jpg";
		public static final String PATH_IMAGE_BACKGROUND_BUTTONS = "src/resources/FondoBotonesLadrillo.jpg";
		
	

	
}
