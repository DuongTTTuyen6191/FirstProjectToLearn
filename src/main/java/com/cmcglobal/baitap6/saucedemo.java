package com.cmcglobal.baitap6;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class saucedemo {
        WebDriver driver;

        @BeforeEach
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }

        // Test Case 1: Valid login
        @Test
        public void testValidLogin() throws InterruptedException {
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            Thread.sleep(3000);
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            Thread.sleep(3000);
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(3000);
            // Assert that the user is redirected to the inventory page
            assertTrue(driver.getCurrentUrl().contains("inventory"));
        }

        // Test Case 2: Invalid login
        @Test
        public void testInvalidLogin() throws InterruptedException {
            driver.findElement(By.id("user-name")).sendKeys("abc");
            Thread.sleep(3000);
            driver.findElement(By.id("password")).sendKeys("abc");
            Thread.sleep(3000);
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(3000);

            // Assert that error message is displayed
            WebElement error = driver.findElement(By.cssSelector(".error-message-container"));
            assertTrue(error.isDisplayed());
        }

        // List all products on the inventory page
    }