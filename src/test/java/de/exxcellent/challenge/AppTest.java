package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.exxcellent.dataAnalysers.DataAnalyser;
import de.exxcellent.dataAnalysers.DataAnalyserImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example JUnit4 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */

public class AppTest {
	
	@Test
	public void weatherTest() {
		DataAnalyser wa = new DataAnalyserImpl();
		assertEquals("14", wa.findItemWithMinSpread("src/main/resources/de/exxcellent/challenge/weather.csv","MxT","MnT"), "right result");
	}
	
	@Test
	public void footballTest() {
		DataAnalyser fa = new DataAnalyserImpl();
		assertEquals("Aston_Villa", fa.findItemWithMinSpread("src/main/resources/de/exxcellent/challenge/football.csv","Goals","Goals Allowed"), "right result");
	}

}