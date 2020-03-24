import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Test {

    @org.junit.Test
    public void viewTheViewTatTelecomPage() {
        open("http://view.tattelecom.ru/");
        $(By.xpath("/html/body/div[3]/div/div/div[2]/a")).click();
        $(By.xpath("//*[@id=\"name\"]/div[1]/div/h2 ")).shouldBe(visible);
    }

    @org.junit.Test
    public void closeTheViewTatTelecomPage() {
        open("http://view.tattelecom.ru/");
        $(By.xpath("//*[@id=\"useful-information\"]/p/a")).click();
        $(By.xpath("/html/body/div/div[4]/div[8]/div/div[1]/h3")).shouldBe(visible);
    }

}
