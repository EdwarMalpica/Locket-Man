package com.uptc.LockeMan.models;

import java.util.ArrayList;

public class Player {
	
	private String userName;
	private ArrayList<GameMatch> gameMatchList;
	
	public Player(String userName) {
		this.userName = userName;
		gameMatchList = new ArrayList<GameMatch>();
	}
	
	

	/**Obtiene el nombre del usurario establecido en el registro
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**Seteamos el nombre del ususrio que ingreso al inicio de la aplicacion
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}



	/**
	 * @return the gameMatchList
	 */
	public ArrayList<GameMatch> getGameMatchList() {
		return gameMatchList;
	}
	
	
	

}
