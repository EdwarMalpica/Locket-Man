package com.uptc.LockedMan.constants;

import java.awt.*;

public class Constants {

	//Dimensiones
	public static final Dimension DIMENSION_WINDOW_DEFAULT = Toolkit.getDefaultToolkit().getScreenSize();
	public static final Dimension DIMENSION_LABEL_FONT_MARIO_PERCENT = new Dimension(230, 55);
	public static final Dimension DIMENSION_LABEL_AVATAR = new Dimension(80, 80);
	public static final Dimension DIMENSION_LABEL_LETTER_A = new Dimension(47, 45);
	public static final Dimension DIMENSION_LABEL_VERSION = new Dimension(180, 30);
	public static final Dimension DIMENSION_BUTTON_PLAY = new Dimension(128, 128);
	public static final Dimension DIMENSION_BUTTON_CONFIG = new Dimension(64, 64);
	public static final Dimension DIMENSION_PANEL_CONFIG = new Dimension(455, 200);
	
	//Localizaciones
	public static final Point POINT_LABEL_FONT_MARIO = new Point(30, 190);
	public static final Point POINT_LABEL_AVATAR = new Point(16, 48);
	public static final Point POINT_LETTER_A = new Point(200, 65);
	public static final Point POINT_NAME_PLAY = new Point(0, 125);
	public static final Point POINT_LABEL_VERSION = new Point(285, 220);
	public static final Point POINT_CERO = new Point(0,0);

	//Tama�os de fuentes...
	public static final int SIZE_FONT_MARIO_PERCENT = 100;
	public static final int SIZE_WELLCOME_MESSAGE = 62;
	public static final int SIZE_FONT_VERSION = 28;
	
	//Mensajes
	public static final String MESSAGE_WELCOME = "BIENVENIDO";
	public static final String ADVANCE = "avanzar";
	public static final String BACK = "retroceder";
	public static final String UP_OR_DOWN = "eje_y";
	public static final String MOVING_SIDE = "eje_x";
	public static final String LETTER_A_MESSAGE = "A";
	public static final String NAME_PLAY = "LOCKED-MAN";
	public static final String VERSION_PLAY = "version 1.0";
	
	//Direcciones 
	public static final String PATH_BACKGROUND_SPLASH = "../../resources/background8.jpg";
	public static final String PATH_AVATAR_IMAGE = "../../resources/anim1.png";
	public static final String PATH_GIFT_1 = "../../resources/giftMolin.gif";
	public static final String PATH_SPRITE_RUN = "../../resources/SpriteAvatar.png";
	public static final String PATH_ARRAY_ANIM = "../../resources/anim1/avatarYellow";
	public static final String PATH_DIRECTORY_SOUNDS = "../tracks/";
	public static final String PATH_BACKGROUND_REGISTRY = "../../resources/font1.png";
	public static final String PATH_BUTTON_PLAY = "../../resources/buttonPlay.png";
	public static final String PATH_BUTTON_CONFIG = "../../resources/buttonConfig.png";
	public static final String PATH_BUTTON_ABOUT = "../../resources/about.png";
	public static final String PATH_BUTTON_CLOSE = "../../resources/btnClose.png";
	public static final String PATH_FILE_ABOUT_US = "C:\\Users\\SAMSUNG\\git\\Locket-Ma\\Locket-Man\\src\\com\\uptc\\LockedMan\\persistence\\aboutUs.txt";
	
	//Nombres de Fuentes...
	public static final String PATH_FONT_MARIO = "Mario-Kart-DS.ttf";
	
	//formatos
	public static final String FORMAT_PNG = ".png";
	public static final String FORMAT_WAV = ".wav";
	public static final String FORMAT_GIF = ".gif";
	
	//Sonidos
	public static final String PRINCIPAL_SOUND = "espera2";
	public static final String CRAHS_SOUND = "golpe";
	public static final String RUN_AVATAR = "caminarPaso";
}