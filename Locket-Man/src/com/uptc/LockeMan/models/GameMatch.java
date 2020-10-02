package com.uptc.LockeMan.models;

public class GameMatch {
	
	private String levelName;//Nombre del nivel
	private String userTime;//Tiempo que tardo en susperar el nivel
	public GameMatch(String levelName, String userTime) {
		super();
		this.levelName = levelName;
		this.userTime = userTime;
	}
	/**Obtenemos el nombre del nivel
	 * @return the levelName
	 */
	public String getLevelName() {
		return levelName;
	}
	/**Obtenemos el timepo que tardo en superarlo
	 * @return the userTime
	 */
	public String getUserTime() {
		return userTime;
	}
	/** Seteamos el nombre del nivel
	 * @param levelName the levelName to set
	 */
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	/**Establecemos el tiempo
	 * @param userTime the userTime to set
	 */
	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}

	
}
