package viewsGameMenus;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelResult extends JPanel {
	
	private JLabel jLabelName;

	public JPanelResult(String text) {
		super();
		jLabelName = new JLabelTextGame();
		jLabelName.setText(text);
		init();
	}
	
	private void init() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setOpaque(false);
		this.add(jLabelName);
		this.setBorder(BorderFactory.createLineBorder(Color.white));
	}
	
}
