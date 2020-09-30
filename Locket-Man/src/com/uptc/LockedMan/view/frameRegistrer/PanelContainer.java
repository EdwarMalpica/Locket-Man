package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.view.frameRegistrer.JButtonPlay;
import com.uptc.LockedMan.view.splash.LabelPercent;

public class PanelContainer extends JPanel{
	
	private JButtonPlay buttonPlay;
	private JButtonPlay buttonConfig;
	private JButtonPlay buttonAbout;
	
	private LabelPercent labelConfig;
	private LabelPercent labelInitPlay;
	private LabelPercent labelAbout;

	private Dimension size;
	private Point locale;
	
	public PanelContainer(Dimension size, Point locale) {
		super();
		this.size = size;
		this.locale = locale;
		init();
	}
	
	public void init() {
		this.setSize(size);
		this.setLocation(locale);
		this.setOpaque(false);
		
		Point localePlayButton;
		localePlayButton = pointIntermediate(new Point(this.getWidth(), this.getHeight()), new Point((int)Constants.DIMENSION_BUTTON_PLAY.getWidth(), (int)Constants.DIMENSION_BUTTON_PLAY.getHeight()));
		buttonPlay = new JButtonPlay(Constants.DIMENSION_BUTTON_PLAY, Constants.PATH_BUTTON_PLAY, localePlayButton);
		
		Point localeConfigButton;
		localeConfigButton = pointIntermediate(new Point(this.getWidth()/3, this.getHeight()), new Point((int)Constants.DIMENSION_BUTTON_CONFIG.getWidth(), (int)Constants.DIMENSION_BUTTON_CONFIG.getHeight()));
		buttonConfig = new JButtonPlay(Constants.DIMENSION_BUTTON_CONFIG, Constants.PATH_BUTTON_CONFIG, localeConfigButton);
		
		Point localeAboutButton;
		localeAboutButton = pointIntermediate(new Point(this.getWidth()/3, this.getHeight()), new Point((int)Constants.DIMENSION_BUTTON_CONFIG.getWidth(), (int)Constants.DIMENSION_BUTTON_CONFIG.getHeight()));
		buttonAbout = new JButtonPlay(Constants.DIMENSION_BUTTON_CONFIG, Constants.PATH_BUTTON_ABOUT, new Point(localeAboutButton.x * 8, localeAboutButton.y));
		
		labelAbout = new LabelPercent(Constants.MESSAGE_ABOUT_US, Constants.SIZE_FONT_OPTIONS);
		labelAbout.setSize(Constants.DIMENSION_LABEL_ABOUT);
		labelAbout.setLocation(new Point((buttonAbout.getX() + buttonAbout.getWidth()/2) - labelAbout.getWidth()/2, buttonAbout.getY() + buttonAbout.getHeight()));
		labelAbout.setForeground(Color.black);
		
		this.add(buttonAbout);
		this.add(buttonConfig);
		this.add(buttonPlay);
		
		this.add(labelAbout);
	}
	
	public void addComponent(Component component) {
		this.add(component);
	}
	
	/**
	 * Encuentra el centro entre 2 puntos
	 * @param point1 primer punto
	 * @param point2 segundo punto
	 * @return punto intermedio entre los 2 puntos
	 */
	public Point pointIntermediate(Point point1, Point point2) {
		int x = (int) (point1.x/2) - (point2.x/2);
		int y = (int) (point1.y/2) - (point2.y/2);
		
		return new Point(x, y);	
	}

	public JButtonPlay getButtonPlay() {
		return buttonPlay;
	}

	public JButtonPlay getButtonConfig() {
		return buttonConfig;
	}

	public JButtonPlay getButtonAbout() {
		return buttonAbout;
	}
}
