package com.tka.june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("bidnur.rugved@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.name("password")).sendKeys("Varadavyankatesh@2025");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".T-I.T-I-KE.L3")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.name("to")).sendKeys("265@thekiranacademy.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Thank You for Your Selenium Guidance");

		String message = """
				Hello Sagar Sir,

				I hope you're doing absolutely great.

				Thank you so much for teaching me Selenium testing so well.
				You have made it truly easier and enjoyable for us to understand.

				Regards,
				Rugved Bidnur
				""";

	
		driver.findElement(By.cssSelector("div[aria-label='Message Body']")).sendKeys(message);
		driver.findElement(By.cssSelector("div[aria-label*='Send']")).click();
		System.out.println("Email sent successfully!");
		Thread.sleep(3000);

	
		driver.quit();
	}
}
