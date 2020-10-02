/**
 *ThreadAnimationPerson.java  
 *asdasd
 */
package com.uptc.LockedMan.controller;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.model.ModelManager;
import com.uptc.LockedMan.view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class ThreadAnimationPerson implements Runnable{

	private JFramePrincipal framePrincipal;
	private ModelManager manager;
	
	public ThreadAnimationPerson(JFramePrincipal framePrincipal,ModelManager manager) {
		this.framePrincipal = framePrincipal;
		this.manager = manager;
	}
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
			framePrincipal.setIncrement(manager.getIncrementAnimation());
			
		}
		
	}

}
