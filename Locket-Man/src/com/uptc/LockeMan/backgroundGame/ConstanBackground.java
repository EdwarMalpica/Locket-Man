package com.uptc.LockeMan.backgroundGame;

import java.awt.Dimension;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import com.uptc.LockeMan.controllers.ControllerJButtonOptions;
import com.uptc.LockeMan.utilities.FontGame;
import com.uptc.LockeMan.utilities.PropertiesManager;
import com.uptc.LockeMan.viewsGameMenus.WindowMenu;
import com.uptc.LockeMan.viewsGameMessages.WindowMessageGame;

public class ConstanBackground {
	
	
	private static ConstanBackground myConstanBackground;
	
	
	//Paths
		public static final String PATH_BACKGROUND_LEVEL1_IMAGE = "../resources/FondoNivel1V1.jpg";
		public static final String PATH_BACKGROUND_LEVEL2_IMAGE = "../resources/FondoNivel2V1.png";
		public static final String PATH_BUTTON_FONT = "../resources/Summer.ttf";
		public static final String PATH_FONT_TIMER = "../resources/FontLabel.ttf"; 
		public static final String PATH_IMAGE_BACKGROUND_MENU = "../resources/FondoMenu1.jpg";
		public static final String PATH_IMAGE_BACKGROUND_BUTTONS = "../resources/FondoBotonesLadrillo.jpg";
		//-----------------------------------------------------------------------------------------------
	//Fonts	
		public static final Font TIMER_FONT = new FontGame().loadFont(PATH_FONT_TIMER, 60);
		public static final Font TIMER_FONT_1 = new FontGame().loadFont(PATH_FONT_TIMER, 30);
		public static final Font SUMMER_FONT_1 = new FontGame().loadFont(PATH_BUTTON_FONT, 30);
		public static final Font SUMMER_FONT_SMALLSIZE = new FontGame().loadFont(PATH_BUTTON_FONT, 20);
		public static final Font SUMMER_FONT_SMALLSIZE_2 = new FontGame().loadFont(PATH_BUTTON_FONT, 40);

		
		//-----------------------------------------------------------------------------------------------
	//Values		
		public static final String TIMER_NAME = "TIMER";
		public static final String START_VALUE_TIMER = "00:00";
		public static final int[] BOUNDS_TIMER = {969,53,273,80};
	//Buttons Name
		public static final String[] NAMES_BUTTONS_MAIN_MENU = {"txtMainMenu","btnRegistry","btnQuickPlay","btnOptions","btnExit"};
		public static final String[] NAME_BUTTONS_QUICKPLAY_MENU = {"txtQuickPlay","btnLevel1","btnLevel2","btnReturn"};
		public static final String[] NAME_BUTTONS_OPTIONS_MENU =  {"txtOpciones","btnVolume","btnLanguage","btnHelp","btnReturn"};
		public static final String[] NAME_BUTTONS_LANGUAGE_MENU = {"txtLenguage","btnSpanish","btnEnglish","btnReturn"};

		//Nombre botones
		
		public static final String NAME_BUTTON_REGISTRY = "btnRegistry";
		public static final String NAME_BUTTON_LEVEL_1 = "btnLevel1";
		public static final String NAME_BUTTON_LEVE_2 = "btnLevel2";
		public static final String NAME_BUTTON_RETURN = "btnReturn";
		public static final String NAME_BUTTON_VOLUME = "btnVolume";
		public static final String NAME_BUTTON_LANGUAGE = "btnLanguage";
		public static final String NAME_BUTTON_SPANISH = "btnSpanish";
		public static final String NAME_BUTTON_ENGLISH = "btnEnglish";
		public static final String NAME_BUTTON_EXIT = "btnExit";
		public static final String NAME_BUTTON_QUICKPLAY = "btnQuickPlay";
		public static final String NAME_BUTTON_OPTIONS = "btnOptions";
		public static final String NAME_BUTTON_HELP = "btnHelp";
		public static final String NAME_BUTTON_ACCEPT = "btnAccept";
	
		
		
		

	

	
}
