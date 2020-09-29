package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGift extends JPanel{
	
	private LabelGift labelGift;
	private Dimension size;
	private Point locale;
	
	public PanelGift(Dimension size, Point locale) {
		super();
		this.size = size;
		this.locale = locale;
		
		init();
	}

	private void init() {
		this.setSize(size);
		this.setLocation(locale);
	}
	
	public void addGift(ImageIcon gift) {
		labelGift = new LabelGift(this.getSize(), gift, this.getLocation());
		this.add(labelGift);
	}
}
