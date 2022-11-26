package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

  /**
  * Main method.
  * 
  */
  public static void main(String[] args) {
    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writer = new WriteSymptomDataToFile();

    AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);

    List<String> symptoms = analyticsCounter.getSymptoms();

    Map<String, Integer> sortedSymptoms = analyticsCounter.sortSymptoms(symptoms);

    analyticsCounter.writeSymptoms(sortedSymptoms);
  }
}
