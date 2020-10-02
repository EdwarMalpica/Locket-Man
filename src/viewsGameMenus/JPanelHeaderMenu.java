package viewsGameMenus;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;



public class JPanelHeaderMenu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8015722192506452816L;
	@SuppressWarnings("unused")
	private JButton jButtonClose;
	private JLabelTextGame jLabelHeaderText;
	@SuppressWarnings("unused")
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
