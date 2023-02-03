package Utilities;

import java.io.IOException;

public class FileReaderManager {
	// private empty constructor
				private FileReaderManager() {
					
				}
				
				// public static method
				public static FileReaderManager  getInstance() {
					FileReaderManager frm = new FileReaderManager();
					return frm;
				}
					
						
				//public non static method
				public FileReader getCrInstance() throws IOException {
					FileReader cr = new FileReader();
					return cr;
				
				}
	}	
		