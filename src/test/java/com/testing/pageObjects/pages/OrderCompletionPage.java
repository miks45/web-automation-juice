package com.testing.pageObjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("/order-completion/")
public class OrderCompletionPage extends BasePage{
    public static By ORDER_SUMMARY_TITLE = text("Thank you for your purchase!");

    public void waitForPageToLoad(){
        getElement(ORDER_SUMMARY_TITLE).waitUntilVisible();
        logWeAreOnPage();
    }

}