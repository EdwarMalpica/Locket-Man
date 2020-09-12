/**
 * 
 */
package com.uptc.LockedMan.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.uptc.LockedMan.constants.Constants;

/**
 * @author Jorge Ayala
 * @Date 11/09/2020
 */
public class PanelImage extends JPanel{
	
	/**
	 * 

	 */
	private static final long serialVersionUID = -2653636334210568220L;
	
	private Image image;
	private URL url;
	
	public PanelImage() {
		super();
		this.setLayout(null);
		this.setBounds(0, 0, (int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
		this.url = this.getClass().getResource(Constants.PATH_BACKGROUND_SPLASH);
		this.image = new ImageIcon(url).getImage();
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
	
}
