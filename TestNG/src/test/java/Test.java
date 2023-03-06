import Utils.Chromerunner;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test extends Chromerunner {
    @org.testng.annotations.Test
    public void eeTest() {

        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible, Duration.ofMillis(5000));
        $(By.id("firstName")).setValue("Mate").shouldNotBe(Condition.empty);
        $(By.id("lastName")).setValue("Bukia").shouldNotBe(Condition.empty);
        $(By.id("email")).setValue("bukia@gmail.com").shouldNotBe(Condition.empty);
        $(By.id("password")).setValue("Mate123").shouldNotBe(Condition.empty);
        $(By.id("confirmPassword")).setValue("Mate123").shouldNotBe(Condition.empty);
        $(By.id("singup")).shouldNotBe(Condition.disabled);
    }
}
