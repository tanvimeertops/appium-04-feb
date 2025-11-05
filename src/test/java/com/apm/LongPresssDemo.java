package com.apm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPresssDemo extends FirstDemo {
	@Test
public void longPress() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]"));
		longPressAction(ele);
		String res=driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals("Sample menu", res);
}
}
