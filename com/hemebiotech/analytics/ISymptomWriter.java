package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public interface ISymptomWriter {
	void writeSymptoms(Map<String, Integer> symptoms);
}
