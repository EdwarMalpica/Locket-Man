/**
 *Animation.java  
 *asdasd
 */
package com.uptc.LockedMan.model;

/**
 * @author eduar
 *
 */
public class Animation {

	private int increment;
	
	public Animation() {
		increment = 0;
	}
	
	public void addIncrement() {
		
		if(increment == 12) {
			increment = 0;
		}else {
			increment++;
		}
	}
	
	public int getIncrement() {
		return increment;
	}
	
}
