/**
 * 
 */
package view.splash;

import javax.swing.JFrame;
import constants.Constants;
import sound.Sounds;
import view.frameRegistrer.RegisterFrame;

/**
 * @author Jorge Ayala
 * @Date 11/09/2020
 */
public class Splash extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7821254375381909046L;
	private int time = 0;
	private PanelImage panelImage;
	private PanelCharge panelCharge;
	private AnimatedLabels animLabels;
	private Sounds principalSound;
	private Sounds crashSound;

	public Splash() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(true);
		init();
	}
	
	public void init() {
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
		this.setLocationRelativeTo(null);
		addComponent();
	}
	
	/**
	 * a�ade los componentes de este frame
	 */
	private void addComponent() {
		panelImage = new PanelImage(Constants.PATH_BACKGROUND_SPLASH, this.getSize());
		this.setContentPane(panelImage);
		panelCharge = new PanelCharge();
		this.getContentPane().add(panelCharge);	
	}
	
	/**
	 * muestra el splash 
	 * @param timeToShow tiempo que va a estar visible el splash
	 */
	public void showSplash(int timeToShow) {
		principalSound = new Sounds();
		crashSound = new Sounds();
		playPrincipalSound();
		
		//Hacemos visible la ventana
		this.setVisible(true);
		//instanciamos el tiempo total que dura esta ventana mostrada
		int timeToWait = (timeToShow * 1000) / 100;
		
		//animamos el label del mesaje de bienvenida
		animLabels = new AnimatedLabels(panelCharge.getLabelTextNamePlay(), Constants.BACK, Constants.MOVING_SIDE, this.getWidth(), 10, 5);
		animLabels.startAnimation();
		
		//animamos el label de la letra a
		panelCharge.getLabelLetterA().setVisible(true);
		animLabels = new AnimatedLabels(panelCharge.getLabelLetterA(), Constants.BACK, Constants.UP_OR_DOWN, this.getHeight(), panelCharge.getLabelLetterA().getY(), 10);
		animLabels.startAnimation();
		
		//animamos el label del nombre del juego
		animLabels = new AnimatedLabels(panelCharge.getLabelNamePlay(), Constants.ADVANCE, Constants.UP_OR_DOWN, 0, panelCharge.getLabelNamePlay().getY(), 10);
		animLabels.startAnimation();
		
		try {
			while(time <= 100) {
				panelCharge.upDatePercent("" + time + "...");
				if (time == 25) {
					animLabels = new AnimatedLabels(panelCharge.getLabelAvatar(), Constants.BACK, Constants.MOVING_SIDE, this.getWidth(), panelCharge.getLabelLetterA().getX() + (panelCharge.getLabelLetterA().getWidth() - 6), Constants.PATH_ARRAY_ANIM, 9, Constants.FORMAT_PNG, 20);
					animLabels.startAndChange();		
				}
				
				if (animLabels.getFinish() == true) {
					animLabels.setFinish(false);
					animLabels = new AnimatedLabels(panelCharge.getLabelLetterA(), Constants.BACK, Constants.MOVING_SIDE, panelCharge.getLabelLetterA().getX(), 0, 3);
					animLabels.startAnimation();
					crashSound.playSound(Constants.CRAHS_SOUND, 100);
				}
				
				//cambiamos el icono o la imagen
				if (time == 68) {
					panelCharge.getLabelAvatar().changeImage(Constants.PATH_ARRAY_ANIM + 0 + Constants.FORMAT_PNG);
				}
				
				Thread.sleep(timeToWait);
				time ++;
			}
		} catch (Exception e) {
			System.out.println("Error en la ejecuci�n");
		}
		
		//terminamos deshaciendo la ventana
		freeUpAndEnd();
	}
	
	/**
	 * reproduce el sonido de fondo
	 */
	private void playPrincipalSound() {
		principalSound.playSound(Constants.PRINCIPAL_SOUND, 100);;
	}
	
	/**
	 * libera recursos e inicia el frame principal
	 */
	public void freeUpAndEnd() {
		this.setVisible(false);
		this.dispose();
		new RegisterFrame();
	}

}
