/**
 * @App Locket-Man
 * @Author Edwar Steveen Malpica
 * @Date 30 sept. 2020
 * @Version 1.00
 * @clase ThreadMovePersonDown.java
 */
package com.uptc.LockedMan.controller;

import com.uptc.LockedMan.model.ModelManager;
import com.uptc.LockedMan.view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class ThreadMovePersonDown implements Runnable {
	private JFramePrincipal framePrincipal;
	private ModelManager manager;
	
	public ThreadMovePersonDown(JFramePrincipal framePrincipal,ModelManager manager) {
		this.framePrincipal = framePrincipal;
		this.manager = manager;
	}
	@Override
	public void run() {
		framePrincipal.movePersonDown();
	}

	
}
