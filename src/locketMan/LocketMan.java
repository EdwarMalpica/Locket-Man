package locketMan;

import controller.Controller;
import model.ModelManager;
import view.JFramePrincipal;

public class LocketMan {

	
	public static void main(String[] args) {
		Controller.getInstanceOf();
		JFramePrincipal framePrincipal = new JFramePrincipal();
		ModelManager manager = new ModelManager();
		Controller.getInstanceOf().setFramePrincipal(framePrincipal);
		Controller.getInstanceOf().setManager(manager);
		Controller.getInstanceOf().init();
	}
}
