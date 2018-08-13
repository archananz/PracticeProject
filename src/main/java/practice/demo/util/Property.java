package practice.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum Property {

	TEST_APPLICATION_URL("url");
	
	private final String key;
	
	Property(final String key){
		this.key = key;			
	}
	
	public String get() {	
		Properties properties = new Properties();
		try  {
		InputStream ins = Property.class.getClassLoader().getResourceAsStream("default.properties");		
			properties.load(ins);
			//ins.close();
		} catch (IOException e) {
			 throw new RuntimeException("Unable to load properties file");			
		}
		
		String value = (String) properties.get(this.key);
		
		if(value == null) {
			throw new IllegalArgumentException("No value found for " + this.key);
		}
      return value;
		
	}
}
