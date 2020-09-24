/**
 *Controller.java  
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
public class Controller {

	private ModelManager manager;
	private JFramePrincipal framePrincipal;
	private static Controller controller;
	
	private Controller() {
			init();
	}
	
	public static Controller getInstanceOf() {
		if(controller == null) {
			controller = new Controller();
		}
		return controller;
	}
	public void init() {
		manager = new ModelManager();
		framePrincipal = new JFramePrincipal();
		framePrincipal.setVisible(true);
		starAnimation();
	}
	
	
	private void starAnimation() {
		framePrincipal.starAnimation(Constants.PATH_IMAGE_PERSON);
		manager.starAnimation();
		Thread threadAnimation = new Thread(new ThreadAnimationPerson(framePrincipal,manager));
		threadAnimation.start();
	}
	
}
