package com.uptc.LockedMan.view;

import java.awt.Point;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelAvatar extends JLabel{
	
	private String pathImage;
	private Point location;
	
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
	
	public void changeImage(String path) {
		this.setIcon(new ImageIcon(this.getClass().getResource(path)));
	}

}
