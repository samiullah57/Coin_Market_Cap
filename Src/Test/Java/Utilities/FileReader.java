package Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public  class FileReader {
	public static Properties ps;
	public FileReader() throws IOException {
		File f =new File("C:\\Users\\anser\\eclipse-workspace\\CoinMarketProject\\src\\test\\java\\Resources\\Properties.txt");
		FileInputStream fis = new FileInputStream(f);
		 ps = new Properties();
		 ps.load(fis);	
		 
	}
	public String getBrowser() {
		String browserName = ps.getProperty("browsername");
		return browserName;
}
	public String getUrl() {
		String Url = ps.getProperty("url");
		return Url;
	
}
}	