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
		String Result = "";
		for(String[] teamData : CSVData) {
			if(Distance > Math.abs(Integer.parseInt(teamData[v1Index]) - Integer.parseInt(teamData[v2Index]))){
				Result = teamData[0];
				Distance = Math.abs(Integer.parseInt(teamData[v1Index]) - Integer.parseInt(teamData[v2Index]));
			}
			else if(Distance == Math.abs(Integer.parseInt(teamData[v1Index]) - Integer.parseInt(teamData[v2Index]))) {
				Result = ", and " + teamData[0];
			}
		}
		return Result;
	}
}
