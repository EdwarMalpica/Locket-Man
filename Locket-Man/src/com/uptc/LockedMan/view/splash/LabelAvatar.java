package com.uptc.LockedMan.view.splash;

import java.awt.Point;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelAvatar extends JLabel{
	
	private String pathImage;
	private Point location;
	
	/**
	 * label para poner el avatar del juego
	 * @param pathImage ruta de donde se encuentra el sprite
	 * @param location localizacion inicial del label
	 */
	public LabelAvatar(String pathImage, Point location) {
		this.pathImage = pathImage;
		this.location = location;
		init();
	}
	
	public void init() {
		this.setLocation(location);
		URL url = this.getClass().getResource(pathImage);
		this.setIcon(new ImageIcon(url));
	}
	
	/**
	 * cambia la imagen del label
	 * @param path direccion de la imagen tipo sprite
	 */
	public void changeImage(String path) {
		this.setIcon(new ImageIcon(this.getClass().getResource(path)));
	}

}
