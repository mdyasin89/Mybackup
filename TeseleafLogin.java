package week2.day2.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TeseleafLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		userName.sendKeys("Demosalesmanager");
		passWord.sendKeys("crmsfa");
		loginButton.click();
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		WebElement LeadsLink = driver.findElement(By.linkText("Leads"));
		LeadsLink.click();
		WebElement creaeLeadLink = driver.findElement(By.linkText("Create Lead"));
		creaeLeadLink.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		WebElement lasttName = driver.findElement(By.id("createLeadForm_lastName"));
		WebElement createLeadButton = driver.findElement(By.name("submitButton"));
		companyName.sendKeys("MycompanyNew");
		firstName.sendKeys("Mohamed");
		lasttName.sendKeys("Yasin");
		// createLeadButton.click();
		WebElement dropSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		dropSource.sendKeys("Cold Call");
		WebElement dropMarket = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select objMarket = new Select(dropMarket);
		objMarket.selectByIndex(2);

		WebElement dropIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));

		Select objIndustry = new Select(dropIndustry);
		objIndustry.selectByValue("IND_AEROSPACE");
		WebElement dropOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));

		Select objOwnership = new Select(dropOwnership);
		objOwnership.selectByVisibleText("Partnership");
		WebElement dropCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select objCurrency = new Select(dropCurrency);
		objCurrency.selectByVisibleText("ALL - Albanian Lek");
	}

}
