package com.uptc.LockeMan.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.uptc.LockeMan.persistence.FileReaderGame;

public class FilterResults {
	
	private FileReaderGame fileReaderGame;
	private  ArrayList<String> data;
	private  ArrayList<String> top5Player;
	Map<String, Integer> mapa = new HashMap<String, Integer>();
	private Map<String, Integer> sortedScores;
	
	
	public FilterResults() {
		fileReaderGame = new FileReaderGame("src/playerData/PlayerData.txt");
		init() ;
	}
	private void init() {
		data = fileReaderGame.readLines();
		top5Player = new ArrayList<String>();
		getTopFiveResults();
		splitDatas();
	}
	
	private void getTopFiveResults() { 
		int timeActualPlayer = 0;
		int timeTopPlayer;
		int count = 0;
		for (int i = 0; i < data.size(); i++) {
			if (top5Player.size()< 3) {
				top5Player.add(data.get(i));
			}else {
				for (int j = count; j < top5Player.size(); j++) {
					String[] playerData = data.get(i).split(",");
					timeActualPlayer = getTimeSeconds(playerData[2]);
					String[] playerDataTop = top5Player.get(j).split(",");
					timeTopPlayer = getTimeSeconds(playerDataTop[2]);
					if (timeActualPlayer<timeTopPlayer) {
						top5Player.remove(top5Player.get(j));
						top5Player.add(j,data.get(i));
						count++;
						break;
					}
					
				}
			}
			
		}
		
	}
	

	
	private int getTimeSeconds(String time) {
		int totalTime = 0;
		String[] time2 = time.split(":");
		int minutes = Integer.parseInt(time2[0]);
		int second = Integer.parseInt(time2[1]);
		totalTime = (minutes*60)+second;
		return totalTime;
	}
	
	
	
	/**
	 * @return the top5Player
	 */
	public ArrayList<String> getTop5Player() {
		return top5Player;
	}
	
	public void splitDatas() {
		for (int i = 0; i < top5Player.size(); i++) {
			String name = top5Player.get(i).split(",")[0] + top5Player.get(i).split(",")[1];
			int minutes = Integer.parseInt(top5Player.get(i).split(",")[2].split(":")[0]);
			int seconds = Integer.parseInt(top5Player.get(i).split(",")[2].split(":")[1].split(":")[0]);
			mapa.put(name, (minutes * 60) + seconds);
		}
		orderScore();
	}
	public void orderScore() {
		Map<String, Integer> sortedScores = mapa.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedScores.get(""));
	}
	
	
	
	public static void main(String[] args) {
		FilterResults filterResults = new FilterResults();
		
	}
	
	

}
