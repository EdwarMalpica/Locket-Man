package com.uptc.LockeMan.controllers;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import com.uptc.LockeMan.backgroundGame.ConstanBackground;
import com.uptc.LockeMan.backgroundGame.JFrameBackGround;
import com.uptc.LockeMan.models.GameMatch;
import com.uptc.LockeMan.models.Player;
import com.uptc.LockeMan.persistence.FileWriterGame;
import com.uptc.LockeMan.utilities.LoaderWindow;
import com.uptc.LockeMan.utilities.PropertiesManager;
import com.uptc.LockeMan.viewsGameMenus.JButtonOption;
import com.uptc.LockeMan.viewsGameMenus.JFrameRegistry;
import com.uptc.LockeMan.viewsGameMenus.JPanelMenu;
import com.uptc.LockeMan.viewsGameMenus.WindowMenu; 

public class ControllerJButtonOptions implements MouseListener{
	
	private static ControllerJButtonOptions myControllerJButtonOptions = null;
	private Window windowMenuCurrent;
	private LoaderWindow loaderWindow;
	private FileWriterGame fileWriterGame;
	private Player player; 
	
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
			setRegistryFuction((JButtonOption)e.getComponent());

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
		case ConstanBackground.NAME_BUTTON_EXIT:
			exitFuction(jButtonOption);
			break;
		case ConstanBackground.NAME_BUTTON_QUICKPLAY:
			showQuickPLayMenu();
			break;
		case ConstanBackground.NAME_BUTTON_OPTIONS:
			showOptionMenu();
			break;			
		case ConstanBackground.NAME_BUTTON_REGISTRY:
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
		case ConstanBackground.NAME_BUTTON_LEVEL_1:
			jFrameBackGroundLevel = new JFrameBackGround(getClass().getResource(ConstanBackground.PATH_BACKGROUND_LEVEL1_IMAGE).getPath());
			break;
		case ConstanBackground.NAME_BUTTON_LEVE_2:
			jFrameBackGroundLevel = new JFrameBackGround(getClass().getResource(ConstanBackground.PATH_BACKGROUND_LEVEL2_IMAGE).getPath());
			jFrameBackGroundLevel .getjPanelBackground().getjLabelTimer().setForeground(Color.white);
			break;
		case ConstanBackground.NAME_BUTTON_RETURN:
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
	/**
	 * Volvemos a poner la fuente de menor tamaño
	 * @param jButtonOption
	 */
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
		case ConstanBackground.NAME_BUTTON_VOLUME:
			showTop3ResultsWindow();
		case ConstanBackground.NAME_BUTTON_LANGUAGE:
			 showWindowLanguageMenu();
			break;
		case ConstanBackground.NAME_BUTTON_HELP:
			showHelpWindow();
			break;
		case ConstanBackground.NAME_BUTTON_RETURN:
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
	private void showTop3ResultsWindow() {
		windowMenuCurrent = loaderWindow.getWindowTop3();
		//Poner el metodo addResults Para que cargue la matriz
		windowMenuCurrent.setVisible(true);
	}
	/**
	 * Muestra el menu de ayuda
	 */
	private void showHelpWindow() {
		windowMenuCurrent = loaderWindow.getWindowHelp();
		windowMenuCurrent.setVisible(true);
	}
	/**
	 * Muestra la ventana de registro, cierra la venta actual para mostrar la de registro
	 */
	
	private void showRegistryWindow() {
		windowMenuCurrent = loaderWindow.getWindow();
		windowMenuCurrent.setVisible(true);
	}
	
	/**
	 * Metodo para evaluar cargar los metodos de cargar el idioma
	 */
	private void setFuctionChangeIdiom(JButtonOption jButtonOption) {
		PropertiesManager propertiesManager = PropertiesManager.getPropertiesManager();
		switch (jButtonOption.getName()) {
		case ConstanBackground.NAME_BUTTON_SPANISH:
			propertiesManager.setSpanishLanguage();			
			loaderWindow.updateLanguageSpanish();
			showMainMenu();
			break;
		case ConstanBackground.NAME_BUTTON_ENGLISH:
			propertiesManager.setEnglishLanguage();
			loaderWindow.updateLanguageEnglish();
			showMainMenu();
			break;
		}
	}
	
	/**
	 * Funcion que realizara cuando haga click en el boton de aceptar 
	 * @param jButtonOption
	 */
	private void setRegistryFuction(JButtonOption jButtonOption) {
		if (jButtonOption.getName().equals(ConstanBackground.NAME_BUTTON_ACCEPT)) {
			JFrameRegistry jFrameRegistry = (JFrameRegistry) windowMenuCurrent;
			setPlayerRegistry(jFrameRegistry.getjTextField().getText());
			FileWriterGame  fileWriterGame = FileWriterGame.getFileWriterGame();
		}
		
	}
	
	/**
	 * Creamos el objeto jugador justo cuando se ejecute el boton de aceptar del registro
	 * @param userName
	 */
	private void setPlayerRegistry(String userName) {
		player = new Player(userName);
	}

	/**
	 * Escribe los resultados en el archivo de playerData
	 */
	private void writeResultFile(String userName,String levelName,String time) {
		FileWriterGame  fileWriterGame = FileWriterGame.getFileWriterGame();
		savePlayerResult(levelName,time);
		String data = userName+","+levelName+","+time;
		fileWriterGame.writeFile(data);
	}
	/**
	 * Guarda la partida en los datos del jugador 
	 * @param levelName
	 * @param time
	 */
	
	private void savePlayerResult(String levelName,String time) {
		ArrayList<GameMatch> listPlayerMatches = player.getGameMatchList();
		listPlayerMatches.add(new GameMatch(levelName, time));
	}
}
