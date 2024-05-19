package Page.ObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_pageObject extends Pages
{
	public Search_pageObject(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id = "APjFqb")
	WebElement Searchbox;

	public void Search()
	{
		setTextElementText(Searchbox, "Test Data");
	}
}




