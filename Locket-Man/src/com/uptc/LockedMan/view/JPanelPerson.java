/**
 *JPanelPerson.java  
 *asdasd
 */
package com.uptc.LockedMan.view;

import javax.swing.JPanel;

/**
 * @author eduar
 *
 */
public class JPanelPerson extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8953700619649581763L;
	private JLabelPerson jLabelPerson;
	
	public JPanelPerson(String pathImage) {
		super();
		init(pathImage);
	}

	/**
	 * 
	 */
	private void init(String pathImage) {
		jLabelPerson = new JLabelPerson(pathImage);
		this.add(jLabelPerson);
		//jLabelPerson.setBounds(0,0, 110, 110);
	}
	
	public void setIncrement(int increment) {
		jLabelPerson.setIncrement(increment);
	}
	
	
}
