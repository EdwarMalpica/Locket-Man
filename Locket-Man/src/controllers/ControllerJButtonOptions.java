package controllers;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import backgroundGame.ConstanBackground;
import backgroundGame.JFrameBackGround;
import utilities.LoaderWindow;
import utilities.PropertiesManager;
import viewsGameMenus.JButtonOption;
import viewsGameMenus.JPanelMenu;
import viewsGameMenus.WindowMenu; 

public class ControllerJButtonOptions implements MouseListener{
	
	private static ControllerJButtonOptions myControllerJButtonOptions = null;
	private Window windowMenuCurrent;
	private LoaderWindow loaderWindow;
	
	public ControllerJButtonOptions() {
		super(); 
		loaderWindow = new LoaderWindow();
	}
	
	
	
	public  static ControllerJButtonOptions getControllerJButtonOptions () {
		 if (myControllerJButtonOptions ==null) {		 
			 myControllerJButtonOptions = new  ControllerJButtonOptions();
		 }
		 return myControllerJButtonOptions;
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			setFuctionButtons((JButtonOption)e.getComponent());		
			quickPlayFuction((JButtonOption)e.getComponent());
			optionsMenuFuction((JButtonOption)e.getComponent());
			setFuctionChangeIdiom((JButtonOption)e.getComponent());
			System.out.println(e.getComponent().getName());

		} catch (InterruptedException e1) {
			
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		((JButtonOption) e.getComponent()).efectHover(1f, 0.2f, 0.6f, 10, false);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		((JButtonOption) e.getComponent()).efectHover(0.5f, 1f, 0.03f, 10, true);
			setAnimationSizeFontButtons((JButtonOption) e.getComponent());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		((JButtonOption) e.getComponent()).efectHover(1f, 0.5f, 0.03f, 10, false);	
		setOffAnimationSizeFontButtons((JButtonOption) e.getComponent());
	}
	
	
	
	
	
	private void setFuctionButtons(JButtonOption jButtonOption) {
		String btnName = jButtonOption.getName();
		switch (btnName) {
		case "btnExit":
			exitFuction(jButtonOption);
			break;
		case "btnQuickPlay":
			showQuickPLayMenu();
			break;
		case "btnOptions":
			showOptionMenu();
			break;			
		case "btnRegistry":
			showRegistryWindow();
		default:
			break;
		}
	}
	
	/**
	 * Se ejecutara solo cuando se presione el boton de salir, este cerrara la ventana que se este ejecutando
	 * @param jButtonOption
	 */
	private void exitFuction(JButtonOption jButtonOption) {
		System.exit(0);
	}
	
	/**
	 * Compara las opciones del menu de QuickPlay para jugar
	 * @throws InterruptedException 
	 */
	private void quickPlayFuction(JButtonOption jButtonOption) throws InterruptedException {
		JFrameBackGround jFrameBackGroundLevel;
		switch (jButtonOption.getName()) {
		case "btnLevel1":
			jFrameBackGroundLevel = new JFrameBackGround(getClass().getResource(ConstanBackground.PATH_BACKGROUND_LEVEL1_IMAGE).getPath());
			break;
		case "btnLevel2":
			jFrameBackGroundLevel = new JFrameBackGround(getClass().getResource(ConstanBackground.PATH_BACKGROUND_LEVEL2_IMAGE).getPath());
			jFrameBackGroundLevel .getjPanelBackground().getjLabelTimer().setForeground(Color.white);
			break;
		case "btnReturn":
			showMainMenu();
			break;
		default:
			break;
		}
	}
	
	/**
	 * Agranda los textos de los botones 
	 * @param jButtonOption
	 */
	private void setAnimationSizeFontButtons(JButtonOption jButtonOption) {
		jButtonOption.getjLabelTextButton().setAnimationByFontSize();
	}
	private void setOffAnimationSizeFontButtons(JButtonOption jButtonOption) {
		jButtonOption.getjLabelTextButton().setNormalFont();
	}
	
	/**
	 * Despliega el menu principal
	 */
	private void showMainMenu() {
		windowMenuCurrent = loaderWindow.getWindowMainMenu();
		windowMenuCurrent.setVisible(true);
	}
	
	/**
	 * Muestra la ventana del menu de juego rapido 
	 */
	private void showQuickPLayMenu() {
		windowMenuCurrent = loaderWindow.getWindowQuickPlay();
		windowMenuCurrent.setVisible(true);
	}
	/**
	 * Muestra el menu de opciones
	 */
	private void showOptionMenu() {
		windowMenuCurrent =	loaderWindow.getWindowOptions();
		windowMenuCurrent.setVisible(true);
	}
	/**
	 * Muestra la ventana de acuerdo a la opcion escogida para el menu de opciones
	 * @param jButtonOption
	 */
	
	private void optionsMenuFuction(JButtonOption jButtonOption) {
		switch (jButtonOption.getName()) {
		case "btnLanguage":
			 showWindowLanguageMenu();
			break;
		case "btnHelp":
			showHelpWindow();
			break;
		case "btnReturn":
			showMainMenu();
			break;
		default:
			break;
		}
	}
	/**
	 * Muestra la ventana del lenguage de menu
	 */
	private void showWindowLanguageMenu() {
		windowMenuCurrent =	loaderWindow.getWindowLanguage();
		windowMenuCurrent.setVisible(true);
	}
	/**
	 * Muestra el menu de ayuda
	 */
	private void showHelpWindow() {
		windowMenuCurrent = loaderWindow.getWindowHelp();
		windowMenuCurrent.setVisible(true);
	}
	
	private void showRegistryWindow() {
		windowMenuCurrent.dispose();
		windowMenuCurrent = loaderWindow.getWindow();
		windowMenuCurrent.setVisible(true);
	}
	
	/**
	 * Metodo para evaluar cargar los metodos de cargar el idioma
	 */
	private void setFuctionChangeIdiom(JButtonOption jButtonOption) {
		PropertiesManager propertiesManager = PropertiesManager.getPropertiesManager();
		switch (jButtonOption.getName()) {
		case "btnSpanish":
			propertiesManager.setSpanishLanguage();			
			loaderWindow.updateLanguageSpanish();
			showMainMenu();
			break;
		case "btnEnglish":
			propertiesManager.setEnglishLanguage();
			loaderWindow.updateLanguageEnglish();
			showMainMenu();
			break;
		}
	}

}
