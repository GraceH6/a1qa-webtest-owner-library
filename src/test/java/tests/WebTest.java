package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest extends TestBase {
    @Test
    void openMainPage() {
        //запуск страницы
        open("");
        $(By.xpath("//h1")).shouldHave(text("Pure-play software testing company"));
        //клик по кнопке "Contact us"
        $(By.xpath("//a[@href='https://www.a1qa.com/contacts/'][@class='btn']")).click();
        $(By.xpath("//form[@class='contactsForm__fields']")).shouldBe(visible);
    }
}
