package org.example;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Projects//Drivers//chromedriver.exe");
        //Accept No of elements to be added.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No of Elements to be added:");
        int N = in.nextInt();
        System.out.println("No of Elements to be added:" +N);
        // Navigates to rge internet
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com");
        //Add N number of Elements to page
        driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
        for (int i = 0;i< N; i++){
            driver.findElement(By.xpath("//button[text()=\"Add Element\"]")).click();
        }
        // Asserts that n of elements exists
        List<WebElement> elmts = driver.findElements(By.xpath("//button[text()=\"Delete\"]"));
        Assert.assertEquals(N,elmts.size());
        driver.quit();
    }
}