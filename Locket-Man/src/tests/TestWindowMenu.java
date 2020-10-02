package tests;

import java.awt.Window;

import backgroundGame.ConstanBackground;
import utilities.LoaderWindow;
import viewsGameMenus.JFrameRegistry;
import viewsGameMenus.JPanelPrueba;
import viewsGameMenus.WindowGame;
import viewsGameMenus.WindowMenu;
import viewsGameMessage.WindowMessageGame;

public class TestWindowMenu {

	public static void main(String[] args) {
		WindowGame a = LoaderWindow.getConstanBackground().getWindowMainMenu();
		//WindowGame a = new WindowMessageGame("Help",ConstanBackground.TEXT_HELP_OPTION);
		//JFrameRegistry a = new JFrameRegistry();
		//JPanelPrueba a  = new JPanelPrueba();
		a.setVisible(true);
		}

}
