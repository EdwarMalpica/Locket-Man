package viewsGameMenus;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import backgroundGame.ConstanBackground;

public class JPanelHeaderMenu extends JPanel{

	private JButton jButtonClose;
	private JLabelTextGame jLabelHeaderText;
	private Container container;
	
	public JPanelHeaderMenu(String headerText,Container container) {
		super();
		jLabelHeaderText = new JLabelTextGame();
		this.container = container;
		init();
		jLabelProperties(headerText);
	}

	private void init() {
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	}
	
	
	private void jLabelProperties(String headerText) {
		jLabelHeaderText.setText(headerText);
		this.add(jLabelHeaderText);

	}
	
	
	
	

}
