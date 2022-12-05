package org.example;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(final String[] args) {
        /**
         * This Jobs is for the validation
         */
        System.setProperty("webdriver.chrome.driver",
            "C://Projects//Drivers//chromedriver.exe");
        //Accept No of elements to be added.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No of Elements to be added:");
        int noOfElements = in.nextInt();
        System.out.println("No of Elements to be added:" + noOfElements);
        // Navigates to rge internet
        WebDriver dr = new ChromeDriver();
        dr.navigate().to("https://the-internet.herokuapp.com");
        //Add N number of Elements to page
        dr.findElement(
            By.xpath("//a[@href='/add_remove_elements/']")).click();
        for (int i = 0; i < noOfElements; i++) {
            dr.findElement(
                By.xpath("//button[text()=\"Add Element\"]")).click();
        }
        // Asserts that n of elements exists
        List<WebElement> elms =
            dr.findElements(By.xpath("//button[text()=\"Delete\"]"));
        Assert.assertEquals(noOfElements, elms.size());
        dr.quit();

    }

}
