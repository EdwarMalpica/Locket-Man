package com.uptc.LockeMan.viewsGameMenus;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.uptc.LockeMan.backgroundGame.ConstanBackground;

public class JPanelPrueba extends JPanel{
	
	private ImageIcon img;
	private Dimension dimension;
	
	public JPanelPrueba() {
		super();
		init();
	}
	private void init() {
		img = new ImageIcon(getClass().getResource(ConstanBackground.PATH_IMAGE_BACKGROUND_MENU).getPath());
		dimension = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(dimension.width/3,dimension.height/2);
	}
	/**
	 * Pintamos la imagen que pasamos por parametro en el fondo del menu
	 */
	@Override
	public void paint(Graphics graphics) {
		Image imageBackGround = img.getImage();
		graphics.drawImage(imageBackGround, 0, 0,this.getWidth(), this.getHeight(), this);
		this.setOpaque(false);
		super.paint(graphics);
	}

}
