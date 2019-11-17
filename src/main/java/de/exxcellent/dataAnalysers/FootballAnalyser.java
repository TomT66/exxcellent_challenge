package de.exxcellent.dataAnalysers;

import java.util.ArrayList;
import java.util.Arrays;

import de.exxcellent.fileReaders.CSVReader;
import de.exxcellent.fileReaders.ExxcellentReader;


public class FootballAnalyser implements DataAnalyser{

	@Override
	public String findItemWithMinSpread(String v1, String v2) {
		// TODO Auto-generated method stub
		ExxcellentReader rdr = new CSVReader();		
		ArrayList<String[]> FootballData = rdr.readfile("src/main/resources/de/exxcellent/challenge/football.csv");
		int v1Index = Arrays.asList(FootballData.get(0)).indexOf(v1);
		int v2Index = Arrays.asList(FootballData.get(0)).indexOf(v2);
		FootballData.remove(0);
		int goalDistance = Math.abs(Integer.parseInt(FootballData.get(0)[v1Index]) - Integer.parseInt(FootballData.get(0)[v2Index]));
		String teamResult = "";
		for(String[] teamData : FootballData) {
			if(goalDistance > Math.abs(Integer.parseInt(teamData[v1Index]) - Integer.parseInt(teamData[v2Index]))){
				teamResult = teamData[0];
				goalDistance = Math.abs(Integer.parseInt(teamData[v1Index]) - Integer.parseInt(teamData[v2Index]));
			}
			else if(goalDistance == Math.abs(Integer.parseInt(teamData[v1Index]) - Integer.parseInt(teamData[v2Index]))) {
				teamResult = ", and " + teamData[0];
			}
		}
		return teamResult;
	}
}
