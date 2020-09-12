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
	
	private int time = 0;

	public Splash() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setLayout(null);
		init();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void init() {
		
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
		this.getContentPane().add(new PanelImage());
		this.getContentPane().add(new PanelDrawAvatar(0, 0, Constants.PATH_PART_LEG));
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
