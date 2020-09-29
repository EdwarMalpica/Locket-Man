/**
 *JPanelPerson.java  
 *asdasd
 */
package com.uptc.LockedMan.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.controller.Controller;

/**
 * @author eduar
 *
 */
public class JPanelPerson extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8953700619649581763L;
	private JLabelPerson jLabelPerson;
	
	public JPanelPerson(String pathImage) {
		super();
		init(pathImage);
	}

	/**
	 * 
	 */
	private void init(String pathImage) {
		this.addKeyListener(Controller.getInstanceOf());
		this.setFocusable(true);
		this.setBackground(Constants.COLOR_TEST);
		jLabelPerson = new JLabelPerson(pathImage);
		this.add(jLabelPerson);
		jLabelPerson.setLocation(jLabelPerson.getX(),jLabelPerson.getY()+500 );
		
		//jLabelPerson.setBounds(0,0, 110, 110);
	}
	
	public void setIncrement(int increment) {
		jLabelPerson.setIncrement(increment);
	}
	
	public void updateLocationPerson() {
		jLabelPerson.setLocation(jLabelPerson.getX(),jLabelPerson.getY()+500 );
	}
	
	public void movePersonStay() {
		jLabelPerson.animationStay();
		
	}
	
	public void movePersonJumpRight() {
		jLabelPerson.animationJumpRight();
		for(int i = 0; i<12;i++) {
			int y = jLabelPerson.getY()-5;
			jLabelPerson.setLocation(jLabelPerson.getX(), y);
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		for(int i = 12; i>0;i--) {
			int y = jLabelPerson.getY()+5;
			jLabelPerson.setLocation(jLabelPerson.getX(), y);
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		movePersonStay();
	}
	
	public void movePersonRight() {
		jLabelPerson.animationRight();
		int x = jLabelPerson.getX() +10;
		jLabelPerson.setLocation(x , jLabelPerson.getY()+1);
	}
	public void movePersonRightJump() {
		
		int x = jLabelPerson.getX() +10;
		jLabelPerson.setLocation(x , jLabelPerson.getY()+1);
	}
	public void movePersonLeft() {
		
		jLabelPerson.animationLeft();
		int x = jLabelPerson.getX() -10;
		jLabelPerson.setLocation(x , jLabelPerson.getY()+1);
	}
	public void movePersonLeftJump() {
		int x = jLabelPerson.getX() -10;
		jLabelPerson.setLocation(x , jLabelPerson.getY()+1);
	}
}
