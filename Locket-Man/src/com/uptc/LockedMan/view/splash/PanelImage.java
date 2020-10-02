/**
 * 
 */
package com.uptc.LockedMan.view.splash;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
	private String pathImageFont;
	
	/**
	 * este panel, dibuja una imagen dentro de el, como fondo de pantalla
	 * @param pathImageFont ruta donde se encuentra la imagen a graficar
	 * @param size
	 */
	public PanelImage(String pathImageFont, Dimension size) {
		super();
		this.setSize(size);
		this.pathImageFont = pathImageFont;
		init();	
	}
	
	private void init() {
		this.url = this.getClass().getResource(pathImageFont);
		this.image = new ImageIcon(url).getImage();
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		this.setOpaque(false);
		super.paint(g);
	}	
}
