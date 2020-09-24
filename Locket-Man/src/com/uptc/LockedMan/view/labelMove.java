package com.uptc.LockedMan.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

import com.uptc.LockedMan.constants.Constants;

public class labelMove extends JLabel{
	
	Image img;
	int incremento = 0;
	BufferedImage bi;
	
	public labelMove() {
		init();
	}
	
	public void init() {
		this.setSize(new Dimension(110, 110));
		this.setLocation(0, 0);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		img = toolkit.getImage(getClass().getResource("../resources/SpriteAvatar.png"));
		bi = new BufferedImage(Constants.SCREEN_FRAME.width,Constants.SCREEN_FRAME.height, BufferedImage.TYPE_INT_RGB);
	}
	
	public void paintThis(Graphics g) {
		Graphics2D g2 ;
		g.drawImage(bi, 0, 0, this);
		g2 = bi.createGraphics();
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		int mx = (incremento % 4) * 110;
		int my = (incremento / 4) * 110;
		
		g2.drawImage(img, 250, 250, 100+110, 100+110, mx, my, mx+110, my+110, this);
		this.repaint();
	}
	
	public void initMove(Graphics g) {
		while (true) {
			try {
				if (incremento == 3 || incremento == 7 || incremento == 11) {
					
				}else {
					Thread.sleep(100);
					paintThis(g);
				}
			} catch (InterruptedException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
			
			incremento ++;
			
			if(incremento >= 15) {
				incremento = 0;
			}
		}
	}

}
