package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/ConfigProperties/Config.properties";

	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at config file path " + propertyFilePath);
		}
	}

	private static String browserType=null;
	
//	public static void setBrowserType(String browser) {
//		browserType=browser;
//	}
//	
//	public static String getBrowserType()throws Throwable {
//		//String browser = properties.getProperty("browser");
//		LoggerLoad.info("Get property BrowserType");
//		if (browserType != null)
//			return browserType;
//		else
//			throw new RuntimeException("browser not specified in the config.properties file.");
//	}
	
	public static String getBrowserType()throws Throwable {
String browser = properties.getProperty("browser");
		LoggerLoad.info("Get property BrowserType");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the config.properties file.");
	}

	public static String getPortalUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}

	public static String getHomeUrl() {
		String url = properties.getProperty("homeUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Homeurl not specified in the Configuration.properties file.");
	}
	
	// Array 
	public static String getArrayUrl() {
		String url = properties.getProperty("arrayurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Array url not specified in the Config.properties file.");
	}

	public static String getArrayinPythonUrl() {
		String url = properties.getProperty("arraypythonurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Arrays in Python url not specified in the Config.properties file.");
	}

	public static String getArrayListUrl() {
		String url = properties.getProperty("arraylisturl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Array in List url not specified in the Config.properties file.");
	}

	public static String getArrayBasicOpUrl() {
		String url = properties.getProperty("arraybasicopurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Basic Operation in List not specified in the Config.properties file.");
	}

	public static String getArrayApplicationUrl() {
		String url = properties.getProperty("arrayapplicationurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Applications of Array url not specified in the Config.properties file.");
	}

	public static String getArrayPracQnUrl() {
		String url = properties.getProperty("arraypracticeqnurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Array url not specified in the Config.properties file.");
	}

	public static String getTryEditorUrl() {
		String url = properties.getProperty("tryeditorurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Try Editor Url not specified in the Config.properties file.");
	}
//LinkedList
	
	public static String getLinkedListUrl() {
		String url = properties.getProperty("linkedlisturl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Linked List Url not specified in the Config.properties file.");
	}
	
	public static String getIntroductionUrl() {
		String url = properties.getProperty("introductionurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Introduction Url not specified in the Config.properties file.");
	}
	
	public static String getCreateLinkedListUrl() {
		String url = properties.getProperty("createlinkedlisturl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Create LinkedList  Url not specified in the Config.properties file.");
	}
	
	public static String getTypesLinkedListUrl() {
		String url = properties.getProperty("typeslinkedlisturl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Types of Linked List Url not specified in the Config.properties file.");
	}
	
	public static String getImplinkedListUrl() {
		String url = properties.getProperty("implinkedlisturl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Inplement Linked List in Python Url not specified in the Config.properties file.");
	}
	
	
}