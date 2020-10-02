/**
 * @App Locket-Man
 * @Author Edwar Steveen Malpica
 * @Date 30 sept. 2020
 * @Version 1.00
 * @clase ThreadValidateColision.java
 */
package controller;

import model.ModelManager;
import view.JFramePrincipal;

/**
 * @author eduar
 *
 */
public class ThreadValidateColision implements Runnable{

	private JFramePrincipal framePrincipal;
	

	private boolean suspend ;
	
	public ThreadValidateColision(JFramePrincipal framePrincipal,ModelManager manager) {
		this.framePrincipal = framePrincipal;
	
		this.suspend = true;
		
	}
	@Override
	public void run() {
		
			
			while(true) {
			
				if(suspend) {
					
					if(!framePrincipal.colisionWithPerson()) {
						framePrincipal.movePersonDown();
						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							// TODO Bloque catch generado autom�ticamente
							e.printStackTrace();
						}
					}
				}else {
					try {
						Thread.sleep(620);
					} catch (InterruptedException e) {
						// TODO Bloque catch generado autom�ticamente
						e.printStackTrace();
					}
				}
						
			}
			
		
		
		
	}
	public void pauseThread() {
		this.suspend = false;
		
	}
	public void playThread() {
		this.suspend = true;
	}
}
