package locketMan;

import com.uptc.LockedMan.controller.Controller;
import com.uptc.LockedMan.model.ModelManager;
import com.uptc.LockedMan.view.JFramePrincipal;

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
