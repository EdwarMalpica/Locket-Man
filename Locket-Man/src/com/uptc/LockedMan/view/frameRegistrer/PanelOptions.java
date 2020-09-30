package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;
import javax.swing.JSlider;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.view.splash.LabelAvatar;

public class PanelOptions extends JPanel{
	
	private Dimension size;
	private Point locale;
	private JSlider volume;
	
	private JButtonPlay buttonClose;
	private JButtonPlay buttonLanguage;
	private LabelAvatar labelSound;

	public PanelOptions(Dimension size, Point locale) {
		super();
		this.size = size;
		this.locale = locale;
		this.setBackground(Color.BLACK);
		init();
	}
	
	
	public void init() {
		this.setSize(size);
		this.setLocation(locale);
		
		buttonLanguage = new JButtonPlay(Constants.DIMENSION_BUTTON_CONFIG, Constants.PATH_BUTTON_LANGUAGE, new Point(20, 10));
		labelSound = new LabelAvatar(Constants.PATH_LABEL_SOUND, new Point(20, (int) (this.getHeight()/3 - 32) * 2));
		labelSound.setSize(Constants.DIMENSION_BUTTON_CONFIG);
		
		buttonClose = new JButtonPlay(Constants.DIMENSION_BUTTON_CLOSE, Constants.PATH_BUTTON_CLOSE_BLUE, new Point(this.getWidth()-40, this.getHeight()- 35));
		
		volume = new JSlider();
		initSlider();
		volume.setSize(90, 40);
		volume.setLocation(labelSound.getX() - 13, labelSound.getY() + 70);
		
		this.add(buttonClose);
		this.add(volume);
		this.add(labelSound);
		this.add(buttonLanguage);
	}
	
	public void initSlider() {
		volume.setMajorTickSpacing(2);
        volume.setMaximum(10);
        volume.setMinorTickSpacing(2);
        volume.setPaintLabels(true);
        volume.setPaintTicks(true);
        volume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volume.setOpaque(false);
	}


	public JSlider getVolume() {
		return volume;
	}

	public JButtonPlay getButtonClose() {
		return buttonClose;
	}

	public JButtonPlay getButtonLanguage() {
		return buttonLanguage;
	}

	public LabelAvatar getLabelSound() {
		return labelSound;
	}
}
