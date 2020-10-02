package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButtonPlay extends JButton{
	
	private Dimension size;
	private String imageIcon;
	private Point locale;
	
	public JButtonPlay(Dimension size, String imageIcon, Point locale) {
		super();
		this.size = size;
		this.imageIcon = imageIcon;
		this.locale = locale;
		init();
	}
	
	public void init() {
		this.setContentAreaFilled(false);
		this.setBorder(null);
		this.setSize(size);
		this.setLocation(locale);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		setIcon(imageIcon);
	}
	
	/**
	 * añade el icono al boton
	 * @param imageIcon ruta de la imagen a cambiar
	 */
	public void setIcon(String imageIcon) {
		URL url = this.getClass().getResource(imageIcon);
		this.setIcon(new ImageIcon(url));
	}
}
