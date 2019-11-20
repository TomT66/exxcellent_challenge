package de.exxcellent.dataAnalysers;

import java.util.ArrayList;

public interface DataAnalyser {
	String findItemWithMinSpread(ArrayList<String[]> data, String v1, String v2);
}
