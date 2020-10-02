package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;



public class PropertiesManager {

	private ResourceBundle resourceBundle;
	private static PropertiesManager myPropertiesManager;
	public static final String PATH_PROPERTIES_FILE_ES = "../resources/propertiesMenuMessages/propertiesMenuMessages_es_CO.properties";
	public static final String PATH_PROPERTIES_FILE_EN = "../resources/propertiesMenuMessages/propertiesMenuMessages_en_GB.properties";

	public PropertiesManager() {
		init();		
	}
	public static PropertiesManager getPropertiesManager () {
		 if (myPropertiesManager ==null) {		 
			 myPropertiesManager = new  PropertiesManager();
		 }
		 return myPropertiesManager;
	}
	
	private void init() {
		
		try {
			String languageSystem = System.getProperty("user.language");
			if (languageSystem.equals("es")) {
		
				FileInputStream fis = new FileInputStream(getClass().getResource(PATH_PROPERTIES_FILE_ES).getPath());
				resourceBundle = new PropertyResourceBundle(fis);
			} else {
				FileInputStream fis = new FileInputStream(getClass().getResource(PATH_PROPERTIES_FILE_EN).getPath());
				resourceBundle = new PropertyResourceBundle(fis);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setSpanishLanguage() {
		try {
			FileInputStream fis = new FileInputStream(getClass().getResource(PATH_PROPERTIES_FILE_ES).getPath());
			resourceBundle = new PropertyResourceBundle(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setEnglishLanguage() {
		try {
			FileInputStream fis = new FileInputStream(getClass().getResource(PATH_PROPERTIES_FILE_EN).getPath());
			resourceBundle = new PropertyResourceBundle(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getTxtName() {
		return resourceBundle.getString("txtName");
	}

	public String getBtnReturnMessage() {
		return resourceBundle.getString("btnReturnMessage");
	}

	public String getBtnMainMenuMessagee() {
		return resourceBundle.getString("btnMainMenuMessage");
	}

	public String getBtnRegistryMessage() {
		return resourceBundle.getString("btnRegistryMessage");
	}

	public String getBtnQuickPlayMessage() {
		return resourceBundle.getString("btnQuickPlayMessage");
	}

	public String getBtnOptionsMessage() {
		return resourceBundle.getString("btnOptionsMessage");
	}

	public String getBtnExitMessage() {
		return resourceBundle.getString("btnExitMessage");
	}

	public String getBtnLevel1Message() {
		return resourceBundle.getString("btnLevel1Message");
	}

	public String getBtnLevel2Message() {
		return resourceBundle.getString("btnLevel2Message");
	}

	public String getBtnVolumeMessagee() {
		return resourceBundle.getString("btnVolumeMessage");
	}

	public String getBtnLanguageMessage() {
		return resourceBundle.getString("btnLanguageMessage");
	}

	public String getBtnHelpMessage() {
		return resourceBundle.getString("btnHelpMessage");
	}

	public String getTxtHelpMessage() {
		return resourceBundle.getString("txtHelpMessage");
	}

	public String getBtnSpanishMessage() {
		return resourceBundle.getString("btnSpanishMessage");
	}

	public String getBtnEnglishMessage() {
		return resourceBundle.getString("btnEnglishMessage");
	}
	public String getBtnAceptMessage() {
		return resourceBundle.getString("btnAccept");
	}
	/**
	 * @return the resourceBundle
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
