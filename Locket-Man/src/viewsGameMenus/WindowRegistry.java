package viewsGameMenus;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utilities.PropertiesManager;

public class WindowRegistry extends WindowGame{

	
	public WindowRegistry() {
		super();
		init();
	}
	@Override
	protected void init() {
		super.init();
		jPanel.setLayout(new GridLayout(6,0));
		setJLabel(PropertiesManager.getPropertiesManager().getBtnRegistryMessage(),FlowLayout.CENTER);
		setJLabel(PropertiesManager.getPropertiesManager().getTxtName(),FlowLayout.LEFT);
		setTextField();
		setButtons();
		
	}

	
	@Override
	public void verifyCorrectSize() {
		this.setSize(dimension.width/3,dimension.height/2);
		
	}
	
	private void setJLabel(String text,int orientation) {
		JPanel panel = new JPanel(new FlowLayout(orientation));
		JLabelTextGame jLabelTextGame = new JLabelTextGame();
		jLabelTextGame.setAlignmentX(CENTER_ALIGNMENT);
		jLabelTextGame.setText(text);		
		panel.add(jLabelTextGame);
		panel.setOpaque(false);
		jPanel.add(panel);
	}

	private void setTextField() {
		JPanel panel = new JPanel();
		JTextField jTextField = new JTextField();
		jTextField.setPreferredSize(new Dimension(this.getWidth()/2,40));
		jTextField.setEnabled(true);
		jTextField.setFocusable(true);
		panel.add(jTextField);
		panel.setOpaque(false);
		jPanel.add(panel);
	}
	
	private void setButtons() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(new JButtonOption(jPanel, "Volver", "btnReturn"));
		panel.add(new JButtonOption(jPanel, "Aceptar", "btnAcept"));
		panel.setOpaque(false);
		jPanel.add(panel);
	}
}
