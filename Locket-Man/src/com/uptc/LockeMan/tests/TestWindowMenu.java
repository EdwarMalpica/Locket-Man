package com.uptc.LockeMan.tests;

import java.awt.Window;

import com.uptc.LockeMan.backgroundGame.ConstanBackground;
import com.uptc.LockeMan.utilities.LoaderWindow;
import com.uptc.LockeMan.viewsGameMenus.JFrameRegistry;
import com.uptc.LockeMan.viewsGameMenus.JPanelPrueba;
import com.uptc.LockeMan.viewsGameMenus.WindowGame;
import com.uptc.LockeMan.viewsGameMenus.WindowMenu;
import com.uptc.LockeMan.viewsGameMessages.WindowMessageGame;

public class TestWindowMenu {

	public static void main(String[] args) {
		WindowGame a = LoaderWindow.getConstanBackground().getWindowMainMenu();
		//WindowGame a = new WindowMessageGame("Help",ConstanBackground.TEXT_HELP_OPTION);
		//JFrameRegistry a = new JFrameRegistry();
		//JPanelPrueba a  = new JPanelPrueba();
		a.setVisible(true);
		}

}
