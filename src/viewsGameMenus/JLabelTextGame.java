package viewsGameMenus;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;

import backgroundGame.ConstanBackground;

public class JLabelTextGame extends JLabel {

	/**
	 * 
	 */

	private static final long serialVersionUID = -3986428497904048599L;
	public JLabelTextGame() {
		super();
		init();
	}
	private void init() {

		setNormalFont();

	}
	public void setSizeComponent(Component component) {
		this.setPreferredSize(new Dimension(component.getWidth(),30));
	}
	

	public void setAnimationByFontSize() {
		this.setFont(ConstanBackground.SUMMER_FONT_SMALLSIZE_2);
		this.setForeground(Color.white);
	}
	
	public void setNormalFont() {
		this.setFont(ConstanBackground.SUMMER_FONT_1);
		this.setForeground(Color.white);
	}
	


}
