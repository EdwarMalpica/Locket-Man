package tests;

import backgroundGame.ConstanBackground;
import viewsGameMenus.WindowGame;
import viewsGameMenus.WindowMenu;
import viewsGameMenus.WindowRegistry;
import viewsGameMessages.WindowMessageGame;

public class TestWindowMenu {

	public static void main(String[] args) {
		//WindowGame a = new WindowMenu(ConstanBackground.TEXT_BUTTONS_MAIN_MENU,ConstanBackground.NAMES_BUTTONS_MAIN_MENU);
		//WindowGame a = new WindowMessageGame("Help",ConstanBackground.TEXT_HELP_OPTION);
		WindowGame a = new WindowRegistry();
		a.setVisible(true);
	}
}
