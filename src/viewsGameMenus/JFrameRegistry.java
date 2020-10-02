package viewsGameMenus;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import backgroundGame.ConstanBackground;
import utilities.PropertiesManager;

public class JFrameRegistry extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1400126741927660865L;
	private JPanel jPanel;
	private Dimension dimension;
	private JTextField jTextField;
	/**
	 * @return the jTextField
	 */
	public JTextField getjTextField() {
		return jTextField;
	}

	/**
	 * @param jTextField the jTextField to set
	 */
	public void setjTextField(JTextField jTextField) {
		this.jTextField = jTextField;
	}

	private ImageIcon img;
	
	public JFrameRegistry() {
		super();
		jPanel = new JPanelPrueba();		
		init();
	}
	
	private void init() {
		dimension = Toolkit.getDefaultToolkit().getScreenSize();
		verifyCorrectSize();
		setJLabel(PropertiesManager.getPropertiesManager().getBtnRegistryMessage(),FlowLayout.CENTER);
		setJLabel(PropertiesManager.getPropertiesManager().getTxtName(),FlowLayout.LEFT);
		setTextField();
		jPanel.setLayout(new GridLayout(4,0));
		setPropertiesWindow();
		setButtons();
		this.add(jPanel);
		this.add(new JPanelPrueba());
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
	}
	
	public void setPropertiesWindow() {
		img = new ImageIcon(getClass().getResource(ConstanBackground.PATH_IMAGE_BACKGROUND_MENU).getPath());
	}
	
	/**
	 * Pintamos la imagen que pasamos por parametro en el fondo del menu
	 */
	@Override
	public void paint(Graphics graphics) {
		Image imageBackGround = img.getImage();
		graphics.drawImage(imageBackGround, 0, 0,this.getWidth(), this.getHeight(), this);
		jPanel.setOpaque(false);
		super.paint(graphics);
	}
	
	
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
		jTextField = new JTextField();
		jTextField.setPreferredSize(new Dimension(this.getWidth()/2,40));
		jTextField.setFont(ConstanBackground.SUMMER_FONT_SMALLSIZE);
		panel.add(jTextField);
		panel.setOpaque(false);
		jPanel.add(panel);
	}
	
	private void setButtons() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(new JButtonOption(jPanel,PropertiesManager.getPropertiesManager().getBtnReturnMessage(), "btnReturn"));
		panel.add(new JButtonOption(jPanel,PropertiesManager.getPropertiesManager().getBtnAceptMessage(), "btnAccept"));
		panel.setOpaque(false);
		jPanel.add(panel);
	}
}
