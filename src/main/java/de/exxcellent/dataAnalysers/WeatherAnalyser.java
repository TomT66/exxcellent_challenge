package de.exxcellent.dataAnalysers;

import java.util.ArrayList;

import de.exxcellent.fileReaders.CSVReader;
import de.exxcellent.fileReaders.ExxcellentReader;


public class WeatherAnalyser implements DataAnalyser{

	@Override
	public String findItemWithMinSpread() {
		// TODO Auto-generated method stub
		ExxcellentReader rdr = new CSVReader();
		ArrayList<String[]> weatherData = rdr.readfile("src/main/resources/de/exxcellent/challenge/weather.csv");
		int tmpSpread = Integer.parseInt(weatherData.get(0)[1]) - Integer.parseInt(weatherData.get(0)[2]);
		String dayResult = "";
		for(String[] dayWeather : weatherData) {
			if(tmpSpread > (Integer.parseInt(dayWeather[1]) - Integer.parseInt(dayWeather[2]))){
				dayResult = dayWeather[0];
				tmpSpread = Integer.parseInt(dayWeather[1]) - Integer.parseInt(dayWeather[2]);
			}
			else if(tmpSpread == (Integer.parseInt(dayWeather[1]) - Integer.parseInt(dayWeather[2]))) {
				dayResult = ", and " + dayWeather[0];
			}
		}
		return dayResult;
	}
}
