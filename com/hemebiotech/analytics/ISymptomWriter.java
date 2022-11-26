package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public interface ISymptomWriter {

  /**
  * Write symptoms in result.out file.
  * 
  * @params list of symptoms
  */
  void writeSymptoms(Map<String, Integer> symptoms);
}
