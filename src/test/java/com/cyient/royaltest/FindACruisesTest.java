package com.cyient.royaltest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.basetest.ParentTest;

@Test(priority = 2)

public class FindACruisesTest extends ParentTest {

	public void invalidtest() throws InterruptedException {
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='highlight__content']/..")).click();
		//driver.findElement(By.xpath("//div[@class='brand__logo-redirection']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Find a Cruise']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2021-2022 Cruises']")).click();
		
		driver.findElement(By.id("rciFirstName")).sendKeys("Dennis");
		driver.findElement(By.id("rciLastName")).sendKeys("Rich");
		driver.findElement(By.xpath("//select[@class='md-input']")).click();
		driver.findElement(By.xpath("//option[@value='IND']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();

		String actalValue= driver.findElement(By.id("rciEmailAddressMissing")).getText();
		Assert.assertEquals( actalValue,"Missing Email Address");

	}
}
