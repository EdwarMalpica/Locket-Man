/**
 *JPanelPerson.java  
 *asdasd
 */
package com.uptc.LockedMan.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

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
	private Rectangle[] levelFormat;
	private Rectangle currentRectangle;
	
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
		
		
		levelFormat = new Rectangle[] {
			new Rectangle(0,480,350,240),
			new Rectangle(347,585,207,235),
			new Rectangle(550,483,280,235),
			new Rectangle(820,577,223,123),
			new Rectangle(1043,493,280,205)
			
		};
		//addRectangle();
		
		//jLabelPerson.setBounds(0,0, 110, 110);
	}
	
//	public void addRectangle() {
//		for (Rectangle rectangle : levelFormat) {
//			getGraphics().fillRect(rectangle.x,rectangle.y, rectangle.width, rectangle.height);
//		}
//	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Rectangle rectangle : levelFormat) {
			g.fillRect(rectangle.x,rectangle.y, rectangle.width, rectangle.height);
		}
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
		jLabelPerson.setLocation(x , jLabelPerson.getY());
	}
	public void movePersonRightJump() {
		
		int x = jLabelPerson.getX() +10;
		jLabelPerson.setLocation(x , jLabelPerson.getY()+1);
	}
	public void movePersonLeft() {
		
		jLabelPerson.animationLeft();
		int x = jLabelPerson.getX() -10;
		jLabelPerson.setLocation(x , jLabelPerson.getY());
	}
	public void movePersonLeftJump() {
		int x = jLabelPerson.getX() -10;
		jLabelPerson.setLocation(x , jLabelPerson.getY()+1);
	}
	public void movePersonDown() {
		int y = jLabelPerson.getY() +10;
		jLabelPerson.setLocation(jLabelPerson.getX(), y);
	}
	
	public boolean colisionWithPerson() {
		boolean colision = false;
		for (Rectangle rectangle : levelFormat) {
			if(getRectanglePerson().intersects(rectangle)) {
				colision = true;
				this.currentRectangle = rectangle;
			}
		}
		return colision;
	}
	public Rectangle getRectanglePerson() {
		return jLabelPerson.getBounds();
	}
	
//	public void getRectangleEnvironment() {
//		for(int i =0 ;i< levelFormat.length;i++) {
//			if(colisionWithPerson(levelFormat[i])) {
//				this.currentRectangle = levelFormat[i];
//			}
//		}
//	}
	
	public Rectangle getCurrentRectangle() {
		return currentRectangle;
	}
}
