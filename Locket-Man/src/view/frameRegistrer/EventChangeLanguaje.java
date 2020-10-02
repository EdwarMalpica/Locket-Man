package view.frameRegistrer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import constants.Constants;
import utilities.PropertiesManager;

public class EventChangeLanguaje implements ActionListener{
	
	private PropertiesManager propertiesManager;
	private PanelContainer panel;
	private JButtonPlay button;;
	private JLabel languaje;
	
	public static final String[] THIS_LANGUAJES = {"es", "en"};
	private int counterLanguaje = 0;

	/**
	 * Cambia el lenguaje del juego
	 * @param panel panel en donde se encuentra los labels de idioma a cambiar 
	 * @param properties propiedades del sistema
	 * @param button boton al cual cambiarle el icono
	 * @param languaje label del boton lenguaje
	 */
	public EventChangeLanguaje(PanelContainer panel, PropertiesManager properties, JButtonPlay button, JLabel languaje) {
		super();
		this.panel = panel;
		this.languaje = languaje;
		this.button = button;
		propertiesManager = properties;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		counterLanguaje++;
		
		if (counterLanguaje == THIS_LANGUAJES.length) {
			counterLanguaje = 0;
		}
		
		switch (THIS_LANGUAJES[counterLanguaje]) {
		case "en":
			button.setIcon(Constants.PATH_BUTTON_LANGUAGE_EN);
			propertiesManager.setEnglishLanguage();
			break;

		case "es":
			button.setIcon(Constants.PATH_BUTTON_LANGUAGE_ES);
			propertiesManager.setSpanishLanguage();
			break;
		}
		panel.updateAllTexts();
	}
}
