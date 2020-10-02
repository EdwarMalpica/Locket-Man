package viewsGameMenus;


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class JPanelMenu extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6978318803663483691L;
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


	


	
	
}
