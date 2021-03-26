package com.cucumber.helper;

import java.io.IOException;

public class FileReadManager {
private FileReadManager() {
	
	
}
public static FileReadManager getInstance() {
	FileReadManager frm= new FileReadManager();
	return frm;
}
 public ConfigurationReader getCrInstance() throws IOException  {
	 ConfigurationReader cr = new ConfigurationReader();
	  return cr;
 } 
}
