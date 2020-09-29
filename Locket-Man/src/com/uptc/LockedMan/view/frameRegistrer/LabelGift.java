package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelGift extends JLabel{
	
	private Dimension size;
	private ImageIcon imageIcon;
	private Point locale;
	
	public LabelGift(Dimension size, ImageIcon imageIcon, Point locale) {
		super();
		this.size = size;
		this.imageIcon = imageIcon;
		this.locale = locale;
		
		init();
	}
	
	public void init() {
		this.setSize(size);
		this.setLocation(locale);
		this.setIcon(imageIcon);
	}
}
