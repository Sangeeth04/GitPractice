package com.Sangeeth.MavenProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
	
	@Test
	public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	

	}

}
