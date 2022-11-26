package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
  private final ISymptomReader reader;
  private final ISymptomWriter writer;

  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;
  }

  /**
  * extract symptoms from file and return it.
  * 
  * @return list of symptoms
  */
  public List<String> getSymptoms() {
    return this.reader.getSymptoms();
  }

  /**
  * Sort symptoms method.
  * 
  * @params list of symptoms
  * @return a map of sorted Symptoms
  */
  public Map<String, Integer> sortSymptoms(List<String> symptoms) {
    Map<String, Integer> result = new TreeMap<>();

    symptoms.forEach(symptom -> result.put(symptom, result.getOrDefault(symptom, 0) + 1));

    return result;
  }

  /**
  * Write sympton in result.out file.
  * 
  * @params list of sorted symptoms
  */
  public void writeSymptoms(Map<String, Integer> symptoms) {
    this.writer.writeSymptoms(symptoms);
  }
}