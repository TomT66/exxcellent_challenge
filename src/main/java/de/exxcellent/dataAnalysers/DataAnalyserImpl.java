package de.exxcellent.dataAnalysers;

import java.util.ArrayList;
import java.util.Arrays;


public class DataAnalyserImpl implements DataAnalyser{
	@Override
	public String findItemWithMinSpread(ArrayList<String[]> data, String v1, String v2) {
		// TODO Auto-generated method stub
		ArrayList<String[]> CSVData = data;
		int v1Index = Arrays.asList(CSVData.get(0)).indexOf(v1);
		int v2Index = Arrays.asList(CSVData.get(0)).indexOf(v2);
		CSVData.remove(0);
		int Distance = Math.abs(Integer.parseInt(CSVData.get(0)[v1Index]) - Integer.parseInt(CSVData.get(0)[v2Index]));
		CSVData.remove(0);
		String Result = "";
		for(String[] dataRow : CSVData) {
			if(Distance > Math.abs(Integer.parseInt(dataRow[v1Index]) - Integer.parseInt(dataRow[v2Index]))){
				Result = dataRow[0];
				Distance = Math.abs(Integer.parseInt(dataRow[v1Index]) - Integer.parseInt(dataRow[v2Index]));
			}
			else if(Distance == Math.abs(Integer.parseInt(dataRow[v1Index]) - Integer.parseInt(dataRow[v2Index]))) {
				Result = ", and " + dataRow[0];
			}
		}
		return Result;
	}
}
