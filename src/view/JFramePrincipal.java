/**
 *JFramePrincipal.java  
 *asdasd
 */
package view;


import java.awt.Rectangle;


import javax.swing.JFrame;

import constants.Constants;
import model.Level;

/**
 * @author eduar
 *
 */
public class JFramePrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8258063661712919317L;
//	Image img;
//	Thread hilo;
//	int incremento = 0;
//	BufferedImage bi;
	
	private JPanelPerson jPanelPerson;
	
	
	
	/*
	 * Constructor que permite inicializar un frame con caracteristicas base
	 */
	public JFramePrincipal() {
		super();
		init();
	}
	
	

	/**
	 * 
	 */
	private void init() {
		this.setSize(Constants.SCREEN_FRAME);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
//		this.setOpacity(1);
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		hilo = new Thread(this);
//		img = toolkit.getImage(getClass().getResource("/resources/person1.png"));
//		bi = new BufferedImage(Constants.SCREEN_FRAME.width,Constants.SCREEN_FRAME.height, BufferedImage.TYPE_INT_RGB);
//		hilo.start();
		starAnimation(Constants.PATH_IMAGE_PERSON_STAY);
	}

	/*
	 * Metodo encargado de iniciar la animacion del personaje
	 */
	public void starAnimation(String pathImage) {
		jPanelPerson = new JPanelPerson(pathImage);
		this.add(jPanelPerson);
		 
		
	}
	
	public void setIncrement(int increment) {
		jPanelPerson.setIncrement(increment);
	}

	public void movePersonStay() {
		jPanelPerson.movePersonStay();
	}
	
	public void movePersonRight(int y) {
		jPanelPerson.movePersonRight(y);
	}
	public void movePersonLeft(int y) {
		jPanelPerson.movePersonLeft(y);
	}
	public void movePersonRightNoCollision() {
		jPanelPerson.movePersonRightNoCollision();
	}
	public void movePersonLeftNoCollison() {
		jPanelPerson.movePersonLeftNoCollision();
	}
	public void movePersonRightJump() {
		jPanelPerson.movePersonRightJump();
	}
	public void movePersonLeftJump() {
		jPanelPerson.movePersonLeftJump();
	}
	public void movePersonJumpRight() {
		jPanelPerson.movePersonJump();
	}
	public void movePersonDown() {
		jPanelPerson.movePersonDown();
	}
	public boolean colisionWithPerson() {
		return jPanelPerson.colisionWithPerson();
	}
	public boolean colisionWithBox() {
		return jPanelPerson.getColisionWhitBox();
	}
	
	public Rectangle getRectangleEnvironment() {
		return jPanelPerson.getCurrentRectangle();
	}
	
	public int getWidthPerson() {
		 return jPanelPerson.getWidthPerson();
	 }
	public void takeBox() {
		jPanelPerson.takeBox();
	}
	public void dropBox() {
		jPanelPerson.dropBox();
	}
	
	public void setlevelOne(Level level) {
		jPanelPerson.drawLevel(level);
	}
	public void setlevelTwo(Level level) {
		jPanelPerson.drawLevel(level);
	}
	public void setlevelTree(Level level) {
		jPanelPerson.drawLevel(level);
	}
	
//	@Override 
//	public void paint(Graphics g) {
//		Graphics2D g2 ;
//		g.drawImage(bi, 0, 0, this);
//		g2 = bi.createGraphics();
//		g2.fillRect(0, 0, getWidth(), getHeight());
//		int mx = (incremento%3)*110;
//		
//		int my = (incremento/4)*110;
//		System.out.println();
//		g2.drawImage(img, 200, 200, 200+110, 200+110,mx,my,mx+110,my+110, this);
//		repaint();
//	}
//	@Override
//	public void run() {
//		while(true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Bloque catch generado autom�ticamente
//				e.printStackTrace();
//			}
//			incremento ++;
//			if(incremento > 12) {
//				incremento = 0;
//			}
//		}
//	}
}
