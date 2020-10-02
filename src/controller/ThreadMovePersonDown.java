/**
 * @App Locket-Man
 * @Author Edwar Steveen Malpica
 * @Date 30 sept. 2020
 * @Version 1.00
 * @clase ThreadMovePersonDown.java
 */
package controller;

import model.ModelManager;
import view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class ThreadMovePersonDown implements Runnable {
	private JFramePrincipal framePrincipal;
	
	
	public ThreadMovePersonDown(JFramePrincipal framePrincipal,ModelManager manager) {
		this.framePrincipal = framePrincipal;
		
	}
	@Override
	public void run() {
		framePrincipal.movePersonDown();
	}

	
}
