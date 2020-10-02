package com.uptc.LockeMan.viewsGameMenus;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;

import com.uptc.LockeMan.backgroundGame.ConstanBackground;

public abstract class WindowGame extends Window {

	protected JPanel jPanelBody;
	protected ImageIcon img;
	protected Dimension dimension;
	
	public WindowGame() {
		super(null);
	}

	protected void init() {
		jPanelBody = new JPanel();
		this.add(jPanelBody);
		dimension = Toolkit.getDefaultToolkit().getScreenSize();
		setPropertiesWindow();
		verifyCorrectSize();
		setLocationRelativeTo(null);
	}
	
	public void setPropertiesWindow() {
		img = new ImageIcon(getClass().getResource(ConstanBackground.PATH_IMAGE_BACKGROUND_MENU).getPath());
	}

	/**
	 * Pintamos la imagen que pasamos por parametro en el fondo del menu
	 */
	@Override
	public void paint(Graphics graphics) {
		Image imageBackGround = img.getImage();
		graphics.drawImage(imageBackGround, 0, 0, this.getWidth(), this.getHeight(), this);
		jPanelBody.setOpaque(false);
		super.paint(graphics);
	}
	
	public abstract void verifyCorrectSize();

	/**
	 * @return the jPanel
	 */
	public JPanel getjPanel() {
		return jPanelBody;
	}
	

	/**
	 * @return the img
	 */
	public ImageIcon getImg() {
		return img;
	}
}