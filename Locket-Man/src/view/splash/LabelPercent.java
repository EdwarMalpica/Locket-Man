package view.splash;

import javax.swing.JLabel;
import constants.Constants;
import fonts.FontAdd;

public class LabelPercent extends JLabel{
	
	private FontAdd font;

	/**
	 * constructor sencillo que a�ade un label 
	 */
	public LabelPercent() {
		init();
	}
	
	/**
	 * sobrecarga del constructor dondonde se le puede a�adir texto al label
	 * @param text texto a a�adir
	 * @param size tama�o que va a tener el label
	 */
	public LabelPercent(String text, int size) {
		font = new FontAdd();
		this.setFont(font.fuente(Constants.PATH_FONT_MARIO, 3, size));
		this.setText(text);
	}
	
	public void init() {
		font = new FontAdd();
		this.setBorder(null);
		this.setFont(font.fuente(Constants.PATH_FONT_MARIO, 3, Constants.SIZE_FONT_MARIO_PERCENT));
	}
	
	/**
	 * actualiza el texto del label
	 * @param text
	 */
	public void upDateText(String text) {
		this.setText(text);
	}
	
	/**
	 * actualiza este texto
	 * @param text
	 */
	public void setTextThis(String text) {
		this.setText(text);
	}
}
