package com.testing.pageObjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("/order-summary")

public class OrderSummaryPage extends BasePage{
    public static By SUMMARY_PAGE_TITLE = text("Your Basket");
    public static By PLACE_YOUR_ORDER_AND_PAY_BUTTON = ariaLabel("Complete your purchase");

    public void waitForPageToLoad(){
        getElement(SUMMARY_PAGE_TITLE).waitUntilVisible();
        logWeAreOnPage();
    }
}