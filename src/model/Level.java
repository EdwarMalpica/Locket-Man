/**
 * @App Locket-Man
 * @Author Edwar Steveen Malpica
 * @Date 1 oct. 2020
 * @Version 1.00
 * @clase Level.java
 */
package model;

import java.awt.Rectangle;
import java.util.ArrayList;

/**
 * @author eduar
 *
 */
public class Level {

	private ArrayList<Rectangle> floor;
	private ArrayList<Rectangle> obstacles;
	/**
	 * @param floor
	 * @param obstacles
	 */
	public Level(ArrayList<Rectangle> floor, ArrayList<Rectangle> obstacles) {
		super();
		this.floor = floor;
		this.obstacles = obstacles;
	}
	
	
	
	/**
	 * @return el floor
	 */
	public ArrayList<Rectangle> getFloor() {
		return floor;
	}
	/**
	 * @param floor el floor a establecer
	 */
	public void setFloor(ArrayList<Rectangle> floor) {
		this.floor = floor;
	}
	/**
	 * @return el obstacles
	 */
	public ArrayList<Rectangle> getObstacles() {
		return obstacles;
	}
	/**
	 * @param obstacles el obstacles a establecer
	 */
	public void setObstacles(ArrayList<Rectangle> obstacles) {
		this.obstacles = obstacles;
	}
	
	
	
	
}
