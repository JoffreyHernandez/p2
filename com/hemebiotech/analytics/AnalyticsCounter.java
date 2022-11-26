package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.List;

public class AnalyticsCounter {
	private ISymptomReader reader;
	private ISymptomWriter writer;
	private static int pupilCount = 0;
	
	public static void main(String args[]) throws Exception { 
	}

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	public List<String> getSymptoms() { 
		return this.reader.getSymptoms();
	}

	public Map<String, Integer> countSymptoms(List<String> symptoms) { 
	}

	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 
		Map<String, Integer> result = new TreeMap<String, Integer>();
		
		try {
			System.out.printf("Reading symptoms file : %s.%n", filepath);
			
			BufferedReader reader = new BufferedReader (new FileReader(filepath));
			String line = reader.readLine();
			
			while (line != null) {
				result.put(line, result.getOrDefault(line, 0) + 1);
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			System.err.format("Failed to read the file : %s.%nShutting down application.%n", filepath);
			System.exit(1);
		}
		
		return result;
	}

	public void writeSymptoms(Map<String, Integer> symptoms) { 

	} 
}