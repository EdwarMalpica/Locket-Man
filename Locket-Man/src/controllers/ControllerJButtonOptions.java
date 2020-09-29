package controllers;

import java.awt.Color;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JWindow;

import backgroundGame.ConstanBackground;
import backgroundGame.JFrameBackGround;
import utilities.PropertiesManager;
import viewsGameMenus.JButtonOption;
import viewsGameMenus.JPanelMenu;
import viewsGameMenus.WindowMenu; 

public class ControllerJButtonOptions implements MouseListener{
	
	private static ControllerJButtonOptions myControllerJButtonOptions = null;
	private Window windowMenuCurrent;
	
	public ControllerJButtonOptions() {
		super(); 
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
		efectHover(1f, 0.2f, 0.6f, 10, false,(JButtonOption)e.getComponent());
			
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
			efectHover(0.5f, 1f, 0.03f, 10, true,(JButtonOption)e.getComponent());
		
		
	}
	

	@Override
	public void mouseExited(MouseEvent e) {
		efectHover(1f, 0.5f, 0.03f, 10, false,(JButtonOption)e.getComponent());	
	}
	
	private void efectHover(float index, float range, float cont, int sleep, boolean event,JButtonOption jButtonOption) {
		new Thread(() -> {
			for (float i = index; (event) ? i <= range : i >= range; i = (event) ? i + cont : i - cont) {
				jButtonOption.setOpacity(i);
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
				}

			}
		}).start();
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
		JPanelMenu a = (JPanelMenu)jButtonOption.getContainer();
		WindowMenu b = (WindowMenu)a.getContainer();
		b.dispose();		
	}
	
	/**
	 * Compara las opciones del menu de QuickPlay para jugar
	 * @throws InterruptedException 
	 */
	private void quickPlayFuction(JButtonOption jButtonOption) throws InterruptedException {
		JFrameBackGround jFrameBackGroundLevel;
		switch (jButtonOption.getName()) {
		case "btnLevel1":
			jFrameBackGroundLevel = new JFrameBackGround(ConstanBackground.PATH_BACKGROUND_LEVEL1_IMAGE);
			break;
		case "btnLevel2":
			jFrameBackGroundLevel = new JFrameBackGround(ConstanBackground.PATH_BACKGROUND_LEVEL2_IMAGE);
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
	 * Despliega el menu principal
	 */
	private void showMainMenu() {
		windowMenuCurrent = ConstanBackground.WINDOW_MAIN_MENU;
		windowMenuCurrent.setVisible(true);
	}
	
	/**
	 * Muestra la ventana del menu de juego rapido 
	 */
	private void showQuickPLayMenu() {
		windowMenuCurrent = ConstanBackground.WINDOW_MENU_QUICKPLAY;
		windowMenuCurrent.setVisible(true);
	}
	/**
	 * Muestra el menu de opciones
	 */
	private void showOptionMenu() {
		windowMenuCurrent =	ConstanBackground.WINDOW_MENU_OPTIONS;
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
		windowMenuCurrent =	ConstanBackground.WINDOW_LANGUAGE_MENU;
		windowMenuCurrent.setVisible(true);
	}
	/**
	 * Muestra el menu de ayuda
	 */
	private void showHelpWindow() {
		windowMenuCurrent = ConstanBackground.WINDOW_HELP_MENU;
		windowMenuCurrent.setVisible(true);
	}
	
	private void showRegistryWindow() {
		windowMenuCurrent = ConstanBackground.WINDOW_REGISTRY;
		windowMenuCurrent.setVisible(true);
	}
	
	/**
	 * Metodo para evaluar cargar los metodos de cargar el idioma
	 */
	private void setFuctionChangeIdiom(JButtonOption jButtonOption) {
		PropertiesManager propertiesManager = PropertiesManager.getPropertiesManager();
		ConstanBackground constanBackground = new ConstanBackground();
		switch (jButtonOption.getName()) {
		case "btnSpanish":
			propertiesManager.setSpanishLanguage();
			
			constanBackground.updateLanguage();
			break;
		case "btnEnglish":
			propertiesManager.setEnglishLanguage();
			constanBackground.updateLanguage();
			break;
		}
	}

}