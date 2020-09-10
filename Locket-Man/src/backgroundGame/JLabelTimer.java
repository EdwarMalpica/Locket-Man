/**
 *@author Locket-Man ORG
 *@proyect Locket-Man
 *@proyectClass Locket-Man
 *@Date 8 sept. 2020
 *@authorClass Esteban Novoa
	 
 */
package backgroundGame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import utilities.FontGame;

/**
 * @author Esteban
 *
 */
public class JLabelTimer extends JLabel{
	
	private int minutes,seconds,milseconds; 

	public JLabelTimer() {
		super("",SwingConstants.CENTER);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		init();
		
	}
	private void init() {
		this.setBounds(969,53,273,80);		
		this.setBorder(BorderFactory.createLineBorder(Color.red));
		this.setBackground(Color.white);
		this.setOpaque(true);
		this.setFont(new FontGame().loadTimerFont("src/resources/digital-7 (italic).ttf",12));
	}
	
	public void setTimerFuction() throws InterruptedException {		
		while (minutes != 60) {
				++milseconds;
			if (milseconds == 60) {
				milseconds = 0;
				++seconds;
			}
			if (seconds == 60) {
				seconds = 0;
				++minutes;
			}
			Thread.sleep(10);
			String a = minutes+":"+seconds+":"+milseconds;
			this.setText(a);;
			
		}		
		
	}
	
	
	

}
