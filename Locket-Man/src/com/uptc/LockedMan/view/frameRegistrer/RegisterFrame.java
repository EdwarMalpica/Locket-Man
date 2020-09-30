package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.sound.Sounds;
import com.uptc.LockedMan.view.splash.PanelImage;

public class RegisterFrame extends JFrame{
	
	private Sounds sound;
	
	private PanelImage panelImage;
	private PanelContainer panelContainer;
	private PanelAbout panelAbout;
	private PanelOptions optionsPanel;
	private JScrollPane scrollPane;

	public RegisterFrame() {
		this.setUndecorated(true);
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setVisible(true);
		init();
		initPrincipalSound();
		setEvents();
	}

	private void init() {
		// panel de la imagen de fondo
		this.panelImage = new PanelImage(Constants.PATH_BACKGROUND_REGISTRY, this.getSize());
		this.setContentPane(panelImage);
		
		//container de botones generales
		this.panelContainer = new PanelContainer(this.getSize(), Constants.POINT_CERO);
		
		//todo lo referente al panel de informacion
		this.panelAbout = new PanelAbout(new Dimension(this.getWidth(), this.getHeight()/2));
		this.panelAbout.setPreferredSize(new Dimension(this.getWidth(), panelAbout.getHeight()*3));
		
		scrollPane = new JScrollPane();
		scrollPane.setLocation(0, this.getHeight());
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setViewportView(panelAbout);
        scrollPane.setSize(new Dimension((int) this.getWidth(),(int) this.getHeight()/2));
        this.getContentPane().add(scrollPane);
		
		//panel de configuraciones
		optionsPanel = new PanelOptions(new Dimension(this.getWidth()/4, this.getHeight()), new Point((0 - this.getWidth()/4), 0));
		this.getContentPane().add(optionsPanel);
		
		this.getContentPane().add(panelContainer);
	}
	
	public void setEvents() {
		panelContainer.getButtonConfig().addActionListener(new EventConfig(this, optionsPanel, Constants.ADVANCE, Constants.MOVING_SIDE, optionsPanel.getX(), 0));
		panelContainer.getButtonAbout().addActionListener(new EventConfig(this, scrollPane, Constants.BACK, Constants.UP_OR_DOWN, scrollPane.getY(), (int)this.getHeight()/2));
		panelAbout.getButtonClose().addActionListener(new EventConfig(this, scrollPane, Constants.ADVANCE, Constants.UP_OR_DOWN, this.getHeight()/2, this.getHeight()));
		optionsPanel.getButtonClose().addActionListener(new EventConfig(this, optionsPanel, Constants.BACK, Constants.MOVING_SIDE, 0, (0 - this.getWidth()/4)));
		optionsPanel.getVolume().addChangeListener(new EventChangeState(sound, optionsPanel.getVolume()));
	}
	
	public void initPrincipalSound() {
		sound = new Sounds();
		try {
			sound.loopSound(Constants.SOUND_REGIST, 300);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
