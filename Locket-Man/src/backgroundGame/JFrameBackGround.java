/**
 *@author Locket-Man ORG
 *@proyect Locket-Man
 *@proyectClass Locket-Man
 *@Date 8 sept. 2020
 *@authorClass Esteban Novoa
	 
 */
package backgroundGame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import backgroundGame.JPanelBackground;
import viewsGameMenus.WindowMenu;

/**
 * @author Esteban
 *
 */
public class JFrameBackGround extends JFrame{

	private JPanelBackground jPanelBackground;
	private JLabelTimer jLabelTimer;
	
	public JFrameBackGround(String pathImageBackground) throws InterruptedException {
		super();
		jPanelBackground = new JPanelBackground(pathImageBackground);
		init();
	}
	
	private void init() throws InterruptedException {
		this.setSize(jPanelBackground.getWidth(),jPanelBackground.getHeight());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(jPanelBackground);		
		this.setLocationRelativeTo(null);
		this.setVisible(true);		
		
	}
	
	private void startTimer() {
		try {
			jPanelBackground.getTimer().setTimerFuction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @return the jPanelBackground
	 */
	public JPanelBackground getjPanelBackground() {
		return jPanelBackground;
	}
	
	
	

	
}
