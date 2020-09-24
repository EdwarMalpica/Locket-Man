package com.uptc.LockedMan.constants;

import java.awt.*;

public class Constants {

	//Dimensiones
	public static final Dimension DIMENSION_WINDOW_DEFAULT = Toolkit.getDefaultToolkit().getScreenSize();
	public static final Dimension DIMENSION_LABEL_FONT_MARIO_PERCENT = new Dimension(230, 55);
	public static final Dimension DIMENSION_LABEL_AVATAR = new Dimension(80, 80);
	public static final Dimension DIMENSION_LABEL_LETTER_A = new Dimension(47, 45);
	public static final Dimension DIMENSION_LABEL_VERSION = new Dimension(180, 30);
	
	public static final Dimension SCREEN_FRAME = new Dimension(800, 600);
	
	//Localizaciones
	public static final Point POINT_LABEL_FONT_MARIO = new Point(30, 190);
	public static final Point POINT_LABEL_AVATAR = new Point(16, 48);
	public static final Point POINT_LETTER_A = new Point(200, 65);
	public static final Point POINT_NAME_PLAY = new Point(0, 125);
	public static final Point POINT_LABEL_VERSION = new Point(285, 220);
	
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
	public static final String PATH_BACKGROUND_SPLASH = "../resources/background8.jpg";
	public static final String PATH_AVATAR_IMAGE = "../resources/anim1.png";
	public static final String PATH_GIFT_1 = "../resources/giftBackground.gif";
	public static final String PATH_SPRITE_RUN = "../resources/SpriteAvatar.png";
	public static final String PATH_ARRAY_ANIM = "../resources/anim1/avatarYellow";
	public static final String PATH_DIRECTORY_SOUNDS = "../traks/";
	
	//Nombres de Fuentes...
	public static final String PATH_FONT_MARIO = "Mario-Kart-DS.ttf";
	
	//Tamaños de fuentes...
	public static final int SIZE_FONT_MARIO_PERCENT = 100;
	public static final int SIZE_WELLCOME_MESSAGE = 62;
	public static final int SIZE_FONT_VERSION = 28;
	
	//formatos
	public static final String FORMAT_PNG = ".png";
	public static final String FORMAT_WAV = ".wav";
}