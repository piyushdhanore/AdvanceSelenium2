package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DwsCredientials {
	
	public static String dwsUrl(String Url) throws IOException {
		    Properties prop= new Properties();
			FileInputStream fis= new FileInputStream("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\com.crm.AdvanceSel\\\\ConfigFile\\\\DWSFile.properties");
			prop.load(fis);
		
			String url = prop.getProperty(Url);	
			return url;
	}
	public static String dwsUsername(String Username) throws IOException {
	    Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\com.crm.AdvanceSel\\\\ConfigFile\\\\DWSFile.properties");
		prop.load(fis);
	
		String username = prop.getProperty(Username);	
		return username;
}
	public static String dwsPassword(String Password) throws IOException {
	    Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\com.crm.AdvanceSel\\\\ConfigFile\\\\DWSFile.properties");
		prop.load(fis);
	
		String password = prop.getProperty(Password);
		return password;
}



}
