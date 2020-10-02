/**
 *@author Locket-Man ORG
 *@proyect Locket-Man
 *@proyectClass Locket-Man
 *@Date 8 sept. 2020
 *@authorClass Esteban Novoa
	 
 */
package backgroundGame;

import javax.swing.JFrame;


/**
 * @author Esteban
 *
 */
public class JFrameBackGround extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6765053264398194750L;
	private JPanelBackground jPanelBackground;
	@SuppressWarnings("unused")
	private JLabelTimer jLabelTimer;
	
	public JFrameBackGround(String pathImageBackground) throws InterruptedException {
		super();
		jPanelBackground = new JPanelBackground(pathImageBackground);
		init();
	}
	
	private void init() throws InterruptedException {
		this.setSize(jPanelBackground.getWidth(),jPanelBackground.getHeight());
		this.add(jPanelBackground);		
		this.setLocationRelativeTo(null);
		this.setVisible(true);		
		
	}
	
	@SuppressWarnings("unused")
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
