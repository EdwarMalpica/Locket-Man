/**
 *Constants.java  
 *asdasd
 */
package constants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;

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
	//Dimensiones
	public static final Dimension DIMENSION_WINDOW_DEFAULT = Toolkit.getDefaultToolkit().getScreenSize();
	public static final Dimension DIMENSION_LABEL_FONT_MARIO_PERCENT = new Dimension(230, 55);
	public static final Dimension DIMENSION_LABEL_AVATAR = new Dimension(80, 80);
	public static final Dimension DIMENSION_LABEL_LETTER_A = new Dimension(47, 45);
	public static final Dimension DIMENSION_LABEL_VERSION = new Dimension(180, 30);
	public static final Dimension DIMENSION_BUTTON_PLAY = new Dimension(128, 128);
	public static final Dimension DIMENSION_BUTTON_CONFIG = new Dimension(64, 64);
	public static final Dimension DIMENSION_PANEL_CONFIG = new Dimension(455, 200);
	public static final Dimension DIMENSION_BUTTON_CLOSE = new Dimension(32, 32);
	public static final Dimension DIMENSION_LABEL_ABOUT = new Dimension(150, 40);
	public static final Dimension DIMENSION_LABEL_INIT_PLAY = new Dimension(180, 42);
	public static final Dimension DIMENSION_LABEL_CONFIG = new Dimension(70, 30);
	
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
	public static final int SIZE_FONT_PLAY = 40;
	public static final int SIZE_FONT_OPTIONS = 20;
	
	//Mensajes
	public static final String MESSAGE_WELCOME = "BIENVENIDO";
	public static final String ADVANCE = "avanzar";
	public static final String BACK = "retroceder";
	public static final String UP_OR_DOWN = "eje_y";
	public static final String MOVING_SIDE = "eje_x";
	public static final String LETTER_A_MESSAGE = "A";
	public static final String NAME_PLAY = "LOCKED-MAN";
	public static final String VERSION_PLAY = "version 1.0";
	public static final String MESSAGE_OPTIONS = "OPCIONES";
	public static final String MESSAGE_PLAY_GAME = "JUGAR";
	public static final String MESSAGE_ABOUT_US = "ACERCA DE";
	
	//Direcciones 
	public static final String PATH_BACKGROUND_SPLASH = "../resources/background8.jpg";
	public static final String PATH_AVATAR_IMAG = "../resources/anim1.png";
	//public static final String PATH_GIFT_1 = "../resources/giftMolin.gif";
	public static final String PATH_SPRITE_RU = "../resources/SpriteAvatar.png";
	public static final String PATH_ARRAY_ANIM = "../resources/anim1/avatarYellow";
	public static final String PATH_DIRECTORY_SOUNDS = "../resources/tracks/";
	public static final String PATH_BACKGROUND_REGISTRY = "../resources/font1.png";
	public static final String PATH_BUTTON_PLAY = "../resources/buttonPlay.png";
	public static final String PATH_BUTTON_CONFIG = "../resources/buttonConfig.png";
	public static final String PATH_BUTTON_ABOUT = "../resources/about.png";
	public static final String PATH_BUTTON_CLOSE = "../resources/btnClose.png";
	public static final String PATH_BUTTON_LANGUAGE_ES = "../resources/español.png";
	public static final String PATH_BUTTON_LANGUAGE_EN = "../resources/ingles.png";
	public static final String PATH_LABEL_SOUND = "../resources/sonido.png";
	public static final String PATH_BUTTON_CLOSE_BLUE = "../resources/back.png";
	public static final String PATH_FILE_ABOUT_US = "../resources/aboutUsES.txt";
	
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
	public static final String SOUND_REGIST = "electronicFantasy";
	public static final String CLICK_SOUND = "click";
	public static final String UP_WINDOW = "up";
}

