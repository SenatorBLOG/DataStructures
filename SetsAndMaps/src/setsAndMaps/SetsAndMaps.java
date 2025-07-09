package setsAndMaps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SetsAndMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "testwords.txt";
		
		//read words from file
		List<String> words = readWords(fileName);
		
		//count words in file
		int totalWords = countTotalWords(words);
		
		//count word frequency
		Map<String, Integer> freqMap = countFreq(words);
		
		//display total number of words
		displayTotalWords(totalWords);
		
		//display total frequency
		displayFreq(freqMap);
		
	}

	private static void displayFreq(Map<String, Integer> freqMap) {
		Map<String,Integer> toSort = new TreeMap<>(freqMap);
		for (Map.Entry<String, Integer> entry : toSort.entrySet()) {
            System.out.printf("%-15s : %d%n", entry.getKey(), entry.getValue());
        }
		
	}

	private static void displayTotalWords(int totalWords) {
		System.out.println("The total number of words " + totalWords);
		
	}

	private static Map<String, Integer> countFreq(List<String> words) {
		Map<String, Integer> freqMap = new HashMap<>();
		for(String w : words) {
			freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
		}
		return freqMap;
	}

	private static int countTotalWords(List<String> words) {		
		return words.size();
	}

	private static List<String> readWords(String fileName) {
		List<String> words = new ArrayList<>();
		try(BufferedReader bf = new BufferedReader(new FileReader(fileName))){
			String st;
			while ((st = bf.readLine()) != null) {
                String[] tokens = st.split("\\W+");
                for (String token : tokens) {
                    String w = (token).trim().toLowerCase();
                    if (!w.isEmpty()) {
                        words.add(w);
                    }
                }
            }
			
		}catch (IOException e){
			System.out.println("Error while reading a file " + e.getMessage());
		}
		
		return words;
	}

}
