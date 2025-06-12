package com.tka.june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Attendance {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://javabykiran.com/jbkcrm/studentattendance/ODI5MzE1MzYwMDAw");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"studentattendance-form\"]/div/div[1]/div[2]/div/label/input")).click();
		driver.findElement(By.id("contactNumber")).sendKeys("8275359281");
		driver.findElement(By.name("submit")).click();
	}

}
