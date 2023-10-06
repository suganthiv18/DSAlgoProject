package PageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ConfigReader;
import Utilities.DriverFactory;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.AfterAll;

public class TreePage {
		public static WebDriver driver = DriverFactory.getdriver();
		String excelpath=ConfigReader.getExcelFilepPath();
		String treeurl="https://dsportalapp.herokuapp.com/tree/";
		String overviewoftrees="https://dsportalapp.herokuapp.com/tree/overview-of-trees/";
		String terminologiespage="https://dsportalapp.herokuapp.com/tree/terminologies/";
		String typesoftrees="https://dsportalapp.herokuapp.com/tree/types-of-trees/";
		String treetraversals="https://dsportalapp.herokuapp.com/tree/tree-traversals/";
		String traversalillustration="https://dsportalapp.herokuapp.com/tree/traversals-illustration/";
		String binarytrees="https://dsportalapp.herokuapp.com/tree/binary-trees/";
		String typesofbinarytrees="https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/";
		String ImplementationinPython="https://dsportalapp.herokuapp.com/tree/implementation-in-python/";
		String BinaryTreeTraversals="https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/";
		String ImplementationOfBinaryTrees="https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/";
		String ApplicationsOfBinaryTrees="https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/";
		String BinarySearchTrees="https://dsportalapp.herokuapp.com/tree/binary-search-trees/";
		String ImplementationOfBST="https://dsportalapp.herokuapp.com/tree/implementation-of-bst/";
		String homeUrl=ConfigReader.getHomeUrl();
		String qpracquesurl = ConfigReader.getPracQnLLUrl();
		String tryEditorUrl=ConfigReader.getTryEditorUrl();
		@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryHereElmnt;
		@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textEditorElmnt;
		@FindBy(xpath="//button[text()='Run']") WebElement runBtnElmnt;
		@FindBy(xpath="//input[@type='submit']") WebElement submitElmt ;
		@FindBy(xpath="//pre[@id='output']") WebElement outputElmnt;
		public TreePage() {
			PageFactory.initElements(driver, this);	
		}
		public void click_getstartedTree() {
			driver.get(treeurl);
		}
		public void click_OverviewofTree() {
			driver.get(overviewoftrees);
			
		}
		public void click_Terminologies() {
			driver.get(terminologiespage);
		}
		public void click_TypeOfTrees() {
			driver.get(typesoftrees);	
		}
		public void click_TreeTraversals() {
			driver.get(treetraversals);
		}
		public void click_TravelIllustrations() {
			driver.get(traversalillustration);
		}
		public void click_BinaryTree() {
			driver.get(binarytrees);
		}
		public void click_TypeOfBinaryTrees() {
			driver.get(typesofbinarytrees);
		}
		public void click_ImplementationInPython() {
			driver.get(ImplementationinPython);
		}
		public void click_BinaryTreeTraversal() {
			driver.get(BinaryTreeTraversals);
		}
		public void click_ImplementationOfBinaryTrees() {
		
			driver.get(ImplementationOfBinaryTrees);
		}
		public void click_ApplicationsOfBinaryTrees() {
			driver.get(ApplicationsOfBinaryTrees);
		}
		public void click_BinarySearchTrees() {
			driver.get(BinarySearchTrees);
		}
		public void click_ImplementationOfBst() {
			driver.get(ImplementationOfBST);
		}
		
		public void clickPracticeQnLink() {
			driver.get(qpracquesurl);
		}

		public void clickTryEditorLink() {
			driver.get(tryEditorUrl);
		}

		public String getTitle() {
			String str=driver.getCurrentUrl();
			return str;
		}

		public void clickTryHereBtn() {
			tryHereElmnt.click();
		}

		public void runPythonCode(String sheetname,int rownum) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> listPyCode= reader.getData(excelpath,sheetname);
		String code=listPyCode.get(rownum).get("code");
		System.out.println("code"+code);
		textEditorElmnt.sendKeys(code);
		}


		public void clickRunBtn() {
			runBtnElmnt.click();

		}
		public String getOutput() {
			return outputElmnt.getText();
		}

		public static String getErrorText() throws Throwable {
			String msg;

			Alert alert = driver.switchTo().alert();
			msg=alert.getText();

			Thread.sleep(2000);

			alert.accept();

			return msg;
		}
		
		public void clickSubmitBtn() {
			submitElmt.click();
		}
		
		public void txteditorclr() {
			String s = Keys.chord(Keys.CONTROL, "a");

			textEditorElmnt.sendKeys(s);
			textEditorElmnt.sendKeys(Keys.DELETE);
			
		}

	}
