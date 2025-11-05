package com.apm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends FirstDemo {

	@Test
	public void swipe() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]"));
		swipeAction(ele, "left");
	}
}
