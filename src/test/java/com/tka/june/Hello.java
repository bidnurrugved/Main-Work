package com.tka.june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Hello {

	public static void main(String[] args) {

	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.saucedemo.com/v1/index.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
	driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Mark");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Watson");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("95235");
	driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
	
	driver.findElement(By.cssSelector("#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button")).click();
	
	
//	driver.quit();	
		
	}
}
