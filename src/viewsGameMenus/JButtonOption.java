package viewsGameMenus;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import backgroundGame.ConstanBackground;
import controllers.ControllerJButtonOptions;


public class JButtonOption extends JButton{

	/**
	 * 
	 */

	private static final long serialVersionUID = 1639267027208144358L;
	private Container container;
	private ImageIcon img;
	private ControllerJButtonOptions controllerJButtonOptions;
	private float opacity = 0.5f;
	/**
	 * 
	 * @param dimension Tama�o del contenedor
	 * @param buttonText Texto del boton
	 */

	private JLabelTextGame jLabelTextButton;

	public JButtonOption(Container container, String buttonText, String buttonName) {
		super();
		jLabelTextButton = new JLabelTextGame();
		jLabelTextButton.setText(buttonText);
		this.container = container;
		this.setName(buttonName);
		init();
		
	}
	

	private void init() {
		controllerJButtonOptions = ControllerJButtonOptions.getControllerJButtonOptions();
		this.setLayout(new FlowLayout(FlowLayout.CENTER));		
		img = new ImageIcon(getClass().getResource(ConstanBackground.PATH_IMAGE_BACKGROUND_BUTTONS).getPath());
		this.setIcon(img);		
		this.add(jLabelTextButton);
		this.setBorder(BorderFactory.createLineBorder(Color.white,3,true));
		this.addMouseListener(controllerJButtonOptions);
		this.setLocation(0,100);
	}

	/**
	 * Para el efecto hover en los botones determinamos que tan opaco quederemos
	 * @param opacity
	 */
	public void setOpacity(float opacity) {
		this.opacity = opacity;
		repaint();
	}
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// Pasamos nuestra variable "opacity" al metodo
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		// Usamos el metodo paintComponent del padre con "super"

		super.paintComponent(g2);
	}

	/**
	 * Establece el tama�o apto para cualquiera de los menus de opciones
	 */
	public void setSizeMainMenu() {
		this.setPreferredSize(new Dimension(container.getWidth()-(container.getWidth()/4),container.getHeight()/6));
	}
	/**
	 * Establece el tama�o apto para cualquiera de los menus normales
	 */
	public void setSizeNormalMenu() {
		this.setPreferredSize(new Dimension(container.getWidth()/2,container.getHeight()/3));
	}

	public void efectHover(float index, float range, float cont, int sleep, boolean event) {
		new Thread(() -> {
			for (float i = index; (event) ? i <= range : i >= range; i = (event) ? i + cont : i - cont) {
				this.setOpacity(i);
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
				}

			}
		}).start();
	}


	/**
	 * @return the container
	 */



	/**
	 * @return the jLabelTextButton
	 */
	public JLabelTextGame getjLabelTextButton() {
		return jLabelTextButton;
 

	}


	
	
	
	
	
	
	
	


}


