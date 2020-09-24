package com.uptc.LockedMan.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.*;

import com.uptc.LockedMan.constants.Constants;

public class PanelDrawAvatar extends JPanel{
	
	private Image imageToDraw;
	private URL url;
	private Thread hilo;
	
	private int increment = 0;
	
//	private int rotacionBrazo = 0;
//	private int rotacionPierna = 0;
//	
//	private int positionX =0;
	
	public PanelDrawAvatar() {
		this.setOpaque(false);
		init();
	}
	
	public void init() {
		this.setSize(new Dimension(Constants.DIMENSION_WINDOW_DEFAULT.width/3,(int)(Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3)/2));
		this.setPreferredSize(new Dimension(Constants.DIMENSION_WINDOW_DEFAULT.width/3,(int)(Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3)/2));
		this.setOpaque(false);
		this.hilo = new Thread();
		devolveImage(Constants.PATH_SPRITE_RUN);
		hilo.start();
	}
	
	@Override
	public void paint(Graphics g) {
//		this.repaint();
//		Graphics2D g2d = (Graphics2D) g;
//		g2d.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//      //terminamos el antialiazing
//		
//		int ix = (increment % 12) * 110;
//		int iy = (increment / 12) * 110;
//		
//		g2d.drawImage(imageToDraw, 0, 0, 50+110, 50+110, ix, iy, ix + 110, iy + 110, this);
	}	
	
	/**
	 * Devuelve la imagen de la parte del cuerpo solicitado
	 * @param pathOfPart
	 * @return
	 */
	private void devolveImage(String pathOfPart) {
		this.url = this.getClass().getResource(pathOfPart);
		this.imageToDraw = new ImageIcon(url).getImage();
	}
	
	public void startAnimation() {
		while(true) {
			try {
				paint(this.getGraphics());
				hilo.sleep(80);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			increment++;
			
			if(increment > 12) {
				increment = 0;
			}
		}
	}
}
//	
//	@Override
//	public void paint(Graphics g) {
//		this.repaint();
//		Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint( // le da mejor aspecto a lo graficado
//                RenderingHints.KEY_ANTIALIASING,
//                RenderingHints.VALUE_ANTIALIAS_ON);
//        //terminamos el antialiazing
//			
//        CompletedBody body = new CompletedBody(positionX, Constants.BOUNDS_BODY.y, Constants.BOUNDS_BODY.width, Constants.BOUNDS_BODY.height);
//				
//		Rectangle boundsLeg = body.getLeg();
//		Rectangle boundsEye = body.getEye();
//		Rectangle boundsArm = body.getArm();
//		Rectangle boundsBody = body.getBody();  
//				
//		Image imageBody = devolveImage(Constants.PATH_PART_BODY);
//		g.drawImage(imageBody, boundsBody.x, boundsBody.y, boundsBody.width, boundsBody.height, this);
//				
//		Image imageLeg = devolveImage(Constants.PATH_PART_LEG);
//		g.drawImage(imageLeg, boundsLeg.x, boundsLeg.y, boundsLeg.width, boundsLeg.height, this);
//				
//		Image imageEye = devolveImage(Constants.PATH_PART_EYE);
//		g.drawImage(imageEye, boundsEye.x, boundsEye.y, boundsEye.width, boundsEye.height, this);
//        
//		Image imageArm = devolveImage(Constants.PATH_PART_ARM);
//		g.drawImage(imageArm, boundsArm.x, boundsArm.y, boundsArm.width, boundsArm.height, this);
//	}
//	
//	/**
//	 * Ciclo usado para empezar la animacion, lepasa los graficos del panel al metodo paint()
//	 */
//	public void paintBody() {
//		int limitRun = this.getWidth()/2 - Constants.BOUNDS_BODY.width/2;
//		for (int i = this.getWidth(); i > limitRun; i--) {
//			this.positionX = i;
//			this.paint(this.getGraphics());
//			try {
//				new Thread().sleep(50);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//	}
