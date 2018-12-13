package FreeCRMpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMproLogin {
	static WebDriver driver;
	public static void Login() {
		driver = new ChromeDriver();
		driver.get("https://www.crmpro.com");
		driver.manage().deleteAllCookies();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Kish533");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("#Rkishore1234");
		WebElement submitbutton = driver.findElement(By.xpath("//input[@value='Login']"));
		submitbutton.click();
	}
	public static void calenders() {
		driver.switchTo().frame("mainpanel");
		WebElement iframe = driver.findElement(By.className("mlddm"));
		/*List<WebElement> lis = iframe.findElements(By.tagName("a"));
		for(WebElement str : lis) {
			System.out.println(str.getText());*/
		try{
            for(int i=0;i<iframe.findElements(By.tagName("a")).size();i++) {
            if(iframe.findElements(By.tagName("a")).get(i).getText().contains("CALENDAR")){
	 			iframe.findElements(By.tagName("a")).get(i).click();}}}
		catch(StaleElementReferenceException e) {
             } }
    public static void months() {
		WebElement month = driver.findElement(By.name("slctMonth"));
		List<WebElement> monthnames = month.findElements(By.tagName("option"));
		System.out.println(monthnames.size());
		System.out.println("month names"+"    ");
       try{
			for(int j=0;j<month.findElements(By.tagName("option")).size();j++) {
            if(month.findElements(By.tagName("option")).get(j).getText().contains("January")){
			month.findElements(By.tagName("option")).get(j).click();}}}
catch(StaleElementReferenceException f) {
}}
    
    public static void years() {
		WebElement year = driver.findElement(By.name("slctYear"));
		List<WebElement> yearnum = year.findElements(By.tagName("option"));
		System.out.println(yearnum.size());
		System.out.println("yearss"+"    ");
       try{
			for(int k=0;k<year.findElements(By.tagName("option")).size();k++) {
            if(year.findElements(By.tagName("option")).get(k).getText().contains("2019")){
			year.findElements(By.tagName("option")).get(k).click();}}}
catch(StaleElementReferenceException j) {
}} 
public static void date() {

	WebElement datenum = driver.findElement(By.xpath("//td[@align='Center']"));
	List<WebElement> dates = datenum.findElements(By.tagName("td"));
	System.out.println(dates.size());
	System.out.println("yearss"+"    ");
   try{
		for(int l=0;l<datenum.findElements(By.tagName("td")).size();l++) {
        if(datenum.findElements(By.tagName("td")).get(l).getText().contains("20")){
		datenum.findElements(By.tagName("td")).get(l).click();}}}
catch(StaleElementReferenceException j) {
}}
	
	
	
	

    
    

}
