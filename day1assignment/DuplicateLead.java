package week2.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        //enter the first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Edward");
        //enter the last name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Taylor");
        //enter first name local
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Edward");
        //enter department
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Prinicipal");
        //enter description
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Happy Learning");
        //enter email id
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("edward.taylor@gmail.com");
        //create button
        driver.findElement(By.name("submitButton")).click();
        //get the title of the resulting page.
        System.out.println("View Lead | opentaps CRM");
        driver.findElement(By.linkText("Duplicate Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
        //enter the first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Edwin");
        driver.findElement(By.name("submitButton")).click();

	}

}
