package com.uptc.LockedMan.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.*;

import com.uptc.LockedMan.constants.Constants;

public class PanelDrawAvatar extends JPanel{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9018406407172272665L;
	private Image image;
	private URL url;
	
	private String pathOfPart;
	
	public PanelDrawAvatar( String pathOfPart) {
		
		//this.setLayout(new BorderLayout());
		//this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, 50);
		//this.setBackground(Color.black);
		this.pathOfPart = pathOfPart;
		init();
	}
	
	public void init() {
		this.setPreferredSize(new Dimension(Constants.DIMENSION_WINDOW_DEFAULT.width/3,Constants.DIMENSION_WINDOW_DEFAULT.height/3));
		this.url = this.getClass().getResource(pathOfPart);
		this.image = new ImageIcon(url).getImage();
		addComponent();
	}
	
	private void addComponent() {
		this.add(new JLabel("asdsdd"));
		this.add(new JLabel("asdsdd"));
		this.add(new JLabel("asdsdd"));
		this.add(new JLabel("asdsdd"));
		this.add(new JLabel("asdsdd"));
		this.add(new JLabel("asdsdd"));
	}
	@Override
	public void paint(Graphics g) {
		System.out.println(pathOfPart);
		g.drawImage(image, 0, 0, 40, 80, this);
		this.setOpaque(false);
		super.paint(g);
	}
}
