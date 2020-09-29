/**
 *ThreadAnimationJumpPerson.java  
 *asdasd
 */
package com.uptc.LockedMan.controller;

import com.uptc.LockedMan.model.ModelManager;
import com.uptc.LockedMan.view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class ThreadAnimationJumpPerson implements Runnable{
	private JFramePrincipal framePrincipal;
	private ModelManager manager;
	private boolean status;
	
	public ThreadAnimationJumpPerson(JFramePrincipal framePrincipal,ModelManager manager) {
		this.framePrincipal = framePrincipal;
		this.manager = manager;
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
