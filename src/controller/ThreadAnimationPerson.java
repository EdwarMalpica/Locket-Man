/**
 *ThreadAnimationPerson.java  
 *asdasd
 */
package controller;


import model.ModelManager;
import view.JFramePrincipal;

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
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			}
			framePrincipal.setIncrement(manager.getIncrementAnimation());
			
		}
		
	}

}
