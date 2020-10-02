package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class TestProperties {
	
	private ResourceBundle resourceBundle;
	public TestProperties() throws IOException {
		init();
	}

	private void init() throws IOException {
		 String languageSystem = System.getProperty("user.language");
	        if (languageSystem.equals("es")) {
	            new Locale("es", "CO");
	        }else{
	            new Locale("en", "GB");
	        } 
	    FileInputStream fis = new FileInputStream("src/propertiesMenuMessages/propertiesMenuMessages_en_GB.properties");
	    resourceBundle = new PropertyResourceBundle(fis);
//	    ResourceBundle rb = ResourceBundle.getBundle("src/propertiesMenuMessages/propertiesMenuMessages",locale);
		System.out.println(resourceBundle.getString("btnReturnMessage"));
//		resourceBundle.getString("btnMainMenuMessage");
//		resourceBundle.getString("btnRegistryMessage");
//		resourceBundle.getString("btnQuickPlayMessage");
//		resourceBundle.getString("btnOptionsMessage");
//		resourceBundle.getString("btnExitMessage");
//		resourceBundle.getString("btnLevel1Message");
//		resourceBundle.getString("btnLevel2Message");
//		resourceBundle.getString("btnVolumeMessage");
//		resourceBundle.getString("btnLanguageMessage");
//		resourceBundle.getString("btnHelpMessage");
//		resourceBundle.getString("txtHelpMessage");
//		resourceBundle.getString("btnSpanishMessage");
//		resourceBundle.getString("btnEnglishMessage");
		
	}
	public static void main(String[] args) throws IOException {
		new TestProperties();
	}
}

