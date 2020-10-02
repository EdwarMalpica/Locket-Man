/**
 *JLabelPerson.java  
 *asdasd
 */
package com.uptc.LockedMan.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import com.uptc.LockedMan.constants.Constants;

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
	private ImageIcon spriteLeft;
	private ImageIcon spriteRight;
	private ImageIcon spriteJump;
	private ImageIcon spriteStay;
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
		heightImg = image.getHeight(null)/4;
		bufferedImage = new BufferedImage(widthImg,heightImg,BufferedImage.TYPE_INT_RGB);
		this.setPreferredSize(new Dimension(widthImg,heightImg));
		this.setBackground(null);
		this.setOpaque(false);
		spriteJump = new ImageIcon(getClass().getResource("../../../.."+Constants.PATH_IMAGE_PERSON_JUMP_RIGHT));
		spriteStay = new ImageIcon(getClass().getResource("../../../.."+pathImage).getPath());
		spriteLeft = new ImageIcon(getClass().getResource("../../../.."+Constants.PATH_IMAGE_PERSON_LEFT).getPath());
		spriteRight = new ImageIcon(getClass().getResource("../../../.."+Constants.PATH_IMAGE_PERSON_RIGHT).getPath());
		//this.setText("COñoooo");
	}
	
	public void animationStay() {
		img = spriteStay;
		Image image = img.getImage();
		widthImg = image.getWidth(null)/3;
		heightImg = image.getHeight(null)/4;
		bufferedImage = new BufferedImage(widthImg,heightImg,BufferedImage.TYPE_INT_ARGB);
	}
	public void animationRight() {
		img = spriteRight;
		Image image = img.getImage();
		widthImg = image.getWidth(null)/3;
		heightImg = image.getHeight(null)/4;
		bufferedImage = new BufferedImage(widthImg,heightImg,BufferedImage.TYPE_INT_ARGB);
	}
	public void animationLeft() {
		img = spriteLeft;
		Image image = img.getImage();
		widthImg = image.getWidth(null)/3;
		heightImg = image.getHeight(null)/4;
		bufferedImage = new BufferedImage(widthImg,heightImg,BufferedImage.TYPE_INT_ARGB);
		//ImageIO.write(bufferedImage, "PNG", output);
	}
	public void animationJump() {
		img = spriteJump;
		Image image = img.getImage();
		widthImg = image.getWidth(null)/3;
		heightImg = image.getHeight(null)/4;
		bufferedImage = new BufferedImage(widthImg,heightImg,BufferedImage.TYPE_INT_ARGB);
//		try {
//			bufferedImage = ImageIO.read(getClass().getResource("../../../.."+Constants.PATH_IMAGE_PERSON_JUMP_RIGHT));
//		} catch (IOException e) {
//			// TODO Bloque catch generado automáticamente
//			e.printStackTrace();
//		}
	}
	
	
	
	@Override
	public void paint(Graphics g ) {
		if(!(img == null)) {
			Graphics2D g2 ;
			g.drawImage(bufferedImage, 0,0, this);
			g2 = bufferedImage.createGraphics();
			
			//this.setOpaque(true);
			int mx = (increment%3)*widthImg;
			int my = (increment/4)*heightImg;
			g2.drawImage(img.getImage(), 0, 0, 0+widthImg, 0+heightImg,mx,my,mx+widthImg,my+heightImg, this);
			repaint();
		}
		
		
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
	
	
	/**
	 * @return el img
	 */
	public ImageIcon getImg() {
		return img;
	}

	/**
	 * @param img el img a establecer
	 */
	public void setImgLeft() {
		System.out.println(getClass().getResource("../../../.."+Constants.PATH_IMAGE_PERSON_LEFT).getPath());
		img = new ImageIcon(getClass().getResource("../../../.."+Constants.PATH_IMAGE_PERSON_LEFT).getPath());
	}

	/**
	 * @return el widthImg
	 */
	public int getWidthImg() {
		return widthImg;
	}

	
	/**
	 * @return el heightImg
	 */
	public int getHeightImg() {
		return heightImg;
	}
	
	
	
}
