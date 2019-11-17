package de.exxcellent.fileReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader implements ExxcellentReader{

	@Override
	public ArrayList<String[]> readfile(String path) {
		// TODO Auto-generated method stub
		ArrayList<String[]> result = new ArrayList<String[]>();
		try {
			BufferedReader rdr = new BufferedReader(new FileReader(path));
			String tempString;
			rdr.readLine();
			while((tempString = rdr.readLine()) != null) {
				result.add(tempString.split(","));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
