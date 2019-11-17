package de.exxcellent.dataAnalysers;

import java.util.ArrayList;

import de.exxcellent.fileReaders.CSVReader;
import de.exxcellent.fileReaders.ExxcellentReader;


public class FootballAnalyser implements DataAnalyser{

	@Override
	public String findItemWithMinSpread() {
		// TODO Auto-generated method stub
		ExxcellentReader rdr = new CSVReader();		
		ArrayList<String[]> FootballData = rdr.readfile("src/main/resources/de/exxcellent/challenge/football.csv");
		int goalDistance = Math.abs(Integer.parseInt(FootballData.get(0)[5]) - Integer.parseInt(FootballData.get(0)[6]));
		String teamResult = "";
		for(String[] teamData : FootballData) {
			if(goalDistance > Math.abs(Integer.parseInt(teamData[5]) - Integer.parseInt(teamData[6]))){
				teamResult = teamData[0];
				goalDistance = Math.abs(Integer.parseInt(teamData[5]) - Integer.parseInt(teamData[6]));
			}
			else if(goalDistance == Math.abs(Integer.parseInt(teamData[5]) - Integer.parseInt(teamData[6]))) {
				teamResult = ", and " + teamData[0];
			}
		}
		return teamResult;
	}
}
