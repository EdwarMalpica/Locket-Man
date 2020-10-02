package tests;

import utilities.LoaderWindow;
import viewsGameMenus.WindowGame;


public class TestWindowMenu {

	public static void main(String[] args) {
		WindowGame a = LoaderWindow.getConstanBackground().getWindowMainMenu();
		//WindowGame a = new WindowMessageGame("Help",ConstanBackground.TEXT_HELP_OPTION);
		//JFrameRegistry a = new JFrameRegistry();
		//JPanelPrueba a  = new JPanelPrueba();
		a.setVisible(true);
		}

}
