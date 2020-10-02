/**
 *@author Locket-Man ORG
 *@proyect Locket-Man
 *@proyectClass Locket-Man
 *@Date 8 sept. 2020
 *@authorClass Esteban Novoa
	 
 */
package backgroundGame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;


import javax.swing.ImageIcon;

import javax.swing.JPanel;

/**
 * @author Esteban
 *
 */
public class JPanelBackground extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1687133441495429963L;
	private ImageIcon imageBackgound; //Esta imagen sera el paisajes
	@SuppressWarnings("unused")
	private JPanel jPanelBackground;
	private JLabelTimer jLabelTimer;
	
	/**
	 * @return the timer
	 */
	public JLabelTimer getTimer() {
		return jLabelTimer;
	}

	

	public JPanelBackground(String pathImage) {
		super();
		this.setLayout(null);
		imageBackgound = new ImageIcon(pathImage);
		init();
	}
		
	private void init() {		
        this.setSize(new Dimension(imageBackgound.getIconWidth(),imageBackgound.getIconHeight()));
        System.out.println(imageBackgound.getIconWidth()+"  "+imageBackgound.getIconHeight());
        jLabelTimer = new JLabelTimer();
        this.add(jLabelTimer);        
	}	
	
	@Override
    public void paint(Graphics graphics){
	    Image imageBackGround = imageBackgound.getImage();        
	    graphics.drawImage(imageBackGround,0,0,this.getWidth(),this.getHeight(), this);
	    this.setOpaque(false);
	    super.paint(graphics);
    }


	

	/**
	 * @return the jLabelTimer
	 */
	public JLabelTimer getjLabelTimer() {
		return jLabelTimer;
	}



	
	
	

}
