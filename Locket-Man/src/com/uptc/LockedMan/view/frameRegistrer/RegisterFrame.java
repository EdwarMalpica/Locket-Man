package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.view.splash.PanelImage;

public class RegisterFrame extends JFrame{
	
	private PanelImage panelImage;
	private PanelContainer panelContainer;
	private PanelAbout panelConfig;
	private PanelOptions optionsPanel;
	
	private JScrollPane scrollPane;

	public RegisterFrame() {
		this.setUndecorated(true);
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		init();
		setEvents();
	}

	private void init() {
		// panel de la imagen de fondo
		this.panelImage = new PanelImage(Constants.PATH_BACKGROUND_REGISTRY, this.getSize());
		this.setContentPane(panelImage);
		
		
		//todo lo referente al panel de informacion
		this.panelConfig = new PanelAbout(this.getSize());
		
		scrollPane = new JScrollPane();
		scrollPane.setSize(new Dimension((int) this.getWidth(),(int) this.getHeight()/2));
		scrollPane.setLocation(0, this.getHeight());
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setAutoscrolls(true);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.add(panelConfig);
        
        //container de botones generales
		this.panelContainer = new PanelContainer(this.getSize(), Constants.POINT_CERO);
		
		//panel de configuraciones
		optionsPanel = new PanelOptions(new Dimension(this.getWidth()/4, this.getHeight()), new Point((0 - this.getWidth()/4), 0));
		
		this.getContentPane().add(optionsPanel);
		this.getContentPane().add(scrollPane);
		this.getContentPane().add(panelContainer);
	}
	
	public void setEvents() {
		panelContainer.getButtonConfig().addActionListener(new EventConfig(this, optionsPanel, Constants.ADVANCE, Constants.MOVING_SIDE, optionsPanel.getX(), 0));
		panelContainer.getButtonAbout().addActionListener(new EventConfig(this, scrollPane, Constants.BACK, Constants.UP_OR_DOWN, scrollPane.getY(), (int)this.getHeight()/2));
		panelConfig.getButtonClose().addActionListener(new EventConfig(this, scrollPane, Constants.ADVANCE, Constants.UP_OR_DOWN, this.getHeight()/2, this.getHeight()));
		optionsPanel.getButtonClose().addActionListener(new EventConfig(this, optionsPanel, Constants.BACK, Constants.MOVING_SIDE, 0, (0 - this.getWidth()/4)));
	}
}
