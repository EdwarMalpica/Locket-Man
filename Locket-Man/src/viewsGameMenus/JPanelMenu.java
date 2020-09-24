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

	public JPanelMenu(Container container,String textButton) {
		super();
		this.container = container;
		init(textButton);	
	}
	

	private void init(String textButton) {			
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setSize(container.getWidth(), container.getHeight());
		this.setOpaque(false);
		setButton(textButton);
	}
	
	public void setButton(String textButton) {
		this.add(new JButtonOption(this, textButton));	
	}


	/**
	 * @return the container
	 */
	public Container getContainer() {
		return container;
	}


	
	

}
