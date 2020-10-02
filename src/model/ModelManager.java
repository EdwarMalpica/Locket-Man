/**
 *ModelManager.java  
 *asdasd
 */
package model;

/**
 * @author eduar
 *
 */
public class ModelManager {
	
	private Animation animation;
	
	public ModelManager() {
		
	}
	
	
	public void starAnimation() {
		animation = new Animation();
	}
	
	public int getIncrementAnimation() {
		animation.addIncrement();
		
		return animation.getIncrement();
	}
}
