package view.frameRegistrer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import constants.Constants;
import sound.Sounds;
import utilities.PropertiesManager;

public class EventCloseGame implements ActionListener{
	
	private PropertiesManager properties;
	private Sounds sound;

	public EventCloseGame(PropertiesManager properties) {
		super();
		sound = new Sounds();
		this.properties = properties;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		playSoundEffect();
		int confirm = JOptionPane.showConfirmDialog(null, properties.getExitMessage(), "Salir del juego", 1);
		if (confirm == 0) {
			System.exit(0);
		}
	}
	
	/**
	 * reproduce un efecto de click al presionar el boton
	 */
	public void playSoundEffect() {
		sound = new Sounds();
		sound.playSound(Constants.CLICK_SOUND, 1);
	}

}
