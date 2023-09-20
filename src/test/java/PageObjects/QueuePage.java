package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.LoggerLoad;

public class QueuePage {

	WebDriver driver = new ChromeDriver();
	String queueurl = "https://dsportalapp.herokuapp.com/queue/";
	String impofqpython1url = "https://dsportalapp.herokuapp.com/queue/implementation-lists/";
	String impcolldq2url = "https://dsportalapp.herokuapp.com/queue/implementation-collections/";
    String impusingarray3url="https://dsportalapp.herokuapp.com/queue/Implementation-array/";
    String queueoperations4url = "https://dsportalapp.herokuapp.com/queue/QueueOp/";
	String editorurl = "https://dsportalapp.herokuapp.com/tryEditor";
	String qpracquesurl = "https://dsportalapp.herokuapp.com/queue/practice";
	
	LoggerLoad log = new LoggerLoad();
	

    
	// queuepage
	//(xpath = "//a[normalize-space()='Implementation of Queue in Python']")WebElement ImplementationQueuePythonLink;
//	@FindBy(xpath = "//a[@class='btn btn-info']")WebElement TryHereLink;

	//@FindBy(xpath = "//a[@href='implementation-collections']")WebElement ImpCollectionsDequeLink;
	//@FindBy(xpath = "//a[@href='Implementation-array']")WebElement ImpUsingArrayLink;
	//@FindBy(xpath = "//a[@href='QueueOp']")WebElement QueueOperationsLink;
	//@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement PracticeQuestionsLink;

//	@FindBy(xpath = "//div[@class='CodeMirror cm-s-default']")WebElement editorInput;
	//@FindBy(xpath = "//button[@type='button']")WebElement runButton;
//	@FindBy(id = "output")WebElement output;
	
	
//	public QueuePage() {
//
	//	PageFactory.initElements(driver, this);
	//}
	
	public void clickQueuePage() {
		driver.get(queueurl);
	}
	
	public void clickImplQueuePython() {
		driver.get(impofqpython1url);
	}
	
	public void clickImplQueueColl() {
		driver.get(impcolldq2url);
	}
	
	public void clickImplArray() {
		driver.get(impusingarray3url);
	}
	
	public void clickQueueOperations() {
		driver.get(queueoperations4url);
	}
	
	public void clickQueuePracticeQtns() {
		driver.get(qpracquesurl);
	}
	
	public void clickEditorUrl() {
			
			driver.get(editorurl);
			log.info(driver.getTitle());
	}
	
	public void clickRun() throws InterruptedException {
		Thread.sleep(2000);
		WebElement runButton = driver.findElement(By.xpath("//button[@type='button']"));

		runButton.click();
		System.out.println("This is run button output"+runButton);
	}
	
	
	public void runValidPythonCode() throws InterruptedException {
		//Thread.sleep(2000);
		//WebElement editorInput = driver.findElement(By.xpath("//div[@class='CodeMirror cm-s-default']"));
		//editorInput.sendKeys(ValidPythonCode);
		
		Thread.sleep(2000);
		WebElement editorInput = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div/div[6]"));
		editorInput.sendKeys("Hello");
		//runButton.click();
	}
	
   public void runInvalidPythonCode(String InvalidPythonCode) throws InterruptedException {
	   Thread.sleep(2000);
		WebElement editorInput = driver.findElement(By.xpath("//div[@class='CodeMirror cm-s-default']"));

	   editorInput.sendKeys(InvalidPythonCode);
		//runButton.click();
	}
   public void clickTryHere() {
		WebElement TryHereLink = driver.findElement(By.xpath("//a[@class='btn btn-info']"));

	   TryHereLink.click();
   }
   
   public void getDriverTitle() {
	   String Title = driver.getTitle();
	   System.out.println(Title);
   }
   
   public void getOutput() throws InterruptedException {
	   Thread.sleep(2000);
		WebElement output = driver.findElement(By.id("output"));
     	String outputtext = output.getText();
	   System.out.println(outputtext);
   }
   
   public void getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(errorMsg);
		
	}
   
}
