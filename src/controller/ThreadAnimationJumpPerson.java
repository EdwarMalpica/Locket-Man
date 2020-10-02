/**
 *ThreadAnimationJumpPerson.java  
 *asdasd
 */
package controller;

import model.ModelManager;
import view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class ThreadAnimationJumpPerson implements Runnable{
	private JFramePrincipal framePrincipal;

	private boolean status;
	
	public ThreadAnimationJumpPerson(JFramePrincipal framePrincipal,ModelManager manager) {
		this.framePrincipal = framePrincipal;
		
		this.status = false;
	}
	@Override
	public void run() {
		framePrincipal.movePersonJumpRight();
		this.status = true;
	
	}
	
	public boolean getStatus() {
		return this.status;
	}

}
