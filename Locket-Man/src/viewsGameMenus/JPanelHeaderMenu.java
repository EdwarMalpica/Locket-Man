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
	private JLabel jLabelHeaderText;
	private Container container;
	
	public JPanelHeaderMenu(String headerText,Container container) {
		super();
		jLabelHeaderText = new JLabel(headerText);
		this.container = container;
		init();
	}

	private void init() {
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		jLabelProperties();
		//buttonClose();
		
	}
	
	private void buttonClose() {
		jButtonClose = new JButton();
		jButtonClose.setIcon(new ImageIcon("src/resources/iconClose.png"));
		jButtonClose.setContentAreaFilled(false);
		jButtonClose.setFocusable(false);
		jButtonClose.setBorder(null);
		jButtonClose.setBorder(BorderFactory.createEmptyBorder(0,container.getWidth()/2,0,0));
		this.add(jButtonClose);
		
	}
	private void jLabelProperties() {
		this.add(jLabelHeaderText);
		jLabelHeaderText.setFont(ConstanBackground.SUMMER_FONT_1);
		jLabelHeaderText.setForeground(Color.white);

	}
	
	
	
	

}
