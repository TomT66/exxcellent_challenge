package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.exxcellent.dataAnalysers.DataAnalyser;
import de.exxcellent.dataAnalysers.DataAnalyserImpl;
import de.exxcellent.fileReaders.CSVReader;
import de.exxcellent.fileReaders.ExxcellentReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

/**
 * Example JUnit4 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */

public class AppTest {
	
	static ArrayList<String[]> data;
	
	@BeforeAll
	public static void setUp() {
		ExxcellentReader csvrd = new CSVReader();
		data = csvrd.readfile("src/main/resources/de/exxcellent/challenge/weather.csv");
	}
	
	@Test
	public void weatherTest() {
		DataAnalyser wa = new DataAnalyserImpl();
		assertEquals("14", wa.findItemWithMinSpread(data,"MxT","MnT"), "right result");
	}
	
}