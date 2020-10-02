package frameRegistrer;

import javax.swing.JFrame;
import constants.Constants;
import sound.Sounds;
import splash.PanelImage;

public class RegisterFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6233419254777635492L;

	private Sounds sound;
	
	@SuppressWarnings("unused")
	private PanelImage panelImage;
	private PanelContainer panelContainer;

	/**
	 * frame del registro o inicio del juego principal
	 */
	public RegisterFrame() {
		this.setUndecorated(true);
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
		initPrincipalSound();
		setMasterVolumen();
	}

	private void init() {
		//container de botones generales
		this.panelContainer = new PanelContainer(this.getSize(), Constants.POINT_CERO);
		this.setContentPane(panelContainer);
	}
	
	/**
	 * inicia el control del volumen seteando un evento al jSlider
	 */
	public void setMasterVolumen() {
		panelContainer.getPanelOptions().getVolume().addChangeListener(new EventChangeState(sound, panelContainer.getPanelOptions().getVolume()));
	}
	
	/**
	 * inicializa el psonido principal
	 */
	public void initPrincipalSound() {
		sound = new Sounds();
		try {
			sound.loopSound(Constants.SOUND_REGIST, 300);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
