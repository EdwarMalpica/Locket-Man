package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

public class PanelOptions extends JPanel{
	
	private Dimension size;
	private Point locale;
	
	private JButtonPlay buttonLanguage;
	private JButtonPlay buttonVolume;

	public PanelOptions(Dimension size, Point locale) {
		super();
		this.size = size;
		this.locale = locale;
		init();
	}
	
	public void init() {
		this.setSize(size);
		this.setLocation(locale);
		
		//buttonLanguage = new JButtonPlay(, imageIcon, locale)
	}
}
