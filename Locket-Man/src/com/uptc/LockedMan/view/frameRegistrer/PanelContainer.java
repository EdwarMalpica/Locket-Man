package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.view.frameRegistrer.JButtonPlay;
import com.uptc.LockedMan.view.splash.LabelPercent;

import utilities.PropertiesManager;

public class PanelContainer extends JPanel{
	
	private PropertiesManager propertiesManager;
	
	private PanelAbout panelAbout;
	private PanelOptions optionsPanel;
	private JScrollPane scrollPane;
	
	private JButtonPlay buttonPlay;
	private JButtonPlay buttonConfig;
	private JButtonPlay buttonAbout;
	
	private LabelPercent labelConfig;
	private LabelPercent labelInitPlay;
	private LabelPercent labelAbout;

	private Dimension size;
	private Point locale;
	
	/**
	 * este panel se encarga de mantener todos los botones del frame de registro
	 * @param size tamaño del panel
	 * @param locale localizacion del panel
	 */
	public PanelContainer(Dimension size, Point locale) {
		super();
		this.setLayout(null);
		this.setSize(size);
		this.setLocation(locale);
		this.setBackground(Color.black);
		this.size = size;
		this.locale = locale;
		this.propertiesManager = new PropertiesManager();
		init();
		updateAllTexts();
		setEvents();
	}
	
	public void init() {
		//todo lo referente al panel de informacion
		this.panelAbout = new PanelAbout(new Dimension(this.getWidth(), this.getHeight()/2));
		this.panelAbout.setPreferredSize(new Dimension(this.getWidth(), panelAbout.getHeight()*3));
				
	    scrollPane = new JScrollPane();
		scrollPane.setLocation(0, this.getHeight());
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportView(panelAbout);
		scrollPane.setSize(new Dimension((int) this.getWidth(),(int) this.getHeight()/2));
		this.add(scrollPane);
				
		//panel de configuraciones
		optionsPanel = new PanelOptions(new Dimension(this.getWidth()/4, this.getHeight()), new Point((0 - this.getWidth()/4), 0));
		this.add(optionsPanel);
		
		Point localePlayButton;
		localePlayButton = pointIntermediate(new Point(this.getWidth(), this.getHeight()), new Point((int)Constants.DIMENSION_BUTTON_PLAY.getWidth(), (int)Constants.DIMENSION_BUTTON_PLAY.getHeight()));
		buttonPlay = new JButtonPlay(Constants.DIMENSION_BUTTON_PLAY, Constants.PATH_BUTTON_PLAY, localePlayButton);
		this.add(buttonPlay);
		
		Point localeConfigButton;
		localeConfigButton = pointIntermediate(new Point(this.getWidth()/3, this.getHeight()), new Point((int)Constants.DIMENSION_BUTTON_CONFIG.getWidth(), (int)Constants.DIMENSION_BUTTON_CONFIG.getHeight()));
		buttonConfig = new JButtonPlay(Constants.DIMENSION_BUTTON_CONFIG, Constants.PATH_BUTTON_CONFIG, localeConfigButton);
		this.add(buttonConfig);
		
		Point localeAboutButton;
		localeAboutButton = pointIntermediate(new Point(this.getWidth()/3, this.getHeight()), new Point((int)Constants.DIMENSION_BUTTON_CONFIG.getWidth(), (int)Constants.DIMENSION_BUTTON_CONFIG.getHeight()));
		buttonAbout = new JButtonPlay(Constants.DIMENSION_BUTTON_CONFIG, Constants.PATH_BUTTON_ABOUT, new Point(localeAboutButton.x * 8, localeAboutButton.y));
		this.add(buttonAbout);
		
		labelAbout = new LabelPercent("", Constants.SIZE_FONT_OPTIONS);
		labelAbout.setSize(Constants.DIMENSION_LABEL_ABOUT);
		labelAbout.setLocation(new Point((buttonAbout.getX() + buttonAbout.getWidth()/2) - labelAbout.getWidth()/2, buttonAbout.getY() + buttonAbout.getHeight()));
		labelAbout.setForeground(Color.black);
		labelAbout.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		this.add(labelAbout);
		
		labelInitPlay = new LabelPercent("", Constants.SIZE_FONT_PLAY);
		labelInitPlay.setSize(Constants.DIMENSION_LABEL_INIT_PLAY);
		labelInitPlay.setLocation(new Point((buttonPlay.getX() + buttonPlay.getWidth()/2) - labelInitPlay.getWidth()/2, buttonPlay.getY() + buttonPlay.getHeight()));
		labelInitPlay.setForeground(Color.black);
		labelInitPlay.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		this.add(labelInitPlay);
		
		labelConfig = new LabelPercent("", Constants.SIZE_FONT_OPTIONS);
		labelConfig.setSize(Constants.DIMENSION_LABEL_ABOUT);
		labelConfig.setLocation(new Point((buttonConfig.getX() + buttonConfig.getWidth()/2) - labelConfig.getWidth()/2, buttonConfig.getY() + buttonConfig.getHeight()));
		labelConfig.setForeground(Color.black);
		labelConfig.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		this.add(labelConfig);
	}
	
	/**
	 * actualiza todos los textos
	 */
	public void updateAllTexts() {
		labelConfig.setTextThis(propertiesManager.getMessageButtonOptions());
		labelAbout.setTextThis(propertiesManager.getMessageAbout());
		labelInitPlay.setTextThis(propertiesManager.getMessagePlay());
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
	
	/**
	 * añade los eventos de los botones al panel
	 */
	public void setEvents() {
		getButtonConfig().addActionListener(new EventConfig(optionsPanel, Constants.ADVANCE, Constants.MOVING_SIDE, optionsPanel.getX(), 0, true));
		getButtonAbout().addActionListener(new EventConfig(scrollPane, Constants.BACK, Constants.UP_OR_DOWN, scrollPane.getY(), (int)this.getHeight()/2, true));
		panelAbout.getButtonClose().addActionListener(new EventConfig(scrollPane, Constants.ADVANCE, Constants.UP_OR_DOWN, this.getHeight()/2, this.getHeight(), false));
		optionsPanel.getButtonClose().addActionListener(new EventConfig(optionsPanel, Constants.BACK, Constants.MOVING_SIDE, 0, (0 - this.getWidth()/4), false));
		optionsPanel.getButtonLanguage().addActionListener(new EventChangeLanguaje(this, propertiesManager, optionsPanel.getButtonLanguage(), null));
	}
	
	public PanelOptions getPanelOptions() {
		return optionsPanel;
	}

	@Override
	public void paint(Graphics g) {
		URL url = this.getClass().getResource(Constants.PATH_BACKGROUND_REGISTRY);
		Image image = new ImageIcon(url).getImage();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		this.setOpaque(false);
		super.paint(g);
	}
}
