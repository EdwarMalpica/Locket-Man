/**
 * 
 */
package com.uptc.LockedMan.view;

import javax.swing.*;

import com.uptc.LockedMan.constants.Constants;

import java.awt.*;

/**
 * @author Jorge Ayala
 * @Date 11/09/2020
 */
public class Splash extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7821254375381909046L;
	private int time = 0;
	private PanelImage panelImage;
	private PanelDrawAvatar panelDrawAvatar;

	public Splash() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setUndecorated(true);
		init();
	}
	
	public void init() {
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
	//	this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		addComponent();
	}
	
	private void addComponent() {
		panelImage = new PanelImage();
		this.setContentPane(panelImage);
		panelDrawAvatar = new PanelDrawAvatar(Constants.PATH_PART_LEG);
		this.getContentPane().add(panelDrawAvatar);
		panelDrawAvatar.setBounds(0, 0, getWidth(), getHeight());
	}
	
	public void showSplash(int timeToShow) {
		//Hacemos visible la ventana
		this.setVisible(true);
		
		int timeToWait = (timeToShow * 1000) / 100;
		try {
			while(time <= 100) {
				Thread.sleep(timeToWait);
				time ++;
			}
		} catch (Exception e) {
			System.out.println("Error en la ejecución");
		}
		
		//terminamos deshaciendo la ventana
		freeUpAndEnd();
	}
	
	public void freeUpAndEnd() {
		this.setVisible(false);
		System.exit(0);
		this.dispose();
		
	}

}
