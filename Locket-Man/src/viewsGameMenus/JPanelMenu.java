package viewsGameMenus;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelMenu extends JPanel{
	
	private Container container;

	public JPanelMenu(Container container) {
		super();
		this.container = container;
		init();
	}
	

	private void init() {			
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setSize(container.getWidth(), container.getHeight());
		this.setOpaque(false);
	}
	
	
	public void setButton(String textButton,String buttonName) {
		JButtonOption a = new JButtonOption(this, textButton,buttonName);
		a.setSizeMainMenu();
		this.add(a);	
	}


	/**
	 * @return the container
	 */
	public Container getContainer() {
		return container;
	}


	
	

}
