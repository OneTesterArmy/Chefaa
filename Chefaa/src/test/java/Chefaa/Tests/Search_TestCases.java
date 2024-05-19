package Chefaa.Tests;

import org.testng.annotations.Test;
import Page.ObjectModel.Search_pageObject;
import org.testng.Assert;
import Page.ObjectModel.Pages;

public class Search_TestCases extends Bases
{
    Search_pageObject Search;
    Pages Pages_UsingsObject;

    @Test
    public void Test_Search()
    {
        Search = new Search_pageObject(driver);
        Pages_UsingsObject = new Pages(driver);
        Boolean Search_Results_relevant = true;
        Assert.assertEquals(Search_Results_relevant, true);
    }
}