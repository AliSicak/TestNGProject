package team8_testngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team8_testngproject.utilities.Driver;

public class P17_VendorProductsDashboardPage {
    public P17_VendorProductsDashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }








    // 20.Satır --> Ali





























    // 50.Satır --> Esra





























    // 80.Satır --> Gonca





























    // 110.Satır --> Gürkay



























    // 140.Satır --> Hüseyin
    @FindBy(id = "add_new_product_dashboard") public WebElement addNewButtonHus;
    @FindBy(xpath = "//a[.='Harika Şapka']") public WebElement harikaSapkaHus;
    @FindBy(xpath = "(//a[text()='Futbol Topu2'])[1]") public WebElement futbolTopu2Hus;




























    // 170.Satır --> Mehmet
    @FindBy(id = "add_new_product_dashboard") public WebElement addNewButtonKoz;




























    // 200.Satır --> Meryem





























    // 230.Satır --> Zeliha





























    // 260.Satır --> Nurullah





























    // 290.Satır --> Ramazan





























    // 320.Satır --> Sevda





























    // 350.Satır --> Mustafa





























}
