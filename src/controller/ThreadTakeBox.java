/**
 * @App Locket-Man
 * @Author Edwar Steveen Malpica
 * @Date 1 oct. 2020
 * @Version 1.00
 * @clase ThreadTakeBox.java
 */
package controller;

import model.ModelManager;
import view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class ThreadTakeBox implements Runnable {
	private JFramePrincipal framePrincipal;
	
	private boolean status;
	
	public ThreadTakeBox(JFramePrincipal framePrincipal,ModelManager manager) {
		this.framePrincipal = framePrincipal;
	
		this.status = false;
	}
	@Override
	public void run() {
		while(true) {
			
			if(status) {
				framePrincipal.takeBox();
				
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public void suspendThread() {
		this.status = false;
	}
	
	public void playThread() {
		this.status = true;
	}
	/**
	 * @return el status
	 */
	public boolean isStatus() {
		return status;
	}
	
	
	

	
}
