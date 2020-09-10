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

/**
 * @author Esteban
 *
 */
public class JFrameBackGroundLevel1 extends JFrame{

	private JPanelBackground jPanelBackground;
	
	public JFrameBackGroundLevel1() throws InterruptedException {
		super();
		jPanelBackground = new JPanelBackground("src/resources/FondoNivel1V1.jpg");
		init();
	}
	private void init() throws InterruptedException {
		this.setSize(jPanelBackground.getWidth(),jPanelBackground.getHeight());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(jPanelBackground);		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		jPanelBackground.getTimer().setTimerFuction();
		
	}

	public static void main(String[] args) throws InterruptedException {
		JFrameBackGroundLevel1 a = new JFrameBackGroundLevel1();
		
	}
}
