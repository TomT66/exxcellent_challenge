/*package de.exxcellent.dataAnalysers;

import java.util.ArrayList;
import java.util.Arrays;

import de.exxcellent.fileReaders.CSVReader;
import de.exxcellent.fileReaders.ExxcellentReader;


public class WeatherAnalyser implements DataAnalyser{

	public String findItemWithMinSpread(String url, String v1, String v2) {
		// TODO Auto-generated method stub
		ExxcellentReader rdr = new CSVReader();
		ArrayList<String[]> weatherData = rdr.readfile("src/main/resources/de/exxcellent/challenge/weather.csv");
		int v1Index = Arrays.asList(weatherData.get(0)).indexOf(v1);
		int v2Index = Arrays.asList(weatherData.get(0)).indexOf(v2);
		weatherData.remove(0);
		
		int tmpSpread = Integer.parseInt(weatherData.get(0)[v1Index]) - Integer.parseInt(weatherData.get(0)[v2Index]);
		String dayResult = "";
		for(String[] dayWeather : weatherData) {
			if(tmpSpread > (Integer.parseInt(dayWeather[v1Index]) - Integer.parseInt(dayWeather[v2Index]))){
				dayResult = dayWeather[0];
				tmpSpread = Integer.parseInt(dayWeather[v1Index]) - Integer.parseInt(dayWeather[v2Index]);
			}
			else if(tmpSpread == (Integer.parseInt(dayWeather[v1Index]) - Integer.parseInt(dayWeather[v2Index]))) {
				dayResult = ", and " + dayWeather[0];
			}
		}
		return dayResult;
	}
}*/
