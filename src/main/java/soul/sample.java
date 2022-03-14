package soul;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class sample {
	public static void main(String[] args) throws IOException {
		//WebDriverManager.chromedriver().setup();
	
	//WebDriver driver = new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	//driver.manage().window().maximize();
		File file = new File("C:\\soul\\xlsheet\\rishi sheet.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		
		
	Sheet sheet = workbook.getSheet("sheet 1");
		
	int Rows = sheet.getPhysicalNumberOfRows();
	System.out.println(Rows);

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}