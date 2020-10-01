package utilities;

import backgroundGame.ConstanBackground;
import viewsGameMenus.JFrameRegistry;
import viewsGameMenus.WindowMenu;
import viewsGameMessages.WindowMessageGame;

public class LoaderWindow {
	private static LoaderWindow myLoaderWindow;
	private static PropertiesManager propertiesManager = PropertiesManager.getPropertiesManager();

	public static LoaderWindow getConstanBackground() {
		if (myLoaderWindow == null) {
			myLoaderWindow = new LoaderWindow();
		}
		return myLoaderWindow;
	}

	public void updateLanguageEnglish() {
		propertiesManager.setEnglishLanguage();
		propertiesManager = PropertiesManager.getPropertiesManager();
	}

	public void updateLanguageSpanish() {
		propertiesManager.setSpanishLanguage();
		propertiesManager = PropertiesManager.getPropertiesManager();
	}

	public String[] getTextButtonsMainMenu() {
		String[] text = { propertiesManager.getBtnMainMenuMessagee(), propertiesManager.getBtnRegistryMessage(),
				propertiesManager.getBtnQuickPlayMessage(), propertiesManager.getBtnOptionsMessage(),
				propertiesManager.getBtnExitMessage() };
		return text;
	}

	public String[] getTextButtonsQuickPlayMenu() {
		String[] text = { propertiesManager.getBtnQuickPlayMessage(), propertiesManager.getBtnLevel1Message(),
				propertiesManager.getBtnLevel2Message(), propertiesManager.getBtnReturnMessage() };
		return text;
	}

	public String[] getTextButtonsOptionMenu() {
		String[] text = { propertiesManager.getBtnOptionsMessage(), propertiesManager.getBtnVolumeMessagee(),
				propertiesManager.getBtnLanguageMessage(), propertiesManager.getBtnHelpMessage(),
				propertiesManager.getBtnReturnMessage() };
		return text;
	}

	public String[] getTextButtonsLanguageMenu() {
		String[] text = { propertiesManager.getBtnLanguageMessage(), propertiesManager.getBtnSpanishMessage(),
				propertiesManager.getBtnEnglishMessage(), propertiesManager.getBtnReturnMessage() };
		return text;
	}

	public WindowMenu getWindowQuickPlay() {
		return new WindowMenu(getTextButtonsQuickPlayMenu(), ConstanBackground.NAME_BUTTONS_QUICKPLAY_MENU);
	}

	public WindowMenu getWindowOptions() {
		return new WindowMenu(getTextButtonsOptionMenu(), ConstanBackground.NAME_BUTTONS_OPTIONS_MENU);
	}

	public WindowMenu getWindowMainMenu() {
		return new WindowMenu(getTextButtonsMainMenu(), ConstanBackground.NAMES_BUTTONS_MAIN_MENU);
	}

	public WindowMenu getWindowLanguage() {
		return new WindowMenu(getTextButtonsLanguageMenu(), ConstanBackground.NAME_BUTTONS_LANGUAGE_MENU);
	}

	public WindowMessageGame getWindowHelp() {
		return new WindowMessageGame(propertiesManager.getBtnHelpMessage(), propertiesManager.getTxtHelpMessage());
	}

	public JFrameRegistry getWindow() {
		return new JFrameRegistry();
	}
	

		
		
		
		
		
	

}
