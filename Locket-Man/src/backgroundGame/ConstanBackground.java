package backgroundGame;

import java.awt.Dimension;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import utilities.FontGame;
import utilities.PropertiesManager;
import viewsGameMenus.WindowMenu;
import viewsGameMenus.WindowRegistry;
import viewsGameMessages.WindowMessageGame;

public class ConstanBackground {
	
	
	private static PropertiesManager propertiesManager = PropertiesManager.getPropertiesManager(); 
	
	public void updateLanguage() {
		propertiesManager = PropertiesManager.getPropertiesManager();
	}
	
	//Paths
		public static final String PATH_BACKGROUND_LEVEL1_IMAGE = "bin/resources/FondoNivel1V1.jpg";
		public static final String PATH_BACKGROUND_LEVEL2_IMAGE = "bin/resources/FondoNivel2V1.png";
		public static final String PATH_BUTTON_FONT = "../resources/Summer.ttf";
		public static final String PATH_FONT_TIMER = "../resources/FontLabel.ttf"; 
		public static final String PATH_IMAGE_BACKGROUND_MENU = "src/resources/FondoMenu1.jpg";
		public static final String PATH_IMAGE_BACKGROUND_BUTTONS = "src/resources/FondoBotonesLadrillo.jpg";
		//-----------------------------------------------------------------------------------------------
	//Fonts	
		public static final Font TIMER_FONT = new FontGame().loadFont(PATH_FONT_TIMER, 60);
		public static final Font TIMER_FONT_1 = new FontGame().loadFont(PATH_FONT_TIMER, 30);
		public static final Font SUMMER_FONT_1 = new FontGame().loadFont(PATH_BUTTON_FONT, 30);
		public static final Font SUMMER_FONT_SMALLSIZE = new FontGame().loadFont(PATH_BUTTON_FONT, 15);

		
		//-----------------------------------------------------------------------------------------------
	//Values		
		public static final String TIMER_NAME = "TIMER";
		public static final String START_VALUE_TIMER = "00:00";
		public static final int[] BOUNDS_TIMER = {969,53,273,80};
	//Hacerle internacionalizacion
		public  final static String[] TEXT_BUTTONS_MAIN_MENU = {propertiesManager.getBtnMainMenuMessagee(),propertiesManager.getBtnRegistryMessage(),
				propertiesManager.getBtnQuickPlayMessage(),propertiesManager.getBtnOptionsMessage(),propertiesManager.getBtnExitMessage()};
		public static final String[] NAMES_BUTTONS_MAIN_MENU = {"txtMainMenu","btnRegistry","btnQuickPlay","btnOptions","btnExit"};
	//Hacerle internacionalizacion	
		public static  String[] TEXT_BUTTONS_QUICKPLAY_MENU = {propertiesManager.getBtnQuickPlayMessage(),propertiesManager.getBtnLevel1Message(),propertiesManager.getBtnLevel2Message(),propertiesManager.getBtnReturnMessage()};
		public static final String[] NAME_BUTTONS_QUICKPLAY_MENU = {"txtQuickPlay","btnLevel1","btnLevel2","btnReturn"};
	//Hacerle internacionalizacion	
		public final static String[] TEXT_BUTTONS_OPTIONS_MENU = {propertiesManager.getBtnOptionsMessage(),propertiesManager.getBtnVolumeMessagee(),propertiesManager.getBtnLanguageMessage(),propertiesManager.getBtnHelpMessage(),
		propertiesManager.getBtnReturnMessage()};
		public static final String[] NAME_BUTTONS_OPTIONS_MENU =  {"txtOpciones","btnVolume","btnLanguage","btnHelp","btnReturn"};
	//Hacerle internacionalizacion	
		public static String[] TEXT_BUTTONS_LANGUAGE_MENU = {propertiesManager.getBtnLanguageMessage(),propertiesManager.getBtnSpanishMessage(),propertiesManager.getBtnEnglishMessage(),propertiesManager.getBtnReturnMessage()};
		public static final String[] NAME_BUTTONS_LANGUAGE_MENU = {"txtLenguage","btnSpanish","btnEnglish","btnReturn"};
	//Hacerle internacionalizacion	
	//Windows
		public static final WindowMenu WINDOW_MENU_QUICKPLAY= new WindowMenu(ConstanBackground.TEXT_BUTTONS_QUICKPLAY_MENU,ConstanBackground.NAME_BUTTONS_QUICKPLAY_MENU);
		public static final WindowMenu WINDOW_MENU_OPTIONS = new WindowMenu(ConstanBackground.TEXT_BUTTONS_OPTIONS_MENU,ConstanBackground.NAME_BUTTONS_OPTIONS_MENU);
		public static final WindowMenu WINDOW_MAIN_MENU = new WindowMenu(ConstanBackground.TEXT_BUTTONS_MAIN_MENU,ConstanBackground.NAMES_BUTTONS_MAIN_MENU);
		public static final WindowMenu WINDOW_LANGUAGE_MENU = new WindowMenu(ConstanBackground.TEXT_BUTTONS_LANGUAGE_MENU,ConstanBackground.NAME_BUTTONS_LANGUAGE_MENU);
		public static final WindowMessageGame WINDOW_HELP_MENU =  new WindowMessageGame(propertiesManager.getBtnHelpMessage(),propertiesManager.getTxtHelpMessage());
		public static final WindowRegistry WINDOW_REGISTRY = new WindowRegistry();

		

	

	
}
