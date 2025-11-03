package com.apm;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstDemo {
	AndroidDriver driver;
	@BeforeTest
public void test() throws MalformedURLException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("tanvi");
	options.setApp("D:\\Selenium\\apk file\\ApiDemos-debug.apk");
	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
}
	public void drag(WebElement source) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 619,
			    "endY", 560
			));
	}
	

}
