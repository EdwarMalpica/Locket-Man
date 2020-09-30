/**
 *Controller.java  
 *asdasd
 */
package com.uptc.LockedMan.controller;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.model.ModelManager;
import com.uptc.LockedMan.view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class Controller implements KeyListener {

	private ModelManager manager;
	private JFramePrincipal framePrincipal;
	private static Controller controller;
	private Thread threadJump;
	
	/**
	 * @param manager el manager a establecer
	 */
	public void setManager(ModelManager manager) {
		this.manager = manager;
	}

	/**
	 * @param framePrincipal el framePrincipal a establecer
	 */
	public void setFramePrincipal(JFramePrincipal framePrincipal) {
		this.framePrincipal = framePrincipal;
	}

	private Controller() {
		
	}
	
	public static Controller getInstanceOf() {
		if(controller == null) {
			controller = new Controller();
		}
		return controller;
	}
	public void init() {
		framePrincipal.setVisible(true);
		starAnimation();
	}
	
	
	private void starAnimation() {
		//framePrincipal.starAnimation(Constants.PATH_IMAGE_PERSON);
		manager.starAnimation();
		Thread threadAnimation = new Thread(new ThreadAnimationPerson(framePrincipal,manager));
		threadAnimation.start();
		jumpAnimation();
	}
	private void jumpAnimation() {
		
		threadJump = new Thread(new ThreadAnimationJumpPerson(framePrincipal, manager));
		threadJump.start();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == 'a'||e.getKeyChar() == 'A' || e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
			if(threadJump.isAlive()) {
				movePersonLeftJump();
			}else {
				
				if(getColisionWhitPerson()) {
					movePersonLeft();	
				}else {
					movePersonDown();
				}
				
			}
			
		}
		if(e.getKeyChar() == 'd'||e.getKeyChar() == 'D' || e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
			if(threadJump.isAlive()) {
				movePersonRightJump();
			}else {
				
				if(getColisionWhitPerson()) {
					movePersonRight();	
				}else {
					movePersonDown();
				}
				
			}
		}
		if(e.getKeyChar() == 'w'||e.getKeyChar() == 'W' || e.getExtendedKeyCode() == KeyEvent.VK_UP) {
				jumpAnimation();
				
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyChar() == 'a'||e.getKeyChar() == 'A' || e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
			movePersonStay();
		}
		if(e.getKeyChar() == 'd'||e.getKeyChar() == 'D' || e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
			
			movePersonStay();
		}
//		if(e.getKeyChar() == 'w'||e.getKeyChar() == 'W' || e.getExtendedKeyCode() == KeyEvent.VK_UP) {
//			
//			
//		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}
	
	public void movePersonStay() {
		framePrincipal.movePersonStay();
	}
	
	public void movePersonRight() {
//		int y = framePrincipal.getRectangleEnvironment().y;
		framePrincipal.movePersonRight();
	}
	public void movePersonLeft() {
//		int y = framePrincipal.getRectangleEnvironment().y;
		framePrincipal.movePersonLeft();
	}
	public void movePersonRightJump() {
		framePrincipal.movePersonRightJump();
	}
	public void movePersonLeftJump() {
		framePrincipal.movePersonLeftJump();
	}
	public void movePersonDown() {
		framePrincipal.movePersonDown();
	}
	
	public boolean getColisionWhitPerson() {
		return framePrincipal.colisionWithPerson();
	}
	
}
