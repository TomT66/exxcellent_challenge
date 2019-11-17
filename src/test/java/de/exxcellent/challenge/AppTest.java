package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.exxcellent.dataAnalysers.DataAnalyser;
import de.exxcellent.dataAnalysers.FootballAnalyser;
import de.exxcellent.dataAnalysers.WeatherAnalyser;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example JUnit4 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */

public class AppTest {
	
	@Test
	public void weatherTest() {
		DataAnalyser wa = new WeatherAnalyser();
		assertEquals("14", wa.findItemWithMinSpread("MxT","MnT"), "right result");
	}
	
	@Test
	public void footballTest() {
		DataAnalyser fa = new FootballAnalyser();
		assertEquals("Aston_Villa", fa.findItemWithMinSpread("Goals","Goals Allowed"), "right result");
	}

}