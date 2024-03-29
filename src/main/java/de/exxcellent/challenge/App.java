package de.exxcellent.challenge;

import de.exxcellent.dataAnalysers.DataAnalyser;
import de.exxcellent.dataAnalysers.DataAnalyserImpl;
import de.exxcellent.fileReaders.CSVReader;
import de.exxcellent.fileReaders.ExxcellentReader;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
    	DataAnalyser fa = new DataAnalyserImpl();
    	ExxcellentReader csvrd = new CSVReader();

        String dayWithSmallestTempSpread = fa.findItemWithMinSpread(csvrd.readfile("src/main/resources/de/exxcellent/challenge/weather.csv"),"MxT","MnT");     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = fa.findItemWithMinSpread(csvrd.readfile("src/main/resources/de/exxcellent/challenge/football.csv"),"Goals","Goals Allowed"); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
