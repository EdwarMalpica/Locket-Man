/**
 *JPanelPerson.java  
 *asdasd
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JPanel;

import controller.Controller;
import model.Level;

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
	//private Rectangle[] levelFormat;
	private ArrayList<Rectangle> levelFormat;
	private Rectangle currentRectangle;
	private Rectangle box;
	
	private Rectangle door;
	
	public JPanelPerson(String pathImage) {
		super();
		init(pathImage);
	}

	/**
	 * 
	 */
	private void init(String pathImage) {
		
		this.levelFormat = new ArrayList<Rectangle>();
		door = null;
		this.addKeyListener(Controller.getInstanceOf());
		this.setFocusable(true);
		this.setBackground(Color.green);
		//this.setOpaque(true);
		
		jLabelPerson = new JLabelPerson(pathImage);
		this.add(jLabelPerson);
		//this.jLabelPerson.setLocation(jLabelPerson.getX()+500,jLabelPerson.getY()+500);
		
		
		
//		levelFormat = new Rectangle[] {
//			new Rectangle(0,480,350,240),
//			new Rectangle(347,585,207,235),
//			new Rectangle(550,483,280,235),
//			new Rectangle(820,577,223,123),
//			new Rectangle(1043,493,280,205)
//			
//		};
		box = new Rectangle(580,433,50,50);
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
		g.setColor(Color.YELLOW);
		g.fillRect(box.x,box.y, box.width,box.height);
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
	
	public void movePersonJump() {
		jLabelPerson.animationJump();
		for(int i = 0; i<24;i++) {
			int y = jLabelPerson.getY()-5;
			jLabelPerson.setLocation(jLabelPerson.getX(), y);
			try {
				Thread.sleep(13);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		for(int i = 24; i>0;i--) {
			int y = jLabelPerson.getY()+5;
			jLabelPerson.setLocation(jLabelPerson.getX(), y);
			try {
				Thread.sleep(13);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		movePersonStay();
	}
	
	public void drawRectLevel(Rectangle rec) {
		this.getGraphics().fillRect(rec.x,rec.y, rec.width, rec.height);
	}
	
	public void drawLevel(Level level) {
		
		ArrayList<Rectangle> floor= level.getFloor();
		ArrayList<Rectangle> obstacle= level.getObstacles();
		for (Rectangle rectangle : floor) {
			levelFormat.add(rectangle);
			this.drawRectLevel(rectangle);
		}
		for (Rectangle rectangle : obstacle) {
			levelFormat.add(rectangle);
			this.drawRectLevel(rectangle);
		}
		
		
	}
	
	public void movePersonRight(int y) {
		jLabelPerson.animationRight();
		int x = jLabelPerson.getX() +10;
		jLabelPerson.setLocation(x , y-jLabelPerson.getHeight());
	}
	public void movePersonRightNoCollision() {
		jLabelPerson.animationRight();
		int x = jLabelPerson.getX() +10;
		jLabelPerson.setLocation(x , jLabelPerson.getY());
	}
	public void movePersonRightJump() {
		
		int x = jLabelPerson.getX() +10;
		jLabelPerson.setLocation(x , jLabelPerson.getY());
	}
	
	
	public void movePersonLeft(int y) {
		
		jLabelPerson.animationLeft();
		int x = jLabelPerson.getX() -10;
		jLabelPerson.setLocation(x , y-jLabelPerson.getHeight());
	}
	public void movePersonLeftNoCollision() {
		jLabelPerson.animationLeft();
		int x = jLabelPerson.getX() -10;
		jLabelPerson.setLocation(x , jLabelPerson.getY());
	}
	public void movePersonLeftJump() {
		int x = jLabelPerson.getX() -10;
		jLabelPerson.setLocation(x , jLabelPerson.getY()+1);
	}
	
	
	public void movePersonDown() {
		
		int y = jLabelPerson.getY() +2;
		jLabelPerson.setLocation(jLabelPerson.getX(), y);
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void takeBox() {
		box.setLocation(jLabelPerson.getX() +(box.width/2) ,jLabelPerson.getY()-(box.height/2) );
		this.repaint();
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
	}
	public void dropBox() {
		box.setLocation(jLabelPerson.getX() + (jLabelPerson.getWidth()-box.width)/2, +jLabelPerson.getY()+jLabelPerson.getHeight()-box.height );
		repaint();
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
	public boolean getColisionWhitBox() {
		boolean colision = false;
		if(box.intersects( jLabelPerson.getBounds())) {
			colision = true;
		}
		return colision;
	}
	public boolean getColisionWhitDoor() {
		boolean colision = false;
		if(door.intersects( jLabelPerson.getBounds())) {
			colision = true;
		}
		return colision;
	}
//	public boolean colisionWithPersonLat() {
//		int x  = jLabelPerson.getX();
//		int y = jLabelPerson.getY();
//		
//		int marginLeft = -6;
//		int marginRight = 18;
//		int marginTop = -4;
//		int marginBottom = 31;
//		
//		
//		int borderLeft = (x + marginRight)/jLabelPerson.getWidthImg();
//		int borderRight = (x+marginRight+marginLeft)/jLabelPerson.getWidthImg();
//		int borderTop = (y + marginBottom)/jLabelPerson.getWidthImg();
//		int borderBotton = (y + marginBottom+marginTop)/getWidthPerson();
//		
//		
//		return false;
//	}
	public Rectangle getRectanglePerson() {
		return jLabelPerson.getBounds();
	}
	 public int getWidthPerson() {
		 return jLabelPerson.getWidth();
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
