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
	private static final long serialVersionUID = -3198501953942610666L;
	public JLabelTextGame() {
		super();
		init();
	}
	private void init() {
		this.setFont(ConstanBackground.SUMMER_FONT_1);
		this.setForeground(Color.white);
	}
	public void setSizeComponent(Component component) {
		this.setPreferredSize(new Dimension(component.getWidth(),30));
	}
	

}
