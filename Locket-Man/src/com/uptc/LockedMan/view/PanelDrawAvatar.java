package com.uptc.LockedMan.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.*;

import com.uptc.LockedMan.constants.Constants;

public class PanelDrawAvatar extends JPanel{
	
	private int x;
	private int y;
	
	private Image image;
	private URL url;
	
	private String pathOfPart;
	
	public PanelDrawAvatar(int x, int y, String pathOfPart) {
		
		this.setLayout(null);
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, 50);
		
		this.setBackground(Color.black);
		
		this.pathOfPart = pathOfPart;
		this.x = x;
		this.y = y;
		
		init();
	}
	
	public void init() {
		
		this.url = this.getClass().getResource(pathOfPart);
		this.image = new ImageIcon(url).getImage();
		
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println(pathOfPart);
		g.drawImage(image, 0, 0, 20, 40, null);
	}
}
