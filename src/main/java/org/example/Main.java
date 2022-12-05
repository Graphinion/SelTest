package org.example;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Main {
    private Main() {

    }
    public static int executeRun(int noOfElements) {
        System.setProperty("webdriver.chrome.driver",
            "C://Projects//Drivers//chromedriver.exe");
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
         dr.quit();
        return elms.size();
    }
    /**.
     * This Jobs is for the validation
     * @param args is used to pass arguments
     */
      public static void main(final String[] args) {

        //Accept No of elements to be added.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No of Elements to be added:");
        int noOfElements = in.nextInt();
                // Navigates to rge internet
         int elementAdded= executeRun(noOfElements);
          System.out.println("No of Elements to be added:" + elementAdded);
    }


}
