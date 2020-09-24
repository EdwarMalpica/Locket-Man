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
import javax.swing.border.TitledBorder;

import utilities.FontGame;

/**
 * @author Esteban
 *
 */
public class JLabelTimer extends JLabel{
	
	private int minutes,seconds,milseconds; 
	

	public JLabelTimer() {
		super(ConstanBackground.START_VALUE_TIMER,SwingConstants.CENTER);		
		init();
		
	}
	
	private void init() {
	    int[] bounds = ConstanBackground.BOUNDS_TIMER;
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
		this.setBorder(BorderFactory.createRaisedBevelBorder());
		setTitle();
		this.setFont(ConstanBackground.TIMER_FONT);
	}
	
	private void setTitle() {
		this.setBorder(BorderFactory.createTitledBorder(this.getBorder(),ConstanBackground.TIMER_NAME,TitledBorder.CENTER,TitledBorder.TOP,
				ConstanBackground.TIMER_FONT_1,Color.white));
		
	}

	
	
	public void setTimerFuction() throws InterruptedException {	
		String time = "";
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
			time = minutes+":"+seconds;
			this.setText(time);;
			
		}		
		
	}
	
	
	

}
