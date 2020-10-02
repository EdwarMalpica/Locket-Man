/**
 * @App Locket-Man
 * @Author Edwar Steveen Malpica
 * @Date 1 oct. 2020
 * @Version 1.00
 * @clase ReadJSonLevels.java
 */
package com.uptc.LockedMan.persistence;

import java.awt.Rectangle;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.model.Level;

/**
 * @author eduar
 *
 */
public class ReadJSonLevels {
	
	private static ReadJSonLevels jSonLevels;

	private JSONParser parser;
	private JSONObject jsonObject;
	private JSONArray array;
	private ArrayList<Level> levels;
	
	public static ReadJSonLevels getInstanceOf() {
		if(jSonLevels == null) {
			jSonLevels = new ReadJSonLevels();
		}
		
		return jSonLevels;		
	}

	private ReadJSonLevels() {
		parser = new JSONParser();
		
		try {
			
			Object obj = parser.parse(new FileReader(getClass().getResource("../../../.."+Constants.PATH_SOURCES_LEVEL_BUILD).getPath()));
			jsonObject = (JSONObject) obj;
			array = (JSONArray) jsonObject.get("Niveles");
			getLevels();
		} catch (IOException | ParseException e) {
			System.out.println("No se pudo leer");
		}
		
	}
	
	
	public ArrayList<Level> getLevels() {
		ArrayList<Rectangle> floor = null;
		ArrayList<Rectangle> obstaculos = null;
		
		
		JSONArray jsonArray ;
		JSONObject js;
		
		for (int i = 0; i<array.size();i++) {
			floor = new ArrayList<Rectangle>();
			obstaculos = new ArrayList<Rectangle>();
			
			jsonObject = (JSONObject) array.get(i);
			//System.out.println(jsonObject.toString());
			jsonArray = (JSONArray) jsonObject.get("Nivel");
			
			JSONArray jsA2 = null ;
			JSONObject jsO2 = null;
			JSONArray jsA3 = null;
			JSONObject jsO3 = null;
			for(int j = 0; j< jsonArray.size();j++) {
				js = (JSONObject) jsonArray.get(j);
				if(j==0) {
					jsA2 = (JSONArray) js.get("Piso");
				}
				if(j==1) {
					jsA3 = (JSONArray) js.get("Obstaculos");
				}
	
				
			}
			JSONArray jsA4 = null;
			
			for(int w = 0; w<jsA2.size();w++) {
				jsO2 = (JSONObject) jsA2.get(w);
				jsA4 = (JSONArray) jsO2.get("Rectangulo");
				int x = 0,y=0,width=0,height = 0;
				for(int z = 0;z< jsA4.size();z++) {
					
					if(z==0) {
						jsO3 = (JSONObject) jsA4.get(z);
						x = Integer.parseInt(jsO3.get("x").toString());
					}else if(z==1) {
						jsO3 = (JSONObject) jsA4.get(z);
						y = Integer.parseInt(jsO3.get("y").toString());
					}else if(z==2) {
						jsO3 = (JSONObject) jsA4.get(z);
						width = Integer.parseInt(jsO3.get("width").toString());
					}else if(z==3) {
						jsO3 = (JSONObject) jsA4.get(z);
						height = Integer.parseInt(jsO3.get("height").toString());
					}
				}
				floor.add(new Rectangle(x, y, width, height));
			}
			for(int w = 0; w<jsA2.size();w++) {
				jsO3 = (JSONObject) jsA3.get(w);
				jsA4 = (JSONArray) jsO2.get("Rectangulo");
				int x = 0,y=0,width=0,height = 0;
				for(int z = 0;z< jsA4.size();z++) {
					
					if(z==0) {
						jsO3 = (JSONObject) jsA4.get(z);
						x = Integer.parseInt(jsO3.get("x").toString());
					}else if(z==1) {
						jsO3 = (JSONObject) jsA4.get(z);
						y = Integer.parseInt(jsO3.get("y").toString());
					}else if(z==2) {
						jsO3 = (JSONObject) jsA4.get(z);
						width = Integer.parseInt(jsO3.get("width").toString());
					}else if(z==3) {
						jsO3 = (JSONObject) jsA4.get(z);
						height = Integer.parseInt(jsO3.get("height").toString());
					}
				}
				obstaculos.add(new Rectangle(x, y, width, height));
			}
			levels.add(new Level(floor, obstaculos));
		}
		return levels;
	}
	
	
	
	public static void main(String[] args) {
		new ReadJSonLevels();
	}
}
