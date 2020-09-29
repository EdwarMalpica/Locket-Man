package com.uptc.LockedMan.view.splash;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.sound.Sounds;

public class AnimatedLabels {
	
	private Component labelToAnim;
	private String moveTo;
	private String direction;
	private int initMovimient;
	private int findMoviment;
	private int speed;
	
	private boolean finish = false;
	
	private int countOfImages;
	private String pathArrayImages;
	private String formatImage;
	
	private Thread thread;
	
	private Sounds run;
	
	/**
	* Grafíca en un label una pequeña animación
	* @param labelToAnim label que vamos a animar
	* @param moveTo indica si queremos mover la imagen hacia el frente o hacia atras
	* @param direction desplazar la imagen de arriba para abajo o al reves
	* @param initMovimient punto inicial del movimiento
	* @param findMoviment punto al que queremos llegar
	*/ 
	public AnimatedLabels(Component labelToAnim, String moveTo, String direction, int initMovimient, int findMoviment, int speed) {
		super();
		this.labelToAnim = labelToAnim;
		this.moveTo = moveTo;
		this.initMovimient = initMovimient;
		this.findMoviment = findMoviment;
		this.speed = speed;
		this.direction = direction;
	}
	
	/**
	 * Grafíca en un label una pequeña animación
	 * @param labelToAnim label que vamos a animar
	 * @param moveTo indica si queremos mover la imagen hacia el frente o hacia atras
	 * @param direction desplazar la imagen de arriba para abajo o al reves
	 * @param initMovimient punto inicial del movimiento
	 * @param findMoviment punto al que queremos llegar
	 * @param pathArrayImages direccion de las imagenes o sprite a cambiar
	 * @param countImages cuantas imagenes vamos a cambiar
	 * @param formatImage formato de las imagenes
	 * @param speed velocidad con la que se va a mover el frame
	 */
	public AnimatedLabels(Component labelToAnim, String moveTo, String direction, int initMovimient, int findMoviment, String pathArrayImages, int countImages, String formatImage, int speed) {
		super();
		this.labelToAnim = labelToAnim;
		this.moveTo = moveTo;
		this.initMovimient = initMovimient;
		this.findMoviment = findMoviment;
		this.speed = speed;
		this.direction = direction;
		this.pathArrayImages = pathArrayImages;
		this.countOfImages = countImages;
		this.formatImage = formatImage;
		run = new Sounds();
	}
	
	
	/**
	 * inicia la animacion del label
	 */
	public void anim() {
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (findMoviment != initMovimient) {
					if (moveTo == Constants.ADVANCE) {
						if (direction == Constants.UP_OR_DOWN) {
							labelToAnim.setLocation(labelToAnim.getX(), initMovimient);
						}else {
							labelToAnim.setLocation(initMovimient, labelToAnim.getY());
						}
						initMovimient++;
					}else {
						if (direction == Constants.UP_OR_DOWN) {
							labelToAnim.setLocation(labelToAnim.getX(), initMovimient);
						}else {
							labelToAnim.setLocation(initMovimient, labelToAnim.getY());
						}
						initMovimient--;
					}
					//dormimos la ejecucion
					try {
						thread.sleep(speed);
					} catch (Exception e) {
						
					}
				}
			}
		});
	}
	
	/**
	 * inicia la animacion del label, cambiando en cada iteración la imagen del mismo
	 */
	public void animAndChangeImage() {
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				
				int numImage = 0;
				
				while (findMoviment != initMovimient) {
					
					if (moveTo == Constants.ADVANCE) {
						if (direction == Constants.UP_OR_DOWN) {
							labelToAnim.setLocation(labelToAnim.getX(), initMovimient);
						}else {
							labelToAnim.setLocation(initMovimient, labelToAnim.getY());
						}
						initMovimient++;
					}else {
						if (direction == Constants.UP_OR_DOWN) {
							labelToAnim.setLocation(labelToAnim.getX(), initMovimient);
						}else {
							labelToAnim.setLocation(initMovimient, labelToAnim.getY());
						}
						initMovimient--;
					}
					
					//cambiamos la imagen
					((JLabel) labelToAnim).setIcon(new ImageIcon(this.getClass().getResource(pathArrayImages + numImage + formatImage)));
					
					//dormimos la ejecucion
					try {
						thread.sleep(speed);
					} catch (Exception e) {
						
					}
					
					//aumentamos el contador
					numImage ++;
					
					if (numImage >= countOfImages) {
						numImage = 0;
					}
					
					//le ponemos sonido
					if (numImage == 0) {
						run.playVolumeSound(Constants.RUN_AVATAR, 0, -10.0f);
					}
				}
				finish = true;
				((JLabel) labelToAnim).setIcon(new ImageIcon(this.getClass().getResource(pathArrayImages + 12 + formatImage)));
			}
		});
	}
	
	public void startAnimation() {
		anim();
		thread.start();
	}
	
	public boolean getFinish() {
		return finish;
	}
	
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void startAndChange() {
		animAndChangeImage();
		thread.start();
	}
}
