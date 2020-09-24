/**
 *JLabelPerson.java  
 *asdasd
 */
package com.uptc.LockedMan.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author eduar
 *
 */
public class JLabelPerson extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2388981344539873338L;
	private ImageIcon img;
	private BufferedImage bufferedImage;
	private int increment;
	private int widthImg;
	private int heightImg;
	/**
	 * 
	 */
	public JLabelPerson(String pathImage) {
		super();
		init(pathImage);
		increment = 1;
	}

	/**
	 * 
	 */
	private void init(String pathImage) {
		img = new ImageIcon(getClass().getResource("../../../.."+pathImage).getPath());
		Image image = img.getImage();
		widthImg = image.getWidth(null)/3;
		System.out.println( widthImg + "");
		heightImg = image.getHeight(null)/4;
		bufferedImage = new BufferedImage(widthImg,heightImg,BufferedImage.TYPE_INT_RGB);
		this.setPreferredSize(new Dimension(widthImg,heightImg));
		//this.setText("COñoooo");
	}
	
	@Override
	public void paint(Graphics g ) {
		Graphics2D g2 ;
		g.drawImage(bufferedImage, 0, 0, this);
		g2 = bufferedImage.createGraphics();
		g2.fillRect(0, 0, getWidth(), getHeight());
		int mx = (increment%3)*widthImg;
		int my = (increment/4)*heightImg;
		g2.drawImage(img.getImage(), 0, 0, 0+widthImg, 0+heightImg,mx,my,mx+widthImg,my+heightImg, this);
		repaint();
	}

	/**
	 * @return el increment
	 */
	public int getIncrement() {
		return increment;
	}

	/**
	 * @param increment el increment a establecer
	 */
	public void setIncrement(int increment) {
		this.increment = increment;
		repaint();
	}
	
	
	
	
	
}
