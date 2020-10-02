package test;

import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderScores {
	
	String[] scores = {
			"jorge, nivel 1,20:30",
			"pepe, nivel 2,30:02",
			"andres, nivel 3,32:34",
			"jacinto, nivel 2,18:01"
			};
	
	Map<String, Integer> mapa = new HashMap<String, Integer>();
	
	public void splitDatas() {
		for (int i = 0; i < scores.length; i++) {
			String name = scores[i].split(",")[0] + scores[i].split(",")[1];
			int minutes = Integer.parseInt(scores[i].split(",")[2].split(":")[0]);
			int seconds = Integer.parseInt(scores[i].split(",")[2].split(":")[1].split(":")[0]);
			mapa.put(name, (minutes * 60) + seconds);
		}
		orderScore();
	}
	
	public void orderScore() {
		Map<String, Integer> sortedScores = mapa.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedScores);
	}
	
	public static void main(String[] args) {
		OrderScores score = new OrderScores();
		score.splitDatas();
	}

}
