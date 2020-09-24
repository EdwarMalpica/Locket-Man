package com.uptc.LockedMan.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.uptc.LockedMan.constants.Constants;

public class Sprite extends JPanel{

       private static final int BMP_ROWS = 4;
       private static final int BMP_COLUMNS = 3;
       private int x = 0;
       private int y = 0;
       private int xSpeed = 5;
       private int currentFrame = 0;
       private int width;
       private int height;
       
       	private Image imageToDraw;
   		private URL url;
   		private Thread hilo;

       public Sprite(String pathImage) {
            devolveImage(pathImage);
            this.width = 330 / BMP_COLUMNS;
            this.height = 440 / BMP_ROWS;
     		this.setSize(new Dimension(Constants.DIMENSION_WINDOW_DEFAULT.width/3,(Constants.DIMENSION_WINDOW_DEFAULT.height/3)));
    		this.setPreferredSize(new Dimension(Constants.DIMENSION_WINDOW_DEFAULT.width/3,(Constants.DIMENSION_WINDOW_DEFAULT.height/3)));
    		this.hilo = new Thread();

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

 

       private void update() {
             if (x > this.getWidth() - width - xSpeed) {
                    xSpeed = -5;
             }

             if (x + xSpeed < 0) {
                    xSpeed = 5;
             }

             x = x + xSpeed;

             currentFrame = ++currentFrame % BMP_COLUMNS;

       }

 

       public void onDraw() {
    	   Graphics g = this.getGraphics();
    	   	while (true) {
    	   		update();
    	   		this.repaint();
                int srcX = currentFrame * width;
                int srcY = 1 * height;

                Rectangle src = new Rectangle(srcX, srcY, srcX + width, srcY + height);
                Rectangle dst = new Rectangle(x, y, x + width, y + height);

                g.drawImage(imageToDraw, 0, 0, 110, 110, 110, 110, 220, 220, this);
                
                try {
					hilo.sleep(50);
				} catch (Exception e) {
				}
			}

       }

}
