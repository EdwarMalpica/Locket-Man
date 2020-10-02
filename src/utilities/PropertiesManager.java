package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class PropertiesManager {

	private ResourceBundle resourceBundle;
	
	private static PropertiesManager myPropertiesManager;
	public static final String PATH_PROPERTIES_FILE_ES = "../resources/propertiesMenuMessages/propertiesMenuMessagesesCO.properties";
	public static final String PATH_PROPERTIES_FILE_EN = "../resources/propertiesMenuMessages/propertiesMenuMessagesenGB.properties";

	private PropertiesManager() {
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
				System.out.println(getClass().getResource("../").getPath());
				FileInputStream fis = new FileInputStream(getClass().getResource(PATH_PROPERTIES_FILE_ES).getPath());
				resourceBundle = new PropertyResourceBundle(fis);
			} else if(languageSystem.equals("in")){
				FileInputStream fis = new FileInputStream(getClass().getResource(PATH_PROPERTIES_FILE_EN).getPath());
				resourceBundle = new PropertyResourceBundle(fis);
			}else {
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
	
	
	
//--------------------------------------------------------------------------------------------------------------
// Ahora obtenemos los mensajes para el spash y el frame de inicio	
	
	public String getMessageWelcome() {
		return resourceBundle.getString("labelWelcome");
	}
	
	public String getMessageTo() {
		return resourceBundle.getString("letterA");
	}
	
	public String getMessageNamePlay() {
		return resourceBundle.getString("namePlay");
	}
	
	public String getMessageButtonOptions() {
		System.out.println( resourceBundle.containsKey("buttonOpcion"));
		return resourceBundle.getString("buttonOpcion");
	} 
	
	public String getMessagePlay() {
		return resourceBundle.getString("buttonPlay");
	}
	
	public String getMessageAbout() {
		return resourceBundle.getString("buttonAboutUs");
	}
	
	public String getExitMessage() {
		return resourceBundle.getString("exitButton");
	}
}
