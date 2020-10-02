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
	@SuppressWarnings("unused")
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
        this.setSize(new Dimension(1300,740));
        jLabelTimer = new JLabelTimer();
        this.add(jLabelTimer);        
	}	
	
	@Override
    public void paint(Graphics graphics) {
		//Nivel 2
//	    graphics.fillRect(0,600,300,600);
//	    graphics.fillRect(300,600,300,600);
//	    graphics.fillRect(600,500,300,600);
//	    graphics.fillRect(900,400,600,600);
//	    graphics.fillRect(400,300,400,50);
//	    graphics.fillRect(500,200,80,100);
//	    graphics.fillRect(0,200,300,50);
//	    graphics.fillRect(350,70,300,50);
//	    graphics.fillRect(800,100,300,50);
//	    graphics.fillRect(950,30,30,70);
	    
	   // Nivel 3
//		graphics.fillRect(0,600,1300,600);
//		graphics.fillRect(500,500,50,100);
//		graphics.fillRect(800,470,80,130);
//		// Piso
//		graphics.fillRect(450,350,300,50);
//		graphics.fillRect(450,250,50,100);
//		graphics.fillRect(150,250,200,50);
//		graphics.fillRect(800,150,300,50);
//		graphics.fillRect(0,100,200,50);
//		graphics.setColor(Color.BLUE);
//		graphics.fillRect(0,20,50,70); // Puerta 3
		//Nivel 1
//		graphics.fillRect(0,500,300,600);
//		graphics.fillRect(300,600,300,600);
//		graphics.fillRect(500,500,300,600);
//		graphics.fillRect(800,600,300,600);
//		graphics.fillRect(1000,500,300,600);
//		//Piso
//		graphics.fillRect(150,370,900,50);
//		graphics.fillRect(240,270,50,100);
//		graphics.fillRect(400,220,200,50);
//		graphics.fillRect(700,150,200,50);
//		graphics.fillRect(0,70,600,50);
		//graphics.fillRect(100,20,20,70); Puerta
	    
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
