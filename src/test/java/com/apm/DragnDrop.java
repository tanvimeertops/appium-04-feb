package com.apm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DragnDrop extends FirstDemo {

	@Test
	public void dnd() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		drag(source);
		String res=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(res, "Dropped!");
	}
}
