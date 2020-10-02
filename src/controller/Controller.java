/**
 *Controller.java  
 *asdasd
 */
package controller;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import model.Level;
import model.ModelManager;
import persistence.ReadJSonLevels;
import view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class Controller implements KeyListener {

	private ModelManager manager;
	private JFramePrincipal framePrincipal;
	private static Controller controller;
	private Thread threadJump;
	private Thread validateColision;
	private Thread movePersonDown;
	private ThreadValidateColision threadValidateColision;
	private Thread threadTakeBox;
	private ThreadTakeBox threadTakeBoxRun;
	private ArrayList<Level> levels; 
	
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
		levels = ReadJSonLevels.getInstanceOf().getLevels();
		framePrincipal.setVisible(true);
		setLevelTwo();
		starAnimation();
	}
	
	
	private void starAnimation() {
		//framePrincipal.starAnimation(Constants.PATH_IMAGE_PERSON);
		manager.starAnimation();
		Thread threadAnimation = new Thread(new ThreadAnimationPerson(framePrincipal,manager));
		threadAnimation.start();
		jumpAnimation();
		validateColision();
		takeBox();
	}
	private void jumpAnimation() {
		
		threadJump = new Thread(new ThreadAnimationJumpPerson(framePrincipal, manager));
		threadJump.start();
		
	}
	
	private void takeBox() {
		threadTakeBoxRun = new ThreadTakeBox(framePrincipal, manager);
		threadTakeBox = new Thread(threadTakeBoxRun);
		threadTakeBox.start();
	}
	
	private void validateColision() {
		threadValidateColision = new ThreadValidateColision(framePrincipal, manager);
		validateColision = new Thread(threadValidateColision);
		validateColision.start();
	}
	
	private void changeStateTakebox() {
		if(threadTakeBoxRun.isStatus()) {
			threadTakeBoxRun.suspendThread();
			
			dropBox();
		}else {
			threadTakeBoxRun.playThread();
		}
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
					movePersonLeftNoCollision();
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
					movePersonRightNoCollision();	
					movePersonDown();
				}
				
			}
		}
		if(e.getKeyChar() == 'w'||e.getKeyChar() == 'W' || e.getExtendedKeyCode() == KeyEvent.VK_UP) {
				if(!threadJump.isAlive()) {
					threadValidateColision.pauseThread();	
					jumpAnimation();
					threadValidateColision.playThread();
				}
		
		}
		if(e.getKeyChar() == 'e'||e.getKeyChar() == 'E') {
			if( getColisionWhitBox()  ) {
				changeStateTakebox();
			}
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
		
		
	}
	
	public void movePersonStay() {
		framePrincipal.movePersonStay();
		
	}
	
	public void movePersonRight() {
		int y = framePrincipal.getRectangleEnvironment().y;
		framePrincipal.movePersonRight(y);	
	}
	public void movePersonLeft() {
		int y = framePrincipal.getRectangleEnvironment().y;
		framePrincipal.movePersonLeft(y);
	}
	public void movePersonRightNoCollision() {
	//	int y = framePrincipal.getRectangleEnvironment().y;
		framePrincipal.movePersonRightNoCollision();
	}
	public void movePersonLeftNoCollision() {
	//	int y = framePrincipal.getRectangleEnvironment().y;
		framePrincipal.movePersonLeftNoCollison();
	}
	public void movePersonRightJump() {
		framePrincipal.movePersonRightJump();
	}
	public void movePersonLeftJump() {
		framePrincipal.movePersonLeftJump();
	}
	public void movePersonDown() {
		movePersonDown = new Thread(new ThreadMovePersonDown(framePrincipal, manager));
		movePersonDown.start();
	}
	
	public boolean getColisionWhitPerson() {
		return framePrincipal.colisionWithPerson();
	}
	public boolean getColisionWhitBox() {
		return framePrincipal.colisionWithBox();
	}
	public void dropBox() {
		framePrincipal.dropBox();
	}
	
	public void setLevelOne() {	
		framePrincipal.setlevelOne(levels.get(0));
	}
	
	public void setLevelTwo() {
		framePrincipal.setlevelTwo(levels.get(1));
	}
	
	public void setLevelTree() {
		framePrincipal.setlevelTree(levels.get(2));
	}
	
	
	
	
	
	
	
	
	
	
	
}
